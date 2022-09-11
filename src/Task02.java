import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);

        String name = " ";

        do {
            System.out.print("Input number from 1 to 4(Card suit): ");
            short num1 = vlad.nextShort();


            System.out.print("Input number from 6 to 14(The dignity of the card): ");
            short num2 = vlad.nextShort();


            switch (num1) {
                case 1:
                    name = "PIKA";
                    break;
                case 2:
                    name = "TREFA";
                    break;
                case 3:
                    name = "BYBNA";
                    break;
                case 4:
                    name = "CHERVA";
                    break;
                default:
                    name = "You have entered incorrect data";
                    break;

            }

            switch (num2) {
                case 6:
                    name = name + " SIX";
                    break;
                case 7:
                    name = name + " SEVEN";
                    break;
                case 8:
                    name = name + " EIGHT";
                    break;
                case 9:
                    name = name + " NINE";
                    break;
                case 10:
                    name = name + " TEN";
                    break;
                case 11:
                    name = name + " JACK";
                    break;
                case 12:
                    name = name + " QUEEN";
                    break;
                case 13:
                    name = name + " KING";
                    break;
                case 14:
                    name = name + " ACE";
                    break;
                default:
                    name = "You have entered incorrect data";
                    break;
            }  // final operation switch

            System.out.println(name);

            System.out.println("Would you like to play again (yes/no)?");

            name = vlad.next();

        } while (name.equalsIgnoreCase("yes"));  // final operation do ... while
    }
}
