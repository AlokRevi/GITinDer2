public class Ascending {

    public static void main(String[] args) {
        int[] arr = {121, 11, 323, 454, 67, 89};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Assume the current index is the minimum

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print the sorted array
        for (int element : arr) {
            System.out.println(element);
        }
    }
}

//package ClassFiles.Oct_29.Minmax;
///public class Ascending {
//
//}
////
////    public static void main(String[] args) {
////        int[] arr = {121, 11, 323, 454, 67, 89};
////int min;
////        for (int i = 0; i <(arr.length-1) ; i++) {
////            for (int j = i+1; j <(arr.length-1) ; j++) {
////                if (arr[j]<arr[i]) {
////                    min = arr[j];
////                }
////                else{
////                    min=arr[i];
////                }
////                arr[i]=min;
////            }
////        }
////
////        for(int elements: arr) {
////            System.out.println(elements);
////        }
////
////
////
////
////
////
////    }
////}
