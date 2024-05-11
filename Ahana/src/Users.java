import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());//gives runtime error if input is not int
        System.out.println(input.next());
        System.out.println(input.nextDouble());
        System.out.println(input.nextFloat());
        System.out.println(input.nextBoolean());//takes only true or false


    }
}
