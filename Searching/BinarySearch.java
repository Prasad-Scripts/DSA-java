import java.util.Scanner;

class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter " + size + " elements: ");
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Array: ");
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.print("Enter Target Value: ");
		int target = scanner.nextInt();
		
		int result = BinarySearch(array,target);
		if(result != -1) {
			System.out.print("Element " + target + " Found at index of " + result);
		} else {
			System.out.print("Element Not Found");
		}

		scanner.close();
		
	}	
		static int BinarySearch(int[] array , int target) {
			int low = 0;
			int high = array.length - 1;
			int mid;
			
			while(low <= high) {
				mid = (low + high)/2;
				
				if(array[mid] == target) {
					return mid;
				} else if(array[mid] > target) {
					high = mid - 1;
				} else if(array[mid] < target) {
					low = mid + 1;
				}
			}			
			return -1;						
		}
}
