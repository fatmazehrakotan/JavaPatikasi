import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        String userName,password,newPassword,answer;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici Girisi : ");
        userName = inp.nextLine();

        System.out.println("Sifreniz : ");
        password = inp.nextLine();
         if (userName.equals("patika") && password.equals("java123")) {

             System.out.println("Giris Yaptiniz ! ");
         }
         else {
             System.out.println("Bilgileriniz Yanlis !");
             System.out.println("Sifreyi sifirlamak ister misiniz ?");
             answer = inp.nextLine();

             if (answer.equals("evet")) {
                 System.out.println("Yeni sifrenin hatali girdiginiz veya unuttugunuz sifre ile ayni olmamasi gerekir");
                 System.out.println("Yeni sifrenizi giriniz ");
                 newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                 System.out.println("Sifre olusturulamadı,lutfen baska sifre giriniz");
                }
                  else {
                 System.out.println("Sifre olusturuldu");
                  }

             }
         }
    }
}

