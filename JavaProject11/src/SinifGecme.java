import java.util.Scanner;

public class SinifGecme {
  public static void main(String[] args){
     int mat,fizik, turkce, kimya, muzik,total = 0;

     Scanner inp = new Scanner(System.in);

      System.out.println("Matematik notunuz :");
      mat = inp.nextInt();
      if ((mat >=0 ) && (mat<=100)){
       total+= mat;
      }
      System.out.println("Fizik notunuz :");
      fizik = inp.nextInt();
      if ((fizik >=0 ) && (fizik<=100)){
          total += fizik;
      }
      System.out.println("Turkce notunuz :");
      turkce = inp.nextInt();
      if ((turkce >=0 ) && (turkce<=100)) {
          total += turkce;
      }
      System.out.println("Kimya notunuz :");
      kimya = inp.nextInt();
      if ((kimya >=0 ) && (kimya<=100)) {
          total += kimya;
          }

      System.out.println("Muzik notunuz :");
      muzik = inp.nextInt();

      if ((muzik >=0 ) && (muzik<=100)) {
          total += muzik;
      }
      double avarage = total/5;
      if((avarage)<55){
          System.out.println("Sinifta kaldiniz seneye tekrar gorusmek uzere");
          System.out.println("Ortalamaniz :"+avarage);
      }
      else{
          System.out.println("Tebrikler sinifi gectiniz !");
          System.out.println("Ortalamaniz :"+avarage);
      }
  }
}
