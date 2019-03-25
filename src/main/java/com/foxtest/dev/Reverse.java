package com.foxtest.dev;

public class Reverse {

    public static String reverseAlphabeticChars(String userInput) {
        String[] words = userInput.split(" ");
        String result = "", prefix = "", delimiter = " ";
        for (String word : words){
            char[] chars = word.toCharArray();
            int rightPointer = chars.length - 1, leftPointer = 0;
            while (leftPointer < rightPointer)
            {
                if (!Character.isAlphabetic(chars[leftPointer]))
                    leftPointer++;
                else if(!Character.isAlphabetic(chars[rightPointer]))
                    rightPointer--;
                else
                {
                    char tmp = chars[leftPointer];
                    chars[leftPointer] = chars[rightPointer];
                    chars[rightPointer] = tmp;
                    leftPointer++;
                    rightPointer--;
                }
            }
            result += prefix + new String(chars);
            prefix = delimiter;

        }
            return result;
    }

}
