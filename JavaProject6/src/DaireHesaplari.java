import java.util.Scanner;
public class DaireHesaplari {
    public static void main(String[] args){
     int r;
     double a;
     double pi = 3.14;

     Scanner inp = new Scanner(System.in);
     System.out.println("Dairenin yari capini giriniz :");
     r = inp.nextInt();

     System.out.println("Merkez acisini giriniz :");
     a = inp.nextInt();

     double alan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alani :" +alan);
    }
}
