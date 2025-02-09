import java.util.Scanner;

public class Greatest_of_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        sc.close();

        if(a>b && a>c){
            System.out.println("A is Greatest of three");
        } else if (b>c && b>a){
            System.out.println("B is Greatest of three");
        } else{
            System.out.println("C is Greatest of three");
        }
        }
    }

