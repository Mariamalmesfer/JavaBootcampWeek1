import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        //Day 3 homework (loops)


        //EX1
        //Write a program that prints the numbers from 1 to 100 such that:
        //
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        System.out.println("EX1");

        int num1=1;
        while(num1 <=100){

            if (num1 % 3 == 0){
                System.out.println("Fizz");
            }
            if (num1 % 5 == 0){
                System.out.println("Buzz");
            }
            if (num1 % 3 == 0 && num1 % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else {

                System.out.println(num1);
            }

            num1++;
        }

        //EX2
        //Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT


        System.out.println("EX2");

        System.out.println("Input a string :");
        String str = data.nextLine();

        String rstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
           rstr += str.charAt(i);
        }

        System.out.println("Expected Output: " + rstr);



      //EX3
      // Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.


        System.out.println("EX3");

        System.out.println("Please input a positive integer");
        int num2=data.nextInt();

        while (num2 <0) {
                System.out.println("wrong number !!, please input a positive integer");
                num2=data.nextInt();}

        for(int i =0 ; i<10;i++){
            System.out.println(num2 + " X " + (i+1)+" = "+ (num2 * (i+1)));
        }

        //EX4
        // Write a program to find the factorial value of any number entered through the keyboard.

        System.out.println("EX4");


        int factorial =1;
        System.out.println("Please enter the number to get his factorial value");
        int num3=data.nextInt();

        for(int i=1 ; i <= num3; i++){
            factorial *= i;
        }

        System.out.println("the factorial for the number "+num3+" is "+factorial);




        //EX5
        // wo numbers are entered through the keyboard. Write a program to find the value of one number
        // raised to the power of another.  (Do not use Java built-in method)

        System.out.println("EX5");

        System.out.println("enter the first number");
        int num4=data.nextInt();
        System.out.println("enter the second number");
        int num5=data.nextInt();

        int x=1;

        for (int i =1 ; i<=num5;i++){

            x*=num4;
    }

      System.out.println(num4 + " to the power of " +num5 +" is "+ x);



        //EX6
        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.println("EX6");

        System.out.println("enter the integers to find the sum of the even and odd integers or 0 to exit");
        int num6=data.nextInt();

        int evens =0;
        int odds =0;

        while(num6 !=0){

            if (num6 % 2 == 0){
                evens+=num6;
            }else if(num6 % 2 != 0){
                odds+=num6;
            }

            System.out.println("enter the integers to find the sum of the even and odd integers or 0 to exit");
             num6=data.nextInt();


        }

        System.out.println("The sum of the even integers is " + evens);
        System.out.println("The sum of the odd integers is " + odds);


        //EX7
        // Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.

        System.out.println("EX7");

        System.out.println("Please input a positive integer");
        int num7=data.nextInt();

        while (num7 < 0) {
            System.out.println("wrong number !!, please input a positive integer");
            num7=data.nextInt();}

        int smallestprimenumber=2;

        while(smallestprimenumber < num7){
            if(num7 % smallestprimenumber == 0){
                System.out.println(num7+" is not a prime number");
                break;
            }else{
                System.out.println(num7+" it is is  prime number");
            }
            smallestprimenumber++;
        }


        //EX8
        //Write a program to enter the numbers till the user wants and at the
        // end it should display the count of positive, negative and zeros entered.


        System.out.println("EX8");

        int num8=0;
        int contpos =0;
        int contneg=0;
        int countzero=0;
        String str2 = "";


        do {
            System.out.println("enter the integers to find to show the count of positive, negative and zeros entered.");
            num8 = data.nextInt();


            if (num8 == 0) {
                countzero++;
            }
            if (num8 > 0) {
                contpos++;
            }
            if (num8 < 0) {
                contneg++;
            }

            System.out.println("Enter X to exit otherwise to continue"  );
            str2 = data.next();

        }while(!str2.equals("X") );

        System.out.println("there is "+countzero+" zeros ");
        System.out.println("there is "+contpos+" positive numbers");
        System.out.println("there is "+contneg+" negative numbers");


        //EX9
        //Use a for loop to print headings for four weeks (Weeks 1 - 4).
        // Then use another for loop to print the days (Days 1 -7) for each week.

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int d = 1; d <= 7; d++) {
                System.out.println("Day  " + d);
            }
        }


        //EX10
        //
        System.out.print("please enter a word");
        String str3 = data.next();

        int len = str3.length();
        int mid = len / 2;
        boolean isPalindrome = true;

        for (int i = 0; i < mid; i++) {
            if (str3.charAt(i) != str3.charAt(len- 1 - i)) {
                System.out.println(str3 + " is not a palindrome.");
                break; }
            else{
                System.out.println(str3 + " is a palindrome.");
            }

        }



        




    }
}