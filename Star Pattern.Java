import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rows,col;
        for(rows=1;rows<=n;rows++){
            for(col=1;col<=rows;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
