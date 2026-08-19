import java.util.Scanner;

class ArrayReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp = 0;
		
		System.out.print("Enter Size of the array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter " + size + " Elements: ");
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Before Array: ");
		Print(array);
		
		for(int i = 0; i < size / 2; i++) {
			temp = array[i];
			array[i] = array[size - 1 - i];
			array[size - 1 - i] = temp;
		}
		
		System.out.print("\nAfter Array: ");
		Print(array);
		
		scanner.close();
	}
	
	static void Print(int[] array) {	
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}