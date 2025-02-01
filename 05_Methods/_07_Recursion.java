/*
Recursion is the process of a function calling itself repeatedly till the given condition is satisfied. 

Recursive function is the function that calls itself.
 */

//Question: Use recursion to add all of the numbers up to 10.
public class _07_Recursion {

    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

}

/*
Halting Condition
  Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself. In above example, the halting condition is when the parameter n becomes 0.
  
  Definition: Halting condition is the condition where the function stops calling itself.
 */
