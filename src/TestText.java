// Denna Test klass testar ett antal fall

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestText {

    // Testfall 1: kontroll att metoden för att räkna antal tecken fungerar korrekt
    @Test
    public void testTotalCharacters() {
        ControlText controlText = new ControlText();
        controlText.processInput("hello world");
        controlText.processInput("I am counting with blankspace");
        assertEquals(40, controlText.getTotalCharacters());
    }


    // Testfall 2: kontroll att metoden för att ta fram längsta ordet fungerar korrekt,
    // i testet har tre lika långa ord om 9 karakträrer (longwords aaaaaaaaa bbbbbbbbb)
    // skrivits in, expected är att första långa ordet väljs ut
    @Test public void testLongestWord() {
        ControlText controlText = new ControlText();
        controlText.processInput("hello world");
        controlText.processInput("my name is");
        controlText.processInput("longwords aaaaaaaaa bbbbbbbbb I just made up");
        assertEquals("longwords", controlText.getLongestWord());
    }

    // Testfall 3: kontroll att metoden för att splittra rader till ord fungerar korrekt
    @Test
    public void testSplitWords() {
        ControlText controlText = new ControlText();
        controlText.processInput("hello world I am counting total words split by blankspace");
        assertEquals(10, controlText.getTotalWords());
    }

    // eftersom jag vid testfall 3 för att kontrollera antal ord märkte att min tidigare kod inte
    // splittade orden helt korrekt vid testet så jag behövde utveckla koden där, därför har jag
    // valt att skriva några fler testfall för att kontrollera min kod så att den är korrekt nedan

    // Testfall 4: kontroll att metoden för att räkna antal rader är korrekt
    @Test public void testTotalLines() {
        ControlText controlText = new ControlText();
        controlText.processInput("hello");
        controlText.processInput("world");
        controlText.processInput("test amount of lines");
        assertEquals(3, controlText.getTotalLines());
    }

    // Testfall 5: kontroll att koden kan hantera att korrekt räkna ut antal tecken, ord, rader
    // samt ta fram längsta ordet när det bara finns en rad med text
    @Test public void testOneLongSentence() {
        ControlText controlText = new ControlText();
        controlText.processInput("hello world this is a superduper long sentence");
        assertEquals(46, controlText.getTotalCharacters());
        assertEquals(8, controlText.getTotalWords());
        assertEquals(1, controlText.getTotalLines());
        assertEquals("superduper", controlText.getLongestWord());
    }
}
