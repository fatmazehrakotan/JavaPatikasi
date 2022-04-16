import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args){
        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik Giriniz :");
        heat = input.nextInt();

        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }
        else if (heat>=5 && heat<=15){
            System.out.println("Sinamaya Gidebilirsiniz.");
        }
        else if (heat>15 && heat<=25){
            System.out.println("Piknik Yapabilirsiniz.");
        }
        else if (heat>25) {
            System.out.println("Yuzmeye Gidebilirsiniz.");
        }
    }

}
