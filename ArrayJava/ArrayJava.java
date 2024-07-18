public class ArrayJava{
    public static void main(String[] args) {
        //----------------------------  Array -----------------------
        // Declarations & initialization
        int[] x = new int[10];

        // Array literal Way
        int[] y = {1,2,3,4};

        // Adding & Updating
        x[0] = 10;
        x[1] = 5;
        x[0] = 5;

        //---------------------------- 2D Array -----------------------
        int row = 10;
        int column = 10;
        
        int[][] xy = new int[row][column];
        // Column Define in initial time is optional but before adding data must have to define

        // Add elements
        xy[1][2] = 10;


    }
}