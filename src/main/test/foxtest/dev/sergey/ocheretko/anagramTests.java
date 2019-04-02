package foxtest.dev.sergey.ocheretko;

import com.sergey.ocheretko.AnagramCreator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class anagramTests {
    private AnagramCreator anagramCreator = new AnagramCreator();

    @Test
    public void reverseNumericalString() {
        assertEquals("1234567890", anagramCreator.Stringreverseways("1234567890"));
    }



    @Test
    public void specialSymbolNotReverse() {
        assertEquals("!@#$%^&*()", anagramCreator.Stringreverseways("!@#$%^&*()"));
    }

    @Test
    public void reverseStringWithCharactersAndNumbers() {
        assertEquals("zxc123zxc", anagramCreator.Stringreverseways("cxz123cxz"));
    }
    @Test
    public void splitAndReverseString() {
        assertEquals("qwerty zxcvb asdfg", anagramCreator.Stringreverseways("ytrewq bvcxz gfdsa"));
    }
    @Test
    public void reverseEmptyString() {
        assertEquals("", anagramCreator.Stringreverseways("     "));
    }

    @Test
    public void reverseStringOfCharacters() {
        assertEquals("HellowWorld", anagramCreator.Stringreverseways("dlroWwolleH"));
    }

    @Test
    public void reverseStringWithSymbolsAndSpecialCharacters() {
        assertEquals("tyuio#@$@", anagramCreator.Stringreverseways("oiuyt#@$@"));
    }



}






