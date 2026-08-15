import java.util.Scanner;

class MaxMinArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;
		
		System.out.print("Enter Array Size: ");
		int Size = scanner.nextInt();
		
		int[] array = new int[Size];
		
		System.out.print("Enter " + Size + " Array Elements: ");
		for(int i=0;i<Size;i++) {
			array[i] = scanner.nextInt();
		}
		
		Print(array);
		
		for(int i=0;i<Size;i++) {
			if(array[i] > MAX) MAX = array[i];
			if(array[i] < MIN) MIN = array[i];
		}

		System.out.println("\nMAX: " + MAX);
		System.out.println("MIN: " + MIN);
	}
	
	static void Print(int[] arr) {
		System.out.print("Array: ");
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}