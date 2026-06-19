import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
              int currentTermValue = a;
            
            for (int j = 0; j < n; j++) {
                // (1 << j) is a fast bitwise way to calculate 2^j
                currentTermValue += (1 << j) * b;
                
                // Print the term followed by a space
                System.out.print(currentTermValue + " ");
            }
            // Move to a new line after completing the series for the current query
            System.out.println();
        }
        in.close();
    }
}
