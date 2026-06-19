import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.next();
            try {
                // Initialize the SHA-256 MessageDigest instance
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                
                // Compute the 32-byte hash array
                byte[] messageDigest = md.digest(s.getBytes());
                
                // Convert byte array into a 64-digit hexadecimal string
                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigest) {
                    // Convert signed byte to unsigned int format
                    String hex = Integer.toHexString(0xff & b);
                    // Add leading zero if the hex value is a single digit
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                }
                
                // Print the final 64-character hash value
                System.out.println(hexString.toString());
                
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }
}
