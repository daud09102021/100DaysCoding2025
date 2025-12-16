import java.util.*;

public class Day100 {

    static int[] arrBaru;

    static int retas(int[] arr) {
        int n = arr.length;
        arrBaru = new int[n];
        Arrays.fill(arrBaru, -1);

        int p = 0;

        for (int x : arr) {
            int idx = x % n;
            while (arrBaru[idx] != -1) {
                idx = (idx + 1) % n;
                p++;
            }
            arrBaru[idx] = x;
        }
        return p;
    }

    static String susunKode(int p) {
        StringBuilder sb = new StringBuilder();

        for (int x : arrBaru) {
            if (x != -1) {
                sb.append(x);
            }
        }

        return sb.substring(0, Math.min(p, sb.length()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        System.out.print(susunKode(p));
    }
}
