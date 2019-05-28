package io.zipcoder;



import com.sun.deploy.util.StringUtils;
import java.lang.Object;
/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        Integer counter = 0;
        String[] x = input.split(" ");
        for (String y : x) {
            if (y.charAt(x.length) == 'z' || y.charAt(x.length) == 'y') {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeS,tring("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String result = base.replaceAll(remove,"");
        return result;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
            int lastIndex = 0;
            int countIs = 0;
            int countNot = 0;
            while (lastIndex != -1) {
                lastIndex = input.indexOf("is",lastIndex);
                if (lastIndex != -1) {
                    countIs++;
                    lastIndex += input.length();
                }
            }
            lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = input.indexOf("not",lastIndex);
            if (lastIndex != -1) {
                countNot++;
                lastIndex += input.length();
            }
        }
            if(countIs == countNot) {return true;}
            else {return false;}

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean gIsHappy = false;
        String [] inputArr = input.split("");
        for (int i = 1; i <inputArr.length - 1 ; i++) {
            if (inputArr[i].equals("g") && inputArr[i-1].equals("g") && inputArr[i-1].equals("g")) {
                gIsHappy = true;
            }
        }
        return gIsHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        Integer result = 0;
        String [] inputArr = input.split("");
        for (int i = 1; i <inputArr.length - 1 ; i++) {
            if(inputArr[i].equals(inputArr[i-1]) && inputArr[i].equals(inputArr[i+1])) {
                result++;
            }
        }
        return result;
    }
}
