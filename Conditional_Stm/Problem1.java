package Conditional_Stm;
import java.util.Scanner;

/**
 * Problem1
 * 1) MAX of 3 numbers
 * 2) Leap year or not
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 p=new Problem1();
       //p.maxNumbers();
       p.leapYears();
    }

    public void maxNumbers(){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println("Maximum is :"+num1);
        
        else if(num2>num3 && num2>num1)
            System.out.println("Maximum is :"+num2);
        
        else
            System.out.println("Maximum is :"+num3);
        /**
         * ANOTHER EFFICIENT WAY
         * int max=n1;
         * if(n2>max) max=n2;
         * if(n3>max) max=n3;
         * sysout(max);
         */
        }

        public void leapYears(){
            Scanner sc=new Scanner(System.in);
            int year=sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }

        public void checkForTriangle(){
            
        }
}