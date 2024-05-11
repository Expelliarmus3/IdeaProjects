import java.util.Scanner; //we need to create this class for user input

public class Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//program for taking name of a user storing them as a variable and printing that variable
        System.out.print("enter name: ");
        String name= input.nextLine();//here input is being taken
        System.out.println("Your Name: "+name);


//program for taking input from users and adding them
        System.out.print("Enter digit1= ");
        int digit1= input.nextInt();
        System.out.print("Enter digit2= ");
        int digit2= input.nextInt();
        System.out.println("Your Sum: "+(digit1+digit2));

    }
}
