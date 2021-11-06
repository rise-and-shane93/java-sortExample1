public class SortExample1 {
    public static void main(String[] args) {

        int indexSmallest = 0;
        int temp = 0;
        int[] numbers = {7,9,3,18,8};
        int numbersSize = numbers.length;

        System.out.print("Unsorted array is: ");
        // print unsorted array
        for (int k = 0; k < numbersSize; k++) {
            if (k == numbersSize - 1) {
                System.out.print(numbers[k]);
            } else {
                System.out.print(numbers[k] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbersSize - 1; ++i) {

            // Find index of smallest remaining element
            indexSmallest = i;
            for (int j = i + 1; j < numbersSize; ++j) {
         
               if (numbers[j] < numbers[indexSmallest]) {
                  indexSmallest = j;
               }
            }
         
            // Swap numbers[i] and numbers[indexSmallest]
            temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
         }

        System.out.print("Sorted array is: ");
        // print sorted array
        for (int k = 0; k < numbersSize; k++) {
            if (k == numbersSize - 1) {
                System.out.print(numbers[k]);
            } else {
                System.out.print(numbers[k] + ", ");
            }
        }
        System.out.println();
    }
}