
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

//         //EVEN OR ODD(IF ELSE)
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
