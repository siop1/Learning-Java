// Previously, we learned to create array and now we will learn to access the elements of array in different ways
public class _03_AccessingArrayElements{
    public static void main(String[] args){
        int[] arr={401,121,220};

        // Naive way to access elements of array arr
        System.out.println("Naive method:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // Using for-loop (while and do-while can also be used) to access all the elements of array
        System.out.println("Using for-loop:");
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

        // Using foreach-loop(professional method) to array's all elements
         System.out.println("Using foreach-loop:");
        for(int element: arr){
        System.out.println(element);
        }
    }
}