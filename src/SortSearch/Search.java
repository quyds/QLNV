package SortSearch;

public class Search {

    //Tìm kiếm tuyến tính(Linear Search)

    public static int linerSearch(int[] arr,int key ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //Tìm kiếm nhị phân(Binary Search)

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if ( end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, start, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, end, key);
            }
        }
        return -1;
    }

    // Tìm kiếm nội suy(Interpolation Search)

    public static int interSearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (end >= start && key >= array[start] && key <= array[end]) {
            int probe = start + (key - array[start]) * (end - start) / (array[end] - array[start]);
            if (array[probe] == key) {
                return probe;
            }
            if (array[probe] < key) {
                start = probe + 1;
            }
            if (array[probe] > key) {
                end = probe - 1;
            }

        }

        return -1;
    }

    // Tìm kiếm tam phân (Ternary Search)

    public static int ternarySearch(int arr[], int left, int right, int key) {
        if ( right > left ) {
            int mid1 = left + ( right - left)/3;
            int mid2 = right - (right - left)/3;

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);
            } else if (key < arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 -1, key);
            }
        }
        return -1;
    }

    // Tìm kiếm nhảy (Jump Search)

    public static int jumpSearch(int arr[], int length, int key) {
        int step = (int) Math.sqrt(length);
        int i = 0;
        int j = i + step;

        while (j < length && arr[j] < key ) {
            j = j + step;
            i = i + step;
        }

        if (j >= length)
            j = length -1;

        while (arr[i] < key) {
            i = i + 1;
            if (i >= length || i > j) {
                return -1;
            }
        }

        if (arr[i] == key) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10 , 11};
        int key = 5;
        int a = (int) Math.sqrt(11);
        System.out.println(key + " trong mang search o vi tri " + linerSearch(array, key));
        System.out.println(key + " trong mang search o vi tri " + binarySearch(array, 0, array.length - 1, key));
        System.out.println(key + " trong mang search o vi tri " + interSearch(array, key));
        System.out.println(key + " trong mang search o vi tri " + binarySearch(array, 0, array.length - 1, key));
        System.out.println(key + " trong mang search o vi tri " + jumpSearch(array,  array.length - 1, key));
    }
}
