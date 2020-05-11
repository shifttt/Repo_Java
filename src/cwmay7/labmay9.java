package cwmay7;

public class labmay9 {
    public static void main(String[] args) {


        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        /**
         * Use below data
         * Dec, Jan, Feb: Winter
         * Mar, Apr, May: Spring
         * Jun, Jul, Aug: Summer
         * Sep, Oct, Nov: Fall
         *
         * print like,
         * Month: January -> Season: Winter
         * Month: February -> Season: Winter
         */


        String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};
        String peace = "peace";
// take values from names-array, print only odd index values (1,3,5...)
        for (int i = 0; i < names.length; i++){
            boolean containPeace = names[i].equalsIgnoreCase(peace);
            boolean containP = names[i].contains("p");
            boolean length = names[i].length() >= 5;
            if (containPeace == false && containP == true && length == true){
                System.out.println("print name: " + names[i]);
                break;
            }
        }


        String[] words = {"happy", "peace", "laugh", "love", "grow", "learn", "happy", "laungh", "loved"};
        // print only duplicate words from words-array


//        int[] numbers = {121, 32, 43, 54, 64, 11, 81, 91, 23, 73};
//        // find the first number which is a perfect square. [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, ...]
//        // display the number.
//        int[] perfectSq = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
//        for (int i = 0 ; i < numbers.length ; i++){
//            for (int j = i + 1; j < perfectSq)
//            if numbers[i] == numbers[i]/
//        }



    }

}
