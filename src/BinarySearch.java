import java.util.Scanner;

public class BinarySearch {
    static public int Binary(int A[], int n, int key) {
        int l = 0, h = n-1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == A[mid]) {
                return mid+1;
            }
            else if (key < A[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static int BinaryRecur(int A[], int l,int h, int key)
    {
          if (l==h) {
              if (A[l]==key) {
                  return l+1;
              } else {
                  return -1;
              }
          } else {
              int mid=(l+h)/2;
              if (key==A[mid]) {
                  return mid+1;
              }
              if (key<A[mid]) {
                  return BinaryRecur(A, l, mid-1, key);
              } else {
                  return BinaryRecur(A, mid+1, h, key);
              }
          }
    }

    public static void main(String[] args) {
        int A[] = {3,4,5,6,8};

        Scanner src = new Scanner(System.in);
        // for (int i = 0; i < A.length; i++) {
        //     int a = src.nextInt();
        //     A[i] = a;
        // }
        System.out.println("Element at " + BinaryRecur(A, 0, 4, 8));

    src.close();}
}
