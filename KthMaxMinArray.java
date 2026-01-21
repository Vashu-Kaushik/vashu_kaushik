import java.io.BufferedInputStream;
import java.util.Random;

public class KthMaxMinArray {

    /**
     * Finds the k-th smallest and k-th largest elements in an array (1-based k).
     * This uses Quickselect (average O(n)) and treats duplicates as separate elements.
     *
     * Input format (stdin):
     * n
     * a1 a2 ... an
     * k
     *
     * Output:
     * k-th minimum: <value>
     * k-th maximum: <value>
     */
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        if (n <= 0) {
            System.out.println("Invalid n");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = fs.nextInt();

        int k = fs.nextInt();
        if (k < 1 || k > n) {
            System.out.println("Invalid k (must be between 1 and n)");
            return;
        }

        // Work on copies so the operations do not interfere with each other.
        int[] copyForMin = arr.clone();
        int[] copyForMax = arr.clone();

        int kthMin = quickSelect(copyForMin, 0, n - 1, k - 1);         // (k-1)-th index
        int kthMax = quickSelect(copyForMax, 0, n - 1, n - k);         // n-k index

        System.out.println("k-th minimum: " + kthMin);
        System.out.println("k-th maximum: " + kthMax);
    }

    // Quickselect to find the element that would be at index k if the array were sorted.
    private static int quickSelect(int[] a, int left, int right, int kIndex) {
        Random rnd = new Random(42); // fixed seed for stable behavior across runs
        int l = left, r = right;

        while (l <= r) {
            int pivotIndex = l + rnd.nextInt(r - l + 1);
            int pivotFinal = partition(a, l, r, pivotIndex);

            if (pivotFinal == kIndex) return a[pivotFinal];
            if (pivotFinal < kIndex) l = pivotFinal + 1;
            else r = pivotFinal - 1;
        }
        // Should never happen for valid inputs.
        throw new IllegalStateException("Quickselect failed");
    }

    // Lomuto partition: places pivot in its final sorted position; returns that index.
    private static int partition(int[] a, int left, int right, int pivotIndex) {
        int pivotValue = a[pivotIndex];
        swap(a, pivotIndex, right);

        int store = left;
        for (int i = left; i < right; i++) {
            if (a[i] < pivotValue) {
                swap(a, store, i);
                store++;
            }
        }
        swap(a, store, right);
        return store;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // Minimal fast input reader for integers.
    private static final class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        int nextInt() {
            int c = read();
            while (c <= ' ' && c != -1) c = read();
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        private int read() {
            if (ptr >= len) {
                try {
                    len = in.read(buffer);
                    ptr = 0;
                } catch (Exception e) {
                    return -1;
                }
                if (len <= 0) return -1;
            }
            return buffer[ptr++] & 0xff;
        }
    }
}