import java.util.Scanner;
public class Hypotenuse {
public static void main(String[] args){
    int a, b;
    double c;

    Scanner input = new Scanner(System.in);
    System.out.println("1.Kenari Giriniz :");
    a = input.nextInt();
    System.out.println("2.Kenari Giriniz");
    b = input.nextInt();

    c = Math.sqrt((a*a)+(b*b));
    System.out.println("Hypotenus :" +c);
   }
}
