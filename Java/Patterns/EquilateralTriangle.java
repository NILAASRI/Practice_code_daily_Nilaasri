class Main {
    public static void main(String[] args) {
        int n = 5;
        //Equilateral triangle
        System.out.println("Equilateral:");
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Reverse Equilateral triangle
        System.out.println("Reverse Equilateral:");
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
