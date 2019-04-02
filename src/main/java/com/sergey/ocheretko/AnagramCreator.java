package com.sergey.ocheretko;

public class AnagramCreator {

    private static final String SEPARATOR = " ";

    public  static String Stringreverseways(String inputString) {
        return String.join(SEPARATOR, inreverseStrings(inputString.split(SEPARATOR)));
    }

    private static String[] inreverseStrings(String[] strings) {
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
                ChangeCharacters(charArrayOfWord, numberOfLeftChar, numberOfRightChar);
                numberOfLeftChar++;
                numberOfRightChar--;
            }
        }
        return String.valueOf(charArrayOfWord);

    }

    private static char[] ChangeCharacters(char[] arrayOfChars, int firstCharNum, int secondCharNum) {
        char clipboard = arrayOfChars[firstCharNum];
        arrayOfChars[firstCharNum] = arrayOfChars[secondCharNum];
        arrayOfChars[secondCharNum] = clipboard;
        return arrayOfChars;
    }

}
