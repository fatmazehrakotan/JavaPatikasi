import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args){
        int month,day;
        String horoscope = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdunuz ay : ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();

       if (month == 1) {
           if (day >= 1 && day <= 31) {
               if (day < 22) {
                   horoscope ="Oglak";
               } else {
                   horoscope = "Kova";
               }
           } else {
               isError = true;
           }
       }
       else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                   horoscope ="Kova";
                } else {
                    horoscope = "Balik";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Balik";
                } else {
                    horoscope = "Koc";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "Koc";
                } else {
                    horoscope = "Boga";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Boga";
                } else {
                    horoscope = "Ikizler";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                   horoscope = "Ikizler";
                } else {
                    horoscope = "Yengec";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Yengec";
                } else {
                    horoscope = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Aslan";
                } else {
                    horoscope = "Basak";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    horoscope = "Basak";
                } else {
                    horoscope = "Terazi";
                }
            } else {
               isError = true;
            }
        }
        else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Terazi";
                } else {
                    horoscope = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "Akrep";
                } else {
                    horoscope = "Yay";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Yay";
                } else {
                    horoscope = "Oglak";                }
            } else {
               isError = true;
            }}
            else {
                isError = true;
       }
        if (isError){
            System.out.println("Gecersiz bir gun girdiniz !");}
            else { System.out.println("Burcunuz : "+horoscope);
        }
      }
    }