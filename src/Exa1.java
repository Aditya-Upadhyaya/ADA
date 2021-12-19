public class Exa1 {
    public static void main(String[] args) {
        int A[] = { 1, 5, 3, 4 };
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int multi = 1;
            for (int j = 0; j < B.length; j++) {
                if (A[j] == A[i]) {
                    continue;
                }
                multi = multi * A[j];
            }
            B[i] = multi;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}
