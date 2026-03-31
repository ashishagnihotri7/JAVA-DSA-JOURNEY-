                                       //  DAY 1 OF JS 

import java.util.Scanner;


public class learning_java {

    public static void main(String[] args) {
        ///////////////////////////////////////////////////////
        // System.out.println("hello world !");
        // System.out.println("welcome to java programming");
        //////////////////////////////////////////////////////
        // VARIABLES IN JAVA ;
    // String name = "ashu";
    // int age = 30;
    // String friend = "agnihotri";
    // String nabour = "ashish";
    ///////////////////////////////////////////////////
                                //  JAVA TYPES
                                
    // PRIMITIVE DATA TYPES IN JAVA BYTE -128 to 127 -1BIT, SHORT -32,768 to 32,767 2BIT, INT -2,147,483,648 to 2,147,483,647, LONG -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, FLOAT approximately 1.401298E-45 to 3.402823E+38, DOUBLE approximately 4.94066E-324 to 1.7976931348623157E+308, BOOLEAN true or false, CHAR a single Unicode character
    // byte age = 20; //1 bit 
    // short year = 2024; //2 bit
    // int population = 1234567890; //4 bits
    // long populationChaina = 12345678900L;// 8 bits
    // float pi = 3.14F; //4 bits
    // double e = 2.21223111111111D; //8 bits
    // boolean married = false; //1 bit    
    /////////////////////////////////////////////////////////////////////
                        //  NON PRIMITIVE DATA TYPES IN JAVA 
    
    // String name = "ashu"; // 16 bits
    //for printing the no. of characters in the string
    // System.out.println(name.length());
    // String name1 = new String("ashu");
    // System.out.println(name1.length());
    //////////////////////////////////////////////////////////////
                           //string concatenation ADDING TO STRING 

                        //    String name1 = "ashu";
                        //    String name2 = "agnihotri";
                        //    System.out.println(name1 + " " +name2);
                        //    String name3 = name1 + " " + name2;
                        //    System.out.println(name3);
///////////////////////////////////////////////////////////////////////////////////
                                    //   CHARAT IN STRING

                                    // String name = "ashu";
                                    // System.out.println(name.charAt(0)); //a
                                    // System.out.println(name.length()); // for length output 4
     ////////////////////////////////////////////////////////////////////////////////                               
                                    //   REPLACE IN STRING
    // String name = "ashu";
    // System.out.println(name.replace("a", "A"));//Ashu 
    ////////////////////////////////////////////////////////////////////////////////////////////////
                                    //  SUBSTRING IN STRING
// String name = "ashu and agnihotri";
// System.out.print(name.substring(0, 3));//ash
// System.out.print(name.substring(5, 9));//and
//////////////////////////////////////////////////////////////////////////////////
                                      //  SCANNER IN JAVA  FOR INT INPUT
//  System.out.println(" enter your luckey number");
//  Scanner sc = new Scanner(System.in);
//  int a = sc.nextInt();
//     System.out.println("your luckey number is " + a);
    //////////////////////////////////////////////////////////////////////////
                                 //  FOR ATRING INPUT 
    //   Scanner sc = new Scanner(System.in);
    //  System.out.print("enter name ");
    //  String name = sc.next();
    //  System.out.println(name);   /*note in this if you give input like this "ashu agnihotri" it will only print ashu because it takes input until space is there   */                         
     //////////////////////////////////////////////////////////////////////////////////////
     //                   FOR STRING INPUT WITH SPACE  we user 
  
    //  Scanner sc = new Scanner(System.in);
    //  System.out.print("enter name ");
    //  String name = sc.nextLine();
    // System.out.println("your name is " + name);   /*note in this if you give input like this "ashu agnihotri" it will print ashu agnihotri because it takes input until space is there   */
    ////////////////////////////////////////////////////////////////////////////////////////////////
                                   // TYPE CASTING IN JAVA IMPLICIT AND EXPLICIT TYPE CASTING
                                   // 1) IMPLICIT TYPE CASTING IN JAVA
                                   int a = 10;//4 bit
                                   double b = a; //8 bits
                                   System.out.println(b); //10.0
    }
}