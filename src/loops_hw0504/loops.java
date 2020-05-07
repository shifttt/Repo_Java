package loops_hw0504;

import com.sun.codemodel.internal.JSwitch;

import java.sql.SQLOutput;

public class loops {
    public static void main(String[] args) {


        /**
         * Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        int studentScore = 20;
        int maxScore = 150;
//calculate percentage
//Your percentage: XX.yy and your grade is: A
        double studentScorePercentage = studentScore * 100 / maxScore;


        if (studentScorePercentage >= 91 && studentScorePercentage <= 100) {
            System.out.println("Grade A: " + studentScorePercentage);
        } else if (studentScorePercentage >= 81 && studentScorePercentage <= 90) {
            System.out.println("Grade B: " + studentScorePercentage);

        } else if (studentScorePercentage >= 71 && studentScorePercentage <= 80) {
            System.out.println("Grade C: " + studentScorePercentage);
        } else if (studentScorePercentage >= 61 && studentScorePercentage <= 70) {
            System.out.println("Grade D: " + studentScorePercentage);

        } else if (studentScorePercentage >= 51 && studentScorePercentage <= 60) {
            System.out.println("Grade E " + studentScorePercentage);
        } else {
            System.out.println("Grade F YOU FAILED:" + studentScorePercentage);
        }


/**
 * Checking car mode (P, D, N, R)
 * if car mode is P and "you can park car"
 * if car mode is D drive car
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car mode is N you can "put car in car wash"
 * if car mode is R you can "revere the car"
 */
        char gear = 'D';
        boolean Sport = true;
        boolean Snow = true;
        boolean Eco = false;

        switch (gear) {
            case 'P':
                System.out.println("you can park your car");
                break;
            case 'D':
                if (Sport == true && Snow == false && Eco == false) {
                    System.out.println("You are on Sport mode");
                } else if (Snow == true && Sport == false && Eco == false) {

                    System.out.println("You are on Snow mode");
                } else if (Eco == true && Snow == false && Sport == false) {
                    System.out.println("You are on Eco mode");

                } else {
                    System.out.println("you are in D mode please select the right driving type");
                }
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;

            case 'R':
                System.out.println("reverse the car");

                break;
        }


    }


    /**
     * store value in an int variable
     * if number is divisible by 3, print "divisible by 3"
     * if number is divisible by 5, print "divisible by 5"
     * if number is divisible by 3 and 5, print "divisible by both"
     * if not divisible by 3 or 5, print the number
     *
     */








}
