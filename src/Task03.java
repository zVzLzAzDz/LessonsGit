import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Input years: ");
        Scanner vlad = new Scanner(System.in);
        int num = vlad.nextInt();

        String msg = " ";

        switch (num) {
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54, 62, 63, 64, 72, 73, 74, 82, 83, 84, 92, 93, 94, 102, 103, 104:
                System.out.println(num + " года");
                break;
            case 1, 21, 31, 41, 51, 61, 71, 81, 91, 101:
                System.out.println(num + " год");
                break;
            default:
                if (num >= 120) {
                    System.out.println("Error");
                } else {
                    System.out.println(num + " лет");
                }
        }
    }
}