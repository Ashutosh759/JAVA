import java.util.Scanner;

public class Swap3Variables {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter  Second Number");
        int b = sc.nextInt();

        sc.close();

        System.out.println("Value of a before swap is:" + a);
        System.out.println("Value of b before swap is:" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swap is:" + a);
        System.out.println("Value of b after swap is:" + b);
    }
}
