import java.util.Scanner;
public class ChineseZodiacCalculation {
    public static void main(String[] args){
    int birth,calculation;
     String horoscope ="";

     Scanner input = new Scanner(System.in);
        System.out.println("Your Year of Birth : ");
        birth = input.nextInt();
        calculation =birth%12 ;

     switch (calculation){
         case 0 :
           horoscope = "Monkey";
           break;
         case 1 :
             horoscope = "Rooster";
             break;
         case 2 :
             horoscope = "Dog";
             break;
         case 3 :
             horoscope = "Pig";
             break;
         case 4 :
             horoscope = "Mice";
             break;
         case 5 :
             horoscope = "Ox";
             break;
         case 6 :
             horoscope = "Tiger";
             break;
         case 7 :
             horoscope = "Rabbit";
             break;
         case 8 :
             horoscope = "Dragon";
             break;
         case 9 :
             horoscope = "Snake";
             break;
         case 10 :
             horoscope = "Horse";
             break;
         case 11 :
             horoscope = "Sheep";
             break;
         default:
             System.out.println("Please check the information that you provided !");
             break;
     }
        System.out.println("Your Chinese Zodiac Sign :"+horoscope);
    }
}
