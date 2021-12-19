public class HeapSort {
    static void sort(int arr[]) {
        int len = arr.length;
        // System.out.println(len);
        for (int i = len / 2 - 1; i >= 0; i--) {   // last subtree parent node index position = len/2-1
            heapify(arr, len, i);
        }
        for(int i =len -1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int larg = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left <n && arr[left] > arr[larg]) {
            larg=left;
        }
        if (right <n && arr[right] > arr[larg]) {
            larg=right;
        }
        if (larg!=i) {
            int temp=arr[i];
            arr[i]=arr[larg];
            arr[larg]=temp;
            heapify(arr, n, larg);
        }
    }
    static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int A[] = { 22, 3, 55, 7, 88, 90, 10 };
        sort(A); 
        print(A);
        
    }
}
