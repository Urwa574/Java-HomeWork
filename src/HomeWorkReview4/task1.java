package HomeWorkReview4;

public class task1 {
    public static void main(String[] args) {
        //create a digital clock
        for (int hours = 0; hours <=23; hours++) {
            for (int mins = 0; mins <=59 ; mins++) {
                for (int sec= 0; sec <=59 ; sec++) {
                    System.out.println(hours+":"+mins+":"+sec);
                }

            }}
        System.out.println("********");//2nd way
            for (int i = 0; i <=2 ; i++) {
                for (int j = 0; j <=9 ; j++) {
                    if (i==2 && j==4){
                        break;
                    }
                    for (int k = 0; k <= 59; k++) {
                        if (k<10){
                            System.out.println(i+""+j+":0"+k);
                        }else {
                            System.out.println(i+""+j+":"+k);
                        }
                    }}

        }
    }
}
