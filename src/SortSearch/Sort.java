package SortSearch;

public class Sort {

    //Sắp xếp chèn (Insertion Sort)
    public static void insertionSort(int arr[]) {
        int i, key, j;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    //  Sắp xếp lựa chọn (Selection Sort)

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int i, j, min, temp;
        for (i = 0; i < n; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    min = j; // 2
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Sắp xếp nổi bọt (Bubble Sort)

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++){
            for (j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort

    public static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;  
        int n2 = right - mid;  

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];  

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)  
            L[i] = arr[left + i];   
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[mid + 1 + j]; 

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = left; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) {   
                arr[k] = L[i]; 
                i++; 
            } else {                           
                arr[k] = R[j];
                j++; 
            }
            k++; 
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {

            // Tìm điểm chính giữa
            int mid = (left + right) / 2;    

            // Hàm đệ quy tiếp tục chia đôi
            mergeSort(arr, left, mid);          
            mergeSort(arr, mid + 1, right);   

            merge(arr, left, mid, right); 
        }
    }

    // Quick sort

    public static int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];   
        arr[i + 1] = arr[right];  
        arr[right] = temp;        
                           
        return i + 1;      
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pi = partition(arr, left, right);
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    // heap sort

    public static void heapify(int arr[], int length, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < length && arr[left] > arr[largest])
            largest = left;
        if (right < length && arr[right] > arr[largest])
            largest = right;

        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, length, largest);
        }
    }

    public static void heapSort(int arr[]) {
        int length = arr.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void printArray(int arr[]) {
        int i;
        int n = arr.length;

        for (i = 0; i < n; i++) {
            System.out.println("mang moi" + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 11, 13, 2};
        bubbleSort(arr);
        quickSort(arr, 0, arr.length-1);
        heapSort(arr);
        printArray(arr);
    }
}

