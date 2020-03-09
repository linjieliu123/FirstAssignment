
 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*; 
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
        for (int i=0;i < array.length; i++){
            if (array[i].equals(value)){
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
        String[] reverse = new String[array.length];
        for (int i=0; i<array.length; i++){
            reverse[i] = array[array.length -i-1];
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i= 0;i < array.length;i++){
            if (array[i].equals(array[array.length-1-i])){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] marked = new boolean[26];
        int index = 0;
        for (int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length();j++){
                if ('A' <= array[i].charAt(j) && array[i].charAt(j) <= 'Z'){
                    index = array[i].charAt(j) - 'A';
                }
                else if ('a' <= array[i].charAt(j) && array[i].charAt(j) <= 'z'){
                    index = array[i].charAt(j) - 'a';
                }
                marked[index] = true;
            }
            
        }
        for (int i = 0; i< marked.length; i++){
            if (!marked[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i =0; i < array.length; i++){
            if (array[i].equals(value))
                count ++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> newList = new ArrayList<String>();
        for (int i = 0;i < array.length; i++){
            if (!array[i].equals(valueToRemove)) {
                newList.add(array[i]);
            }
        }
        String[] myArray = new String[newList.size()];
        newList.toArray(myArray);
        System.out.print(myArray);
            
        return myArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       List<String> newList = new ArrayList<String>();
        for (int i = 0;i < array.length; i++){
            if (i < (array.length - 1)){
                if (!array[i].equals(array[i+1])){
                newList.add(array[i]);
                }
            }else{
              newList.add(array[i]);
            }
        }
        String[] myArray = new String[newList.size()];
        newList.toArray(myArray);
        System.out.print(myArray);
            
        return myArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newList = new ArrayList<String>();
        int index = 0;
        newList.add(array[0]);
        for (int i = 0;i < array.length-1; i++){
             if (!array[i].equals(array[i+1])){
                newList.add(array[i+1]);
                index ++;
            }else{
              newList.set(index,newList.get(index)+array[i+1]); 
            }
        }
        String[] myArray = new String[newList.size()];
        newList.toArray(myArray);
        System.out.print(myArray);
            
        return myArray;
    }


}
