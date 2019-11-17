public class ChristmasTree {

    public static void printTree(int height) {
        System.out.println("I");

        for (int line = 2; line < height; line++) {
            for (int col = 0; col < line; col++) {
                if (col%2==0) {
                    System.out.print("x");
                }
                else {
                    System.out.print("y");
                }
            }
            System.out.println();
        }
        System.out.println("M");
    }

    public static void main(String[] args) {
        printTree(2);
    }
}