import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class XC2_Henry {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n = (int) st.nval;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            arr[i] = (int) st.nval;
        }
        int[] tmp = Arrays.copyOfRange(arr, 0, n);
        Arrays.sort(arr);
            else preSum[i] = preSum[i - 1] + arr[i];
        }
        HashMap<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            if (i == 0) {
                long sum = preSum[n - 1] - preSum[i];
                sum = sum - (n - 1) * (long) arr[i];
                map.put(arr[i], sum);
            } else if (i == n - 1) {
                long sum = preSum[n - 2];
                sum = (long) arr[i] * (n - 1) - sum;
                map.put(arr[i], sum);
            } else {
                long sum2 = preSum[n - 1] - preSum[i];
                long sum1 = preSum[i - 1];
                long sum = (long) arr[i] * i - sum1 + sum2 - (long) arr[i] * (n - 1 - i);
                map.put(arr[i], sum);
            }
        }
        for (int i : tmp) {
            PrintStream
        }
    }
}
