import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);


        // EX1
        // Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.

        System.out.println("EX1");

        System.out.println("please enter the first number");
        int num1 = data.nextInt();

        System.out.println("please enter the second number");
        int num2 = data.nextInt();



        System.out.println(num1+ " + "+num2+" = "+num1+num2 );
        System.out.println(num1+ " - "+num2+" = "+(num1-num2));
        System.out.println(num1+ " x "+num2+" = "+(num1*num2));
        System.out.println(num1+ " / "+num2+" = "+(num1/num2));
        System.out.println(num1+ " mod "+num2+" = "+(num1%num2));



        // EX2
        // Write a Java program to convert a given string into lowercase.

        System.out.println("EX2");

        System.out.println("please enter the String");
        String str = data.next();
        System.out.println(str.toLowerCase());


        // EX3
        //Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        System.out.println("EX3");

        System.out.print("please enter a string");
        String str2 = data.next();

        System.out.print("please enter an index ");
        int index = data.nextInt();

        System.out.println(str2.charAt(index));

        //EX4
        //Write a Java program to accept a number and check the number is even or not.
        // Prints 1 if the number is even or 0 if the number is odd. (use if-statement)

        System.out.println("EX4");

        System.out.print("please enter a number");
        int num3 = data.nextInt();

        int check = 0;

        if (num3 % 2 == 0) {
            check = 1;
        }

        System.out.println(check);


        //EX5
        //Write a program that checks the role of the user


        System.out.println("EX5");

        System.out.println("please enter your your role");
        String role= data.next();

        if (role.contains("admin")){

            System.out.println("Welcome admin");}

        if(role.contains("superuser")){

            System.out.println("Welcome superuser");}


        else if(role.contains("User")){

           System.out.println("Welcome User");
       }


        //EX6
        //Write a Java program to calculate the sum of two integers and return
        // true if the sum is equal to a third integer.

        System.out.println("EX6");

        System.out.print("Input the first number:");
        int x = data.nextInt();

        System.out.print("Input the second number:");
        int y = data.nextInt();

        System.out.print("Input the third number:");
        int xy = data.nextInt();

        int sum = x + y;

        boolean res = sum == xy;

        System.out.println(res);


        //EX7
        // ake three numbers from the user and print the greatest number.

        System.out.println("EX7");

        System.out.print("Input the first number:");
        int first = data.nextInt();

        System.out.print("Input the second number:");
        int second = data.nextInt();

        System.out.print("Input the third number:");
        int third = data.nextInt();

        int gratenumber = first;

        if (second > gratenumber){
            gratenumber=second;
        }

         if (third > gratenumber){
            gratenumber=third;
        }

        System.out.println("The greatest:"+gratenumber);

        //EX8
        //Write a Java program that keeps a number from the user
        // and generates an integer between 1 and 7 and displays the name of the weekday.


        System.out.println("EX8");

        System.out.println("please enter number between 1 and 7 ");
        int num= data.nextInt();

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("wrong number!");
        }
    }
}