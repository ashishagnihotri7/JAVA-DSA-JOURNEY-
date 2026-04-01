import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // QUACTION 1 PRINT YOUR NAME 
        //  System.out.println("ashish agnihotri");

        // QUACTION 2 TAKE INPUT FROM USER AND PRINT IT
        //  System.out.println("enter number 1");
        //  Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();
        //  System.out.println("enter second number");
        //  int b = sc.nextInt();
        //  System.out.println(a + " " + "\n" + b);

        // QUACTION 3 TAKE TWO NUMBER AS INPUT AND PRINT THEIR SUM
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number ");
        // int a = sc.nextInt();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        // int c = a + b;
        // System.out.println("the sum is "+c);

        //  FIND AREA OF CIRCLE
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter radious of circle");
        // double r = sc.nextDouble();
        // double area = 3.14 * r * r;
        // System.out.println("area is " + area);

        // PRINT FULL NAME USING STRING NEXTLINE
        // Scanner  sc = new Scanner(System.in);
        // System.out.println("enter your full name ");
        // String name = sc.nextLine();
        // System.out.println("your full name is " + name);

        // INPUT + OUTPUT (MY NAME IS ASHISH I AM 20 YEARS OLD) AND NAME AND AGE ARE TAKEN AS INPUT FROM USER
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter you name ");
        // String name = sc.next();
        // System.out.println("enter your age");
        // int age = sc.nextInt();
        // System.out.println("my name is " + name + " i am " + age + " years old");

        // SWAP 2 NUMBERS
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After swapping: a = " + a + ", b = " + b);
        //    DAY 2 
        // MAKE A CALCULATER USING SWITCH CASE IN JAVA
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        // System.out.println("enter operation + ,- ,* , % ");
        // char op = sc.next().charAt(0);
        // switch (op) {
        //     case '+':
        //         if (op == '+') {
        //             int c = a + b;
        //             System.out.println("the sum is " + c);
        //             break;
        //         }
        //     case '-':
        //         if (op == '-') {
        //             System.out.println("the difference is " + (a - b));
        //             break;
        //         }
        //     case '*':
        //         if (op == '*') {
        //             System.out.print("the product is " + (a * b));
        //             break;
        //         }
        //     case '%':
        //         if (op == '%') {
        //             System.out.println("THE REMAINDER IS " + (a % b));
        //             break;
        //         }
        //     }
        //  TAKE NUMBER FROM USER AND PRINT NUMBER IS POSITIVE OR NEGATIVE
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter number ");
        // int a = sc.nextInt();
        // if (a > 0) {
        //     System.out.println("number is positive");

        // } else if (a < 0) {
        //     System.out.println("number is negative");
        // }
        // else {
        //     System.out.println("number is zero");
        // }
        ////////////////////////////////////////////////////////
        //Q45. Grade System

        //  Marks input lo: 90+ → A 70–89 → B 50–69 → C <50 → Fail
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your number ");
        // int marks = sc.nextInt();
        // if (marks >= 90) {
        //     System.out.println("grade is A");
        // } else if (marks > 70 || marks < 90) {
        //     System.out.println("grade is b");

        // } else if (marks > 50 || marks < 70) {
        //     System.out.println("grade is c");
        // } else if (marks < 50) {
        //     System.out.println("you are fail");
        // }
        // else {
        //     System.out.println("invalid marks");
        // }
        /////////////////////////////////////////////
        // Q find largest of 3 number 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first number ");
        // int a = sc.nextInt();
        // System.out.println("enter a second number ");
        // int b = sc.nextInt();
        // if (a > b) {
        //     System.out.println("largest number is "+a);
        // }else{
        //     System.out.println("largest number is "+b);
        // }
        //////////////////////////////////////
        // Q FIND MAXIMUM OF THREE NUMBER 
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter first number ");
        // int a = sc.nextInt();
        // System.out.println("enter a second number ");
        // int b = sc.nextInt();
        // System.out.println("enter a third number ");
        // int c = sc.nextInt();
        // if (a > b && a > c) {
        //     System.out.println("largest number is " +a);
        // } else if (b > a && b > c) {
        //     System.out.println("largest number is " + b);

        // } else {
        //     System.out.println("largest number is " +c);
        // }
        //////////////////////////////////
        //                   QLEEP YEAR OR NOT 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a year ");
        // int year = sc.nextInt();
        // if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        //     System.out.println("it is a leap year " +year);
        // } else {
        //     System.out.println("it is not a leap year " + year);
        // }
        //////////////////////////////////////////
        // QCheck number is divisible by 5 & 11
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number ");
        // int number = sc.nextInt();
        // if (number % 5 == 0 && number % 11 == 0) {
        //     System.out.println("number is divisible by 5 and 11 = "  + number );
        // } else {
        //     System.out.println("not divisible by 5 and 11 = " + number);
        // }
        //////////////////////////////////////////////////////
        // Q find out smallest number among three number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter a second number ");
        int c = sc.nextInt();
        System.out.println("enter a third number ");
        int b = sc.nextInt();
        if (a < c && a < b) {
            System.out.println("smallest number is " + a);
        } else if (b < c && b < a) {
            System.out.println("smallest number is " + b);
        } else {
            System.out.println("smallest number is " + c);
        }
    }
}
            // day 2 ended here

