package HomeWorkClass11;

public class Task3 {
    public static void main(String[] args) {
        //3) Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
        String [][] grocery={{"Potato","Tomato","Garlic"},
                {"Apple","Orange","Kiwi"},
                {"Butter","Milk","Cheese"},
                {"Ice cream","Chocolate","Gulab Jamun"}};

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.println(grocery[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------");
        for(String[] gro:grocery){
            for (String fruits:gro){
                System.out.println(fruits+" ");
            }

        }










    }
}
