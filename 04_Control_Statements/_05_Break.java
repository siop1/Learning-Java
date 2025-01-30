
public class _05_Break {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 3) {
                break; // exits the current loop when i==3
            }
            System.out.println(i);
        }
    }
}
