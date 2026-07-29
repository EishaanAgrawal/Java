
// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int perimeter  = side * 4 ;

//         System.out.println("perimeter of sqaure is:"+ perimeter );

//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){
//         int A = 10;
//         int B = 5;
//         System.out.println("add="+(A+B));
//         System.out.println("diff=" +(A-B) );
//     }
 
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){
//         // int a = 10;
//         // int b = ++a;
//         // System.out.println(a);
//         // System.out.println(b);

//         //  int a = 10;
//         // int b = a++;
//         // System.out.println(a);
//         // System.out.println(b);

//         // int a = 10;
//         // int b= --a;
//         // System.out.println(a);
//         // System.out.println(b);

//         // int a = 10;
//         // int b= a--;
//         // System.out.println(a);
//         // System.out.println(b);

//         // int A = 10;
//         // int B = 9;
//         // System.out.println(A==B);

//         // int A = 10;
//         // int B = 10;
//         // System.out.println(A==B);
//     }
// }

// public class JavaBasics {
//     public static void main(String args[]){
       
//     }
// }

// public class JavaBasics {
//     public static void main(String args[]){
//         int A= 10;
//         int B= 5;
//         System.out.println(B>A);
//     }
// }


// public class JavaBasics{
//     public static void main(String args[]){
//         // LOGICAL OPERATIONS

//         System.out.println( (3>2) && (5>0) ); 
//         System.out.println( (3<2) && (5>0) );
//         System.out.println( (3<2) && (5<0) );

//         System.out.println( (3>2) || (5>0) );
//         System.out.println( (3<2) || (5>0) );
//         System.out.println( (3<2) || (5<0) );

//         System.out.println( !(0>5));

//         //ASSIGNMENT OPERATORS

//         int A = 10;
//         //A = A + 10;
//         A += 10;
//         int B = 5;
//         //B= B-5;
//         B -=5;
//         int C = 6;
//         // C = C*6
//         C*=6;
//         int D = 7;
//         // D = D/7
//         D /= 7 ;
//         int E = 9;
//         //E = E%9
//         E%= 9;
//         System.out.println(A);
//         System.out.println(B);
//         System.out.println(C);
//         System.out.println(D);
//         System.out.println(E);
//     }
// }

// import java.util.* ;
// public class Test {
//     public static void main(String args[]){
        // VOTING ELIGIBILITY        
        // int age = 22;
        // if (age >= 18){
        //     System.out.println("adult:drive,vote");
        // } 
        // else {
        //     System.out.println("not adult:can't drive,vote");


        //LARGE NUMBER
        // int A = 10;
        // int B = 20;
        // if (A>=B){
        //     System.out.println("A is greater");
        // }else {
        //     System.out.println("B is greater");
        // }

//         EVEN OR ODD(IF ELSE)
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
        
//         if (number % 2 == 0){
//             System.out.println("EVEN");
//         }else {
//             System.out.println("ODD");
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class Test {
//         public static void main(String args[]){
        //ELSE IF
        // int age = 13;
        // if (age >= 18){
        //     System.out.println("You are an adult.");
        // } 
        // else if (age >= 13 && age < 18) {
        //     System.out.println("You are a teenager.");
        // } 
        // else {
        //     System.out.println("You are a child.");
        // }

        //INCOME TAX CALCULATOR
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int Tax;
        // if (income < 500000) {
        //         Tax = 0;
        // } 
        // else if (income >= 500000 && income < 1000000) {
        //         Tax = (int)(income * 0.2);
        // } 
        // else {
        //         Tax = (int)(income * 0.3);
        // }
        // System.out.println("Tax is: " + Tax);
        // sc.close();

        //PRINT THE LARGEST OF THREE NUMBERS
        // int A=1, B=3, C=6;
        // if (A>=B && A>=C){
        //     System.out.println("A is largest");
        // } 
        // else if (B>=A && B>=C){
        //     System.out.println("B is largest");
        // } 
        // else {
        //     System.out.println("C is largest");
        // }
        //TERNARY OPERATOR
        // int number = 10;
        // String type = (number % 2 == 0) ? "EVEN" : "ODD";
        // System.out.println(type);

        //PASS FAIL TERNARY OPERATOR
        // int marks = 70;
        // String result = (marks >= 40) ? "PASS" : "FAIL";
        //     System.out.println(result);


        //SWITCH STATEMENT
        // int number = 2;
        // switch (number) {
        //     case 1:
        //         System.out.println("One");
        //         break;
        //     case 2:
        //         System.out.println("Two");
        //         break;
        //     case 3:
        //         System.out.println("Three");
        //         break;
        //     default:
        //         System.out.println("Invalid number");
        // }

        // CALCULATOR USING SWITCH STATEMENT
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = sc.nextInt();
        // System.out.println("Enter operator (+, -, *, /):");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+':
        //         System.out.println(num1 + num2);
        //         break;
        //     case '-':
        //         System.out.println(num1 - num2);
        //         break;
        //     case '*':
        //         System.out.println(num1 * num2);
        //         break;
        //     case '/':
        //         if (num2 != 0) {
        //             System.out.println(num1 / num2);
        //         } else {
        //             System.out.println("Error: Division by zero");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operator");
        // }
        // sc.close();
//     }
// }

//LOOPS CONCEPTS
// import java.util.* ;
// public class Test {
//     public static void main(String args[]){
// PRINT HELLO WORLD 100 TIMES        
// int counter =0;
// while(counter < 100) {
//     System.out.println("Hello World");
//     counter++;
//            }
//            System.out.println("Printed Hello World 100 times" );


// PRINT NUMBERS FROM 1 TO 10
// int counter = 1;
// while(counter <= 10) {
//     System.out.println(counter);
//     counter++;
//             }

        //PRINT NUMBERS FROM 1 TO n
        //  Scanner sc = new Scanner(System.in);
        //  int range = sc.nextInt();
        //  int counter = 1;

        // while(counter <= range) {
        //         System.out.print(counter + " ");
        // counter++;
        //         }

        // PRINT SUM OF FIRST n NATURAL NUMBERS
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int counter = 1;
        // while(counter <= n) {
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);

//FOR LOOP
        //Print Hello World 10 times using for loop
        // for(int counter = 1; counter <= 10; counter++) {
        //     System.out.println("Hello World");
        //}

        //Print Square pattern
        // for(int line =1; line <= 4; line++) {
        //     System.out.println("****");
        // }

        //Print Reverse of a number
        //n=10899
        // int n = 10899;
        // while(n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n /= 10;
        // }

        //BREAK STATEMENT
        // for(int i = 1; i <= 10; i++) {
        //     if(i == 5) {
        //         break; // Exit the loop when i is 5
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Loop exited at i = 5");

        //KEEP PRINTING UNTIL MULTIPLE OF 10 IS FOUND
        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.println("Enter a number:");
        //     int number = sc.nextInt();
        //     if(number % 10 == 0) {
        //         System.out.println("Multiple of 10 found: " + number);
        //         break; // Exit the loop when a multiple of 10 is found
        //     }
        // } while(true);

        //CONTINUE STATEMENT
        // for(int i = 1; i <= 10; i++) {
        //     if(i % 2 == 0) {
        //         continue; // Skip even numbers
        //     }
        //     System.out.println(i); // Print only odd numbers

        //DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10
        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.println("Enter a number (enter 0 to exit):");
        //     int number = sc.nextInt();
        //     if(number == 0) {
        //         break; // Exit the loop when user enters 0
        //     }
        //     if(number % 10 == 0) {
        //         continue; // Skip multiples of 10
        //     }
        //     System.out.println("You entered: " + number);
        // } while(true);

//         CHECK PRIME NUMBER
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if (number ==2) {
//             System.out.println(number + " is a prime number.");
//         } else{
//         boolean isPrime = true;
//         for(int i = 2; i <= Math.sqrt(number); i++) {
//         if(number % i == 0) {//n is a multiple of i(i is not equal to 1 and n)
//                 isPrime = false;
//             }
//         }
//         if(isPrime == true) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//       }    
//       }
//       }