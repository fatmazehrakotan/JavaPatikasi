import java.util.Scanner;
public class FlightTicketPriceCalculation {
    public static void main(String [] args){

        double distance,distancePrice = 0.10 ,age,tripType,normalPrice,ageDisc =1,roundTripDisc =1,ageDiscPrice,roundTripDiscPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Distance(km): ");
        distance = input.nextInt();

        System.out.println("Your Age :");
        age = input.nextInt();

         System.out.print("Please select:\n1 1 => One-way\n2 2=> Round-trip");
         tripType = input.nextInt();


        if (distance<0 || age<0 || (tripType!=1 && tripType!=2)){
            System.out.println("Please check the information that you provided. ");
        }else {


            if (age < 12) {
                ageDisc = 0.5;
            } else if (age >= 12 && age < 24) {
                ageDisc = 0.9;
            }
            else if (age> 65) {
                ageDisc = 0.7;
            }
            if (tripType == 2){
                roundTripDisc =0.8;
            }

            normalPrice = distancePrice * distance;
            ageDiscPrice= normalPrice * ageDisc;
            roundTripDiscPrice = ageDiscPrice * roundTripDisc;


            System.out.println("Normal Price :" + normalPrice + "TL");
            System.out.println("Age Discounted Price :"+ageDiscPrice+"TL");
            System.out.println("Round Trip Discounted Price :"+roundTripDiscPrice+"TL");
        }
    }
}
