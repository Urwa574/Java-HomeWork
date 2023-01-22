package HomeWorkClass11;

public class Task1D2Array {
    public static void main(String[] args) {


        //1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade
        String[][] names = {{"Max", "Leo", "Marry", "David"},//outer/row/i
                            {"A","B","C","D"}}; //inner /col/j
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if(names[i][j].equals("A")||names[i][j].equals("B")){
                    System.out.println(names[0][j]); //0 names ki row hai, j mein name khud hain
                    System.out.println(names[1][j]); // 1 mein grades ki row, j mein grades itself

                }

            }

        }
    }}