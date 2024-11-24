// Denna logikklass
// - räknar totalt antal tecken inklusive blanksteg
// - räknar totalt antal ord separerade med blanksteg
// - räknar totalt antal raderna exklusive ordet stop på separat rad
// - har koll på det längsta ordet,
// - har koll på om användaren har skrivit ordet stop eller inte på en separat rad

public class ControlText {

    // Här används int eftersom vi inte har decimaler av tecken eller rader
    private int totalCharacters = 0;
    private int totalLines = 0;
    private int totalWords = 0;
    private String longestWord = "";
    private boolean writtenStop = false;

    // Nedan metod bearbetar den text användaren matar in till att den skriver 'stop' på separat rad
    public void processInput (String input) {

        // equalsIsIgnoreCase för att användaren ska kunna skriva 'stop' på flera olika sätt
        // med gemener och versaler men att programmet ska kunna avslutats oavsett skrivsätt
        if (input.equalsIgnoreCase("stop")) {
            writtenStop = true;
            return;
        }


        // Nedan räknar tecken, ord och rader

        // räknar totalt antal tecken inklusive blanksteg
        totalCharacters += input.length();

        // räknar totalt antal ord i arrayen words genom att dela upp input till enskilda ord
        // separerade med blanksteg ifall användaren skrivit flera ord per rad
        // först försökte jag splittra orden med bara "" och det funkade i programmet tills att
        // jag försökte kontrollera det med ett testfall och fick fel i testet, efter research hittade jag
        // att om man lägger till \\s+ innanför "" så räknar den antal orden korrekt i raden
        // källa: https://www.codecademy.com/resources/docs/java/strings/split
        String[] words = input.split("\\s+");
        totalWords += words.length;

        // räknar totalt antal rader
        totalLines++;

        // Alla ord i arrayen words kontrolleras för att hitta första längsta ordet
        // (side note: försökt koda så att den skriver ut alla lika långa ord men det
        // blev alldeles för komplext och överkurs mot vad vi lärt oss så har valt att köra
        // koden som väljer ut det första långa ordet om fler ord av samma längds skulle förekomma)
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    // Kontroll om användaren har skrivit ordet 'stop'
    public boolean hasWrittenStop() {
        return writtenStop;
    }

    // Nedan hämtar resultaten till användaren efter att den skrivit 'stop'
    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalCharacters() {
        return totalCharacters;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public String getLongestWord() {
        return longestWord;
    }

}
