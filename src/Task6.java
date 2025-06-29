public class Task6 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int asterisk = 1; asterisk <= row; asterisk++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}