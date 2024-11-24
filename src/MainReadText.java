// Denna Main klass:
// - läser in text som användaren skriver in
// - skriver ut resultatet till användaren

import java.util.Scanner;


public class MainReadText {

    public static void main(String[] args) {

        // skapar en scanner för att kunna läsa in texten som matas in från kommandoraden
        Scanner scanner = new Scanner(System.in);

        // skapar objektet controlText av klassen ControlText
        ControlText controlText = new ControlText();

        // skapar en string av input för att lagra text som skrivs in av användaren
        String input;

        System.out.println("Skriv en text rad för rad med gemener. Skriv sedan 'stop' på en separat rad för att avsluta programmet):");

        // Programmet loopas så länge användaren inte skriver 'stop', när den skriver 'stop' avslutas det
        do {
            input = scanner.nextLine();
            controlText.processInput(input);
        } while (!controlText.hasWrittenStop());

        System.out.println("Du har skrivit 'stop', programmet avslutas, se dina resultat nedan: ");
        System.out.println("Totala antalet tecken du har skrivit är: " + controlText.getTotalCharacters());
        System.out.println("Totala antalet rader du har skrivit är: " + controlText.getTotalLines());
        System.out.println("Totala antalet antal ord du har skrivit är: " + controlText.getTotalWords());
        System.out.println("Det längsta ordet du har skrivit är : " + controlText.getLongestWord());

        scanner.close();
    }
}
