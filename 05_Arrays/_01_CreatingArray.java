/* Array is a collection of similar types of data. It is used to hold multiple values under single name 
Here, we will learn to create array in different ways

*/
public class _01_CreatingArray{
    public static void main(String[] args){
    // We can create in three ways.

        // Used when we assign values to array later
            int[] marks; // Declaration
            marks=new int[3]; // Memory allocation
            marks[0]=20;
            marks[1]=50;
            marks[2]=30;
            // marks[3]=12; // Error because array size is 3 and can store only three values.


        // Similar to above one
            int[] height= new int[3]; // Declaration + Memory allocation
            height[0]=4;
            height[1]=3;
            height[2]=7;

        // Initialization of array during its declaration
            int[] roll={401,121,220};

        // Note: length property of array holds size of array
         System.out.println(roll.length); // 3 because roll has 3 elements;
        }
    }