import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        BubbleSortMethod(array, size);

        System.out.println();
        System.out.print("After Sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    static void BubbleSortMethod(int[] array, int size) {
        int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
