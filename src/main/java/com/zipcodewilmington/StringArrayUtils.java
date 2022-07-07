package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        // for each loop goes through every element in the array to check the condition.
        // in the condition, "String s" is us making a variable for every element in the array.
        // String s is a placeholder. For the first iteration, it is holding the value of array[0].
        // if value is equal to array[0], return true. If not, return false.
        // loop through the rest of the array.
        for( String s : array){
            if (value.equals(s)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
////        using Collections and Arrays
//        Collections.reverse(Arrays.asList(array));
//        return array;


//        String[] str = new String[array.length];
//        for (int i = 0; i < array.length; i++){
//            str[str.length-1-i] = array[i];
////         .length-1-i because if we only set it to .length-1,
////        it will just be changing the same element over and over.
//        }
//        return str;

        for (int i = 0; i < array.length/2; i++){
        //i.array.length/2 because we want to stop the loop at halfway point, so it doesn't reverse back into the original .
            String temp = array[i];
            //this is "the" rn in example 1.
            //placing the element of array at index i in a temp String.
            array[i] = array[array.length-1-i];
            //this is changing "the" to "dog"
            // this line is already change, the became dog based on #1
            array[array.length-1-i] = temp;
            //this is changing dog to "the"

        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(Arrays.asList(array));

        ArrayList<String> reverseArray = new ArrayList<>(Arrays.asList(array));

        if (arrayList.equals(reverseArray)){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = Arrays.toString(array);

        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!alphaList[i])
                flag = 0;
        }
        if (flag == 1)
            return true;
            else return false;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < arrayList.size(); i++){
            //arrayList does not use length. it use .size() instead.
            if (valueToRemove.equals(arrayList.get(i))) {
                //arrayList does not use [] but they use method .get instead.
                arrayList.remove(arrayList.get(i));
            }
        }

        String[] newArray = arrayList.toArray(new String[0]);
        //the [0] means you are making a new array with zero elements.
        //the return type is String[] so you cannot return an ArrayList.
        //Must covert ArrayList back to an Array.

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;
    }
}
