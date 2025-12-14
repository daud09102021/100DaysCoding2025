public class Day98 {
    int cetakFibonacci(int n) {
        int a = 0, b = 1, c;

        System.out.println("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        Day98 fb = new Day98();
        fb.cetakFibonacci(7);
    }
}
