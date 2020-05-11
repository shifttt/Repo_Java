package cwmay7;

public class cwm7 {
    public static void main(String[] args) {


        for (int j=2 ; j<=10 ; j+=2) {
            System.out.println("Hello -> j = " + j);

        }
        int total = 0;
        int[] numbers = {87, 90, 95, 120, 543};
        for (int value : numbers){
            total += value;
        }
        System.out.println("total: " + total);

        for (int i = 1 ; i <= 10; i++){
            if (i%3==0){
                System.out.println("odd % 3 " + i);

            }
            else if(i%2==0) {
                System.out.println("even " + i);


            }
            else {
                System.out.println("odd ");
            }

        }


    }
}
