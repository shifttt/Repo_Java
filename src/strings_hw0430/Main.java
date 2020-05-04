package strings_hw0430;

public class Main {
    public static void main(String[] args) {


        /**
         *
         * Store your first name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your name starts with "K" (Considering cases)
         *     3. First alphabet of your name
         *     4. Does your name ends with "M" (Ignoring cases)
         *
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Fetch the last word of the sentence
         * 	2. Display the total number of words in the myStatement.
         * 	3. replace all the 'r' characters with 'f' characters.
         *
         * Store your first name in a string variable.
         * Calculate the length of your name, without using length() method of String class.
         */


        // write your code here
// first task
        String myFirstName = "Stephan";
        int myNameLength = myFirstName.length();

        boolean doesNameStartsWithK = myFirstName.startsWith("K");

        char firstAlphabet = myFirstName.charAt(0);

        boolean endsWithM = myFirstName.toLowerCase().endsWith("M");

        System.out.println("1. Display length of the first name - " + myNameLength);
        System.out.println("2. Does your name starts with K - " + doesNameStartsWithK);
        System.out.println("3. First alphabet of your name - " + firstAlphabet);
        System.out.println("4. Does your name ends with M - " + endsWithM);
        System.out.println("***************************************");



//     second task

        String myStatement = "I am a good programmer";
        String lastWord = myStatement.substring(myStatement.lastIndexOf(' ' ));
        String [] breakStatement = myStatement.split(" ");
        int totalNumberOfWords = breakStatement.length;
        String replaceRwithF = myStatement.replace('r', 'f');


        System.out.println("1. Fetch the last word of the sentence - " + lastWord);
        // System.out.println(breakStatement[4]);
        System.out.println("2. Display the total number of words in the myStatement - " + totalNumberOfWords);
        System.out.println("3. replace all the 'r' characters with 'f' characters - " + replaceRwithF);
        System.out.println("***************************************");

// third task

        int lastIndex = myFirstName.indexOf("n");
//        System.out.println(lastIndex);
        int lenghthOfMyName = lastIndex + 1;
        System.out.println("length of my name - " + lenghthOfMyName);



    }

}
