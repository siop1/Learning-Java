
public class _04_MultiDimensionalArray {

    public static void main(String[] args) {
        // 2D Array with Declare + Memory allocation
        int[][] matrix = new int[2][3];
        matrix[0][0] = 12;
        matrix[0][1] = 2;
        matrix[0][2] = 7;
        matrix[1][0] = 5;
        matrix[1][1] = -10;
        matrix[1][2] = 8;

        // We can also create 2D array by initializing it while declaring
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        // Accessing the array with naive way
        System.out.println("Without Matrix Form using Naive method:");
        System.out.println(myNumbers[0][0]);
        System.out.println(myNumbers[0][1]);
        System.out.println(myNumbers[0][2]);
        System.out.println(myNumbers[0][3]);
        System.out.println(myNumbers[1][0]);
        System.out.println(myNumbers[1][1]);
        System.out.println(myNumbers[1][2]);

        System.out.println("Matrix Form using Naive method:");
        System.out.print(myNumbers[0][0] + "\t");
        System.out.print(myNumbers[0][1] + "\t");
        System.out.print(myNumbers[0][2] + "\t");
        System.out.print(myNumbers[0][3] + "\t");
        System.out.println();
        
        System.out.print(myNumbers[1][0] + "\t");
        System.out.print(myNumbers[1][1] + "\t");
        System.out.print(myNumbers[1][2] + "\t");
        System.out.println();




        /* Previously, we accessed elements of array using for-loop and 
        for-each loop, we can also access all the elements of multidimensional array 
         */
            // Accesing the array using for-loop
             System.out.println("Without Matrix form using for-loop: ");
            for (int i = 0; i < myNumbers.length; i++) {
                for (int j = 0; j < myNumbers[i].length; j++) {
                    System.out.println(myNumbers[i][j]);
                }
            }

            System.out.println("Matrix form using for-loop: ");
            for (int i = 0; i < myNumbers.length; i++) {
                for (int j = 0; j < myNumbers[i].length; j++) {
                    System.out.print(myNumbers[i][j] + "\t");
                }
                System.out.println();
            }

           

            // Accessing the array using foreach-loop
            System.out.println("Without Matrix form using foreach-loop: ");
            for(int[] row: myNumbers){
                for(int element: row){
                    System.out.println(element);
                }
            }

             System.out.println("Matrix form using foreach-loop: ");
            for(int[] row: myNumbers){
                for(int element: row){
                    System.out.print(element + "\t");
                }
                System.out.println();
            }
       
       
    }
}
