import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            //printing int with just 2 nums.
            System.out.printf("%-15s",s1);
            System.out.printf("%03d%-12s%n \n",x, "");
        }
        System.out.println("================================");

    }
}

