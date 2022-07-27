import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, lastNumber, newNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            temp = temp / 10;
            newNumber = (newNumber * 10) + lastNumber;

        }
        if (newNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        System.out.println(isPalindrom(inp.nextInt()));

    }
}