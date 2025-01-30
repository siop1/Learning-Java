
public class _06_Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 3) {
                continue; // skips the current iteration 
            }
            System.out.println(i);
        }
    }
}
