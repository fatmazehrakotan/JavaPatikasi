import java.util.Scanner;
public class VucutKitleEndeksi {
public static void main(String[] args){

    double boy , kilo;

    Scanner inp = new Scanner(System.in);
    System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz :");
    boy = inp.nextDouble();

    System.out.print("Lutfen kilonuzu (kilogram cinsinde) giriniz : ");
    kilo = inp.nextDouble();

    double index = (kilo / (boy * boy));
    System.out.print("Vucut Kitle Endeksiniz : " +index);
     }

}
