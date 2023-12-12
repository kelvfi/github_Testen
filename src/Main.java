import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n#### Zahlentester ####");
        System.out.println("Geben Sie die Nummer ein die Sie überprüfen wollen:");
        int eingabe = scan.nextInt();
        int sum = eingabe % 2; //Wenn 0 Rauskommt ist es eine Gerade Zahl

        //Beide Überprüfungen
        if (sum == 0) {
            System.out.println(eingabe+" ist eine GERADE Zahl!");
        }
        else {
            System.out.println(eingabe+" ist eine UNGERADE Zahl!");
        }
    }
}