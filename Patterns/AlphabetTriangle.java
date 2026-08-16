class AlphabetTriangle {
	public static void main(String[] args) {
		char[] array = {'A','B','C','D','E'};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println();
		}
	}
}

/*

OUTPUT

	A
	A B 
	A B C 
	A B C D 
	A B C D E
		
*/