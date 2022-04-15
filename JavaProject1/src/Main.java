import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        int a = 60;
        boolean kosul1 = ortalama > a;
        System.out.println("Ortalamanız : " + ortalama);
        String str = kosul1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
