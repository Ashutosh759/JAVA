import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name & Age");

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Your Name is " + name + "Your Age is " + age);

        sc.close();
    }
}
