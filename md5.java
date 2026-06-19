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
                // Initialize the MD5 MessageDigest instance
                MessageDigest md = MessageDigest.getInstance("MD5");
                
                // Compute the hash bytes
                byte[] messageDigest = md.digest(s.getBytes());
                
                // Convert byte array into a hexadecimal string representation
                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigest) {
                    // Convert byte to hex format and pad with a leading zero if needed
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                }
                
                // Print the final 32-character hexadecimal MD5 hash
                System.out.println(hexString.toString());
                
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }
}
