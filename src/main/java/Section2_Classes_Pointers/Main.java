package Section2_Classes_Pointers;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Cookie cookieOne = new Cookie("green");
//        Cookie cookieTwo = new Cookie("blue");
//
//        cookieOne.setColor("yelow");
//
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());

//        1 -> 0,1
//        2 -> 00, 01, 10 ,11
//        3 -> 000, 001, 010, 011, 100, 101, 110, 111
//        4 -> x

        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter an n number for the pattern: "));
        //System.out.println(n);



        int total = (int) Math.pow(2, n);

        int[] myArray = new int[total];
        //System.out.println(total);
        System.out.println(myArray.length);
        int[] newArray =  binarySum(myArray);
        printArray(newArray);
//        for(int i = 0; i <= total; i++){
//
//
//        }


    }
//
    public static int[] binarySum(int[] array){
        // 0 + 1 = 1
        // 10 + 1 = 11
        // 11 + 1 = 100
        array[0] = 0;

//        array[1] = 1;
//        array[2] = 10;
//        array[3] = 11;

        for(int i = 0; i <= array.length -1; i++){

            String numDigit = Integer.toString(array[i]);
            int[] digits = new int[numDigit.length()];

            for(int digit : digits ){
                System.out.println(digit);
            }
             if (i == 0){ // 0 then next number going to be 1
                 array[i+1] = 1;
                 i++;

             } else if (array[i] == 1) { // if next number is 1 going to be 10
                 array[i+1] = 10;
                 i++;
             } else if (array[i] == 10){
                array[i+1] = 11;
             } else {
                 break;
             }

        }
        return array;


    }

    public static void printArray(int[] array){

        for( int i = 0; i <= array.length -1 ; i++){

            System.out.print(array[i] + " ");
        }
    }
}


