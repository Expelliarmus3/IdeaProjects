//program to read user fav no. and display it

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite no.: ");
        float f= input.nextFloat();
        System.out.println(f+" is my favourite no. too!!!");

//we can also use System.out.println(input.nextFloat()+" is my favourite no. too!!!")


//program to read username and age and display it
    //input.nextLine() is not working
    //and if I put full name it is showing error with input.next()
//remember to create scanner class each time to avoid the above problems
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your age: ");
        int age= s.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old!!!");


    }
}
