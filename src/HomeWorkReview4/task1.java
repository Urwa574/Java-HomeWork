package HomeWorkReview4;

public class task1 {
    public static void main(String[] args) {
        //create a digital clock
        for (int hours = 0; hours <=23; hours++) {
            for (int mins = 0; mins <=59 ; mins++) {
                for (int sec= 0; sec <=59 ; sec++) {
                    System.out.println(hours+":"+mins+":"+sec);
                }

            }

        }
    }
}
