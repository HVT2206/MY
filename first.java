import java.util.Scanner;

class first {
    static void reverseArray(int[] A, int N) {
        if (A.length % 2 == 1)
            for (int i = 0, k = A.length - 1; i <= A.length / 2; i++, k--) {
                int t = A[i];
                A[i] = A[k];
                A[k] = t;
            }
        else
            for (int i = 0, k = A.length - 1; i <= (A.length - 1) / 2; i++, k--) {
                int t = A[i];
                A[i] = A[k];
                A[k] = t;
            }
        for (int i = 0; i < N; i++)
            System.out.printf(" " + A[i]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter element in Array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        reverseArray(A, N);
        sc.close();
    }
}