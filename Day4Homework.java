import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Day4Homework {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        // Day 3 Homework
       // Write a Java program to test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2

        System.out.println("EX1");

        int [] numbers ={50, -20, 0, 30, 40, 60, 20};



        int first = numbers[0];
        int last = numbers[numbers.length-1];
        boolean res;

        if (first == last ){

            res = true;
        }
        else{
            res =false;
        }

        System.out.println(res);



        //EX2
        //Write a Java program to find the k largest elements in a given array.
        // Elements in the array can be in any order.


        System.out.println("EX2");

        int[] nums ={1, 4, 17, 7, 25, 3, 100};
        int [] temp = new int[7];

        for (int i =0 ; i<nums.length;i++){
          temp[i] =nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
           for (int j = 0; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int x = temp[i];
                   temp[i] = temp[j];
                    temp[j] = x;
                }
           }
       }
        System.out.println("please enter K value");
        int k= data.nextInt();
        System.out.print(k+" largest elements of the said array are: ");
        for (int i = 0 ; i<k; i++){
            System.out.print(temp[i] +" ");
        }

        System.out.println();

        //EX3
        //Write a Java program to find the numbers greater than the average of the numbers of a given array.

        System.out.println("EX3");

        int[] nums3 ={1, 4, 17, 7, 25, 3, 100};
        int sum=0;
        double avg=0;
        int count=0;

        // to find the avg
        for(int i =0;i<nums3.length;i++){sum = sum+nums3[i]; count++;}

        avg = sum / count;

        System.out.print("The average of the said array is: "+avg);
        System.out.print(" The numbers in the said array that are greater than the average are: ");

        for(int i =0;i<nums3.length;i++){
            if(avg<nums3[i]){
                System.out.print(nums3[i]+" ");
            }
        }


        //EX4
        // Write a Java program to get the larger value between first and last element of an array of integers


        System.out.println("EX4");

        int[] nums4 ={10, 30, 40};

        int first2 = nums4[0];
        int last2 = nums4[nums4.length-1];


        if (first2 < last2){

           System.out.println("Larger value between first and last element : "+last2);
        }
        else if ((first2 > last2)){

            System.out.println("Larger value between first and last element : "+first2);
        }

        //EX5
        //Write a Java program to swap the first and last elements of an array and create a new array.

        System.out.println("EX5");

        int[] nums5 = {20, 30, 40};
        int[] new1 = new int[nums5.length];

        int first3 = nums5[0];
        int last3 = nums5[nums5.length-1];

        // Copy the elements of the original array to the new array
        for (int i = 0; i < nums5.length; i++) {
            new1[i] = nums3[i];
            new1[0]=first3;
            new1[new1.length-1]=last3;
        }

        System.out.println("New array after swapping the first and last elements:" + Arrays.toString(new1));


        //EX6
        //Write a Java program to find all of the longest word in a given dictionary.


        System.out.println("EX6");
        String [] names = {"cat", "dog", "red", "is", "am"};

        String temp4 = names[0];

        for (String n :names){
            if(n.length() > temp4.length()){
                temp4=n;
            }
        }


        for (String n :names){
            if(n.length() == temp4.length()){
                System.out.print(n +" ");
            }
        }



        //7
        // Write a menu driven Java program with following option:

        System.out.println("EX7");

        System.out.println("please enter the size of the array");
        int size = data.nextInt();

        int[] opp = new int[size];

//        System.out.println("please select your request");
//
//        System.out.print("\n" +" 1. Accept elements of an array\n" +
//                "\n" +
//                " 2. Display elements of an array\n" +
//                "\n" +
//                "3. Search the element within array\n" +
//                "\n" +
//                " 4. Sort the array\n" +
//                "\n" +
//                " 5. To Stop\n");

            int request ;
            boolean test = true;

        do {
            System.out.println();
            System.out.println("please select your request");
            System.out.print("\n" + " 1. Accept elements of an array\n" +
                    "\n" +
                    " 2. Display elements of an array\n" +
                    "\n" +
                    "3. Search the element within array\n" +
                    "\n" +
                    " 4. Sort the array\n" +
                    "\n" +
                    " 5. To Stop\n");
            request = data.nextInt();

           if(request == 1) {
               for (int i = 0; i < opp.length; i++) {
                   System.out.print("please your array elements");
                   int el = data.nextInt();
                   opp[i] = el;
               }
               System.out.println("the Array is full");
           }
            if(request == 2) {
                System.out.print("elements of an array : ");
                for (int i = 0; i < opp.length; i++) {
                    System.out.print(opp[i] + " ");
                }
            }

            boolean res2=false;
            int elment=0;
            if(request == 3) {
                System.out.print("what is the element you trying to Search for?");
                int ser = data.nextInt();

                for (int i = 0; i < opp.length; i++) {

                    if (ser == opp[i]) {
                        res2 = true;
                    }
                }


                if(res2 == true){System.out.println("the element"+ser+" exist");}
                else{System.out.println("the element "+ser+" not exist");}
            }

            if(request == 4) {
                System.out.println("the sorted array :");

                for (int i = 0; i < opp.length; i++) {
            for (int j = i+1; j < opp.length; j++) {
                if (opp[i] > opp[j]) {
                    int temp2 = opp[i];
                    opp[i] = opp[j];
                    opp[j] = temp2;
                }
            }
        }

        System.out.println( Arrays.toString(opp));

                }

            if(request == 5) {
                test=false;
            }

        }while(test);



        ///EX8
        //8. Write a program thats displays the number of occurrences of an element in the array.
        System.out.println("EX8");
        int [] occ ={1,1,1,3,3,5};

        int oc = data.nextInt();

        int count8=0;
        for(int i =0;i< occ.length;i++){
            if (oc == occ[i]){count8++;}
        }

        System.out.println(oc+" occurs "+count8+" times");





        //EX9
        //Write a program that places the odd elements of an array before the even elements.

        System.out.println("EX9");
        int[] oddandeven = {2,3,40,1,5,9,4,10,7};
        int[] tempeven = new int[oddandeven.length];


        int count9=0;

        for (int i = 0; i < oddandeven.length; i++) {
            for (int j = i+1; j < oddandeven.length; j++) {
                if (oddandeven[i] % 2 == 0) {
                    int temp2 = oddandeven[i];
                    oddandeven[i] = oddandeven[j];
                    oddandeven[j] = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(oddandeven));


        //EX10
        // Write a program that test the equality of two arrays.
        System.out.println("EX10");


        int[] one = {2,3,6,6,4};
        int[] tow = {2,3,6,6,4};

        boolean equal = true;

            for(int i=0; i<one.length; i++) {
                if(one.length != tow.length){equal=false; break;}
                if(one[i] != tow[i]) {
                    equal=false;
                }
            }

            System.out.println(equal);



    }
}