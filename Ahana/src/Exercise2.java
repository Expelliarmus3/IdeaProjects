import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Enter your name and age: ");
        System.out.println(v.nextLine()+"! and you are "+v.nextInt()+" years old!!!");
    }
}
