package HomeWorkClass11;

public class Task6 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored
          int sum=0;
        String[][] countries={{"Mexico","Canada","USA","Panama"},
                 {"Peru","Argentina","Chile","Venezuela"},
                 {"Germany","United Kingdom","Ukraine","Denmark"},
                 {"Thai","Japan","India","Nepal","Pakistan"},
                 {"Egypt","Madagascar","Mali","Morocco","Chad"}};

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum++;
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*************");
        for (String[] coun:countries){
            for (String count:coun){
                System.out.print(count+" ");
            }
            System.out.println();
        }
        System.out.println("total countries" +sum);
    }
}
