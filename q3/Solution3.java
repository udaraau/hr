import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        int a; // Not used
        String s;
        String[] arr;
        Scanner in = new Scanner(System.in);
       
        a = Integer.parseInt(in.nextLine()); // Not used
        s = in.nextLine();

        int sum = Arrays.asList(s.split(" ")).stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}