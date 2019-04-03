package com.sergey.ocheretko;

public class AnagramCreator {

    private static final String SEPARATOR = " ";

    public  static String Stringreverseways(String inputString) {
        return String.join(SEPARATOR, reverseLine(inputString.split(SEPARATOR)));
    }

    private static String[] reverseLine(String[] strings) {
        String[] reversedStrings = new String[strings.length];
        int stringNumber, lastStringNumber = strings.length;
        for (stringNumber = 0; stringNumber < lastStringNumber; stringNumber++) {
            String stringNeedsToReverse = strings[stringNumber];
            reversedStrings[stringNumber] = doStringReverse(stringNeedsToReverse);
        }
        return reversedStrings;
    }


    private static String doStringReverse(String textForReverse) {
        char[] charArrayOfWord = textForReverse.toCharArray();
        int numberOfRightChar = charArrayOfWord.length - 1, numberOfLeftChar = 0;

        while (numberOfLeftChar < numberOfRightChar) {
            if (!Character.isAlphabetic(charArrayOfWord[numberOfLeftChar]))
                numberOfLeftChar++;
            else if (!Character.isAlphabetic(charArrayOfWord[numberOfRightChar]))
                numberOfRightChar--;
            else {
                changeCharacters(charArrayOfWord, numberOfLeftChar, numberOfRightChar);
                numberOfLeftChar++;
                numberOfRightChar--;
            }
        }
        return String.valueOf(charArrayOfWord);

    }

    private static char[] changeCharacters(char[] hostOfChars, int firstCharNum, int secondCharNum) {
        char clipboard = hostOfChars[firstCharNum];
        hostOfChars[firstCharNum] = hostOfChars[secondCharNum];
        hostOfChars[secondCharNum] = clipboard;
        return hostOfChars;
    }

}
