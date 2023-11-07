// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    class Solution {
        public int lengthOfLastWord(String s) {
            String [] soz = s.trim().split(" ");
            return soz [soz.length-1].length();
    }
    }
}