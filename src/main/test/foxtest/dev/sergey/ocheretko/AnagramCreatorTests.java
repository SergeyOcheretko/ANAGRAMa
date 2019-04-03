package foxtest.dev.sergey.ocheretko;

import com.sergey.ocheretko.AnagramCreator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AnagramCreatorTests {
    private AnagramCreator anagramCreator = new AnagramCreator();

    @Test
    public void checkThatDigitsIsNotReversed() {
        assertEquals("1234567890", anagramCreator.Stringreverseways("1234567890"));
    }

    @Test
    public void checkThespecialSymbolNotReverse() {
        assertEquals("!@#$%^&*()", anagramCreator.Stringreverseways("!@#$%^&*()"));
    }

    @Test
    public void checkTheDigitWithLatinLetters() {
        assertEquals("zxc123zxc", anagramCreator.Stringreverseways("cxz123cxz"));
    }
    @Test
    public void checkSplitAndReverseString() {
        assertEquals("qwerty zxcvb asdfg", anagramCreator.Stringreverseways("ytrewq bvcxz gfdsa"));
    }
    @Test
    public void checkReverseEmptyString() {
        assertEquals("", anagramCreator.Stringreverseways("     "));
    }

    @Test
    public void checkReverseStringOfCharacters() {
        assertEquals("HellowWorld", anagramCreator.Stringreverseways("dlroWwolleH"));
    }

    @Test
    public void checkReverseStringWithSymbolsAndSpecialCharacters() {
        assertEquals("tyuio#@$@", anagramCreator.Stringreverseways("oiuyt#@$@"));
    }



}






