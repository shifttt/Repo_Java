package loops_hw0507;

public class loops {
    public static void main(String[] args) {



/**
 * Write code to create abbreviation for any given string
 * Example: String msg = "Outfit of the day" //
 * Expected: OOTD //GM HAGDTY
 * String msg = "have a great day to you"
 *
 * //code
 *
 * sout("Abbreviation : " + abr);
 */
        String msg = "have a great day to you";
        String abr = "";

//code
        for (String R : msg.split(" ")) {
            abr += R.toUpperCase().charAt(0);
        }
       System.out.println("Abbreviation: " + abr);
/**
 *
 */
        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);

//        for  (String k : line.toLowerCase().split(" ")) {
//            k = k.substring(0,1).toUpperCase() + k.substring(1) + " ";
//            line = "";
//            line += k; }

        String[] lineB = line.toLowerCase().split(" ");
        line = "";
        for (int i = 0 ; i < lineB.length ; i++){
            lineB[i] = lineB[i].substring(0,1).toUpperCase() + lineB[i].substring(1) + " ";

            line += lineB[i];
        }


        System.out.println("Line (After modification) : " + line);
/**
 * reverse a string
 */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
       

// code
        System.out.println("Message in reverse: " + reverseMessage);
/**
 * Check if word is palindrome
 */
        String word = "level";  //ecar
        boolean result=false;
//code
        System.out.println("is " + word + " a palindrome: " + result);



    }
}
