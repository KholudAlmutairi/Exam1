import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* 1-Write a Java program that accept three numbers from the user and print the largest number .*/

        Scanner input =new Scanner(System.in);
      /* System.out.println("Enter nmu1");
        int num1=input.nextInt();
        System.out.println("Enter nmu2");
        int num2=input.nextInt();
        System.out.println("Enter nmu3");
        int num3=input.nextInt();


        if(num1>num2){
            System.out.println("largest number:"+num1);

        } else if (num1>num3) {
            System.out.println("largest number:"+num1);
        }
        else if (num2>num3) {
            System.out.println("largest number:"+num2);
        }else {
            System.out.println("largest number:"+num3);
        }*/

        /*2 Write a Java program that accept a String and a number from the user,then print the character in the given index */

       /* System.out.println("Enter string:");
        String str =input.nextLine();

        System.out.println("Enter index:");
        int number=input.nextInt();
        if(number>=str.length()){
        for(int i=0;i<=str.length()-1;i++){
                System.out.println(str.charAt(number));
                number=input.nextInt();
        }
        }
        System.out.println("The index grater than the length");*/


        /* 3 Write a program to enter the numbers till the user wants and at the end it should display the sum entered */
        /*System.out.println("Enter the numbers (-1 to stop)");
        int number=input.nextInt();
        int i=1;
        int sum=0;
        while(number!=0){
            sum+=number;
            number=input.nextInt();
        }
        System.out.println("The sum entered "+sum);/*

        /*4 Write a Java program to find positive and negative numbers of a given array:*/
       /* int[] arr = {10, -21 , 30, 31, -25};
        for(int num:arr){
            if(num>0){
                System.out.println(num+" is a positive number ");
            }else {
                System.out.println(num+" is a  negative number ");
            }


        }*/
        //5 Write a Java program to find a shortest word of a given array:*/
        String[] str={"Tuwaiq","Bootcamp","Student","JAVA"};
        int shortest=0;
        for(String c:str){
            //if(c)
           // int shortest+=c;
            //if(Arrays.binarySearch()){
            //if(c.equals(str.length)){
            // if(c.charAt(i)==shortest)
                System.out.print(' '+c);

            }

//            if(Arrays.){
//
//            }
//            shortest=0;
//            System.out.print(' '+c);

           // if(str.charAt(i)==shortest){

           // }
//        }














    }
}
