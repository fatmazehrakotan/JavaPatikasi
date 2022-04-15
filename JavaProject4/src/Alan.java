import java.util.Scanner;

public class Alan {
    public static void main(String[] args){
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenari Giriniz :");
        a = input.nextInt();
        System.out.println("2.Kenari Giriniz");
        b = input.nextInt();
        System.out.println("3.Kenari Giriniz");
        c = input.nextInt();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan :" +alan);
    }
}
