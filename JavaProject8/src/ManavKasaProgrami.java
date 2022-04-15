import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args){

    double armut = 2.14;
    double elma = 3.67;
    double domates = 1.11;
    double muz = 0.95;
    double patlican = 5.00;
    double armutkg, elmakg, domateskg,  muzkg, patlicankg;
        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kac Kilo ?");
        armutkg =  inp.nextDouble();
        double armutTutar = armut * armutkg;

        System.out.println("Armut Tutar : " +armutTutar);


        System.out.println("Elma Kac Kilo ?");
        elmakg =  inp.nextDouble();
        double elmaTutar = elma * elmakg;

        System.out.println("Elma Tutar : " +elmaTutar);


        System.out.println("Domates Kac Kilo ?");
        domateskg =  inp.nextDouble();
        double domatesTutar = domates * domateskg;

        System.out.println("Domates Tutar : " +domatesTutar);

        System.out.println("Muz Kac Kilo ?");
        muzkg =  inp.nextDouble();
        double muzTutar = muz * muzkg;

        System.out.println("Muz Tutar : " +muzTutar);

        System.out.println("Patlican Kac Kilo ?");
        patlicankg =  inp.nextDouble();
        double patlicanTutar = patlican * patlicankg;

        System.out.println("Patlican Tutar : " +patlicanTutar);

        double toplamTutar = armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
        System.out.println("Toplam Tutar : " +toplamTutar+"TL");

    }
}
