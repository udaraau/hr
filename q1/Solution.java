import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i1 = 0, i2 = 0;
        boolean isContinue = true;
        
        do {
            try {
                i1 = input.nextInt();
                i2 = input.nextInt();
            
                System.out.println(i1/i2);
                isContinue = false; 
                
            }catch (ArithmeticException  ex){
                System.out.println(ex);
            }catch (InputMismatchException ex){
                String message = ex.toString().split(":")[0];
                System.out.println(message);
            }finally {
                isContinue = false;
            }
        }while (isContinue);
    }
}