package Self_Practices;

public class StarPatterns {
	public static void main(String[] args) {
		// Pattern 1
		int row =5;
		for(int i1 = 1; i1 <= row; i1++) {
			for(int j1 = 1; j1 <= row; j1++) {
				System.out.print("* " );			
				}
			System.out.println();
		}
		System.out.println(" ");// Because of one line space between each pattern
		
		// Pattern 2 (Right Triangle)
		for(int i2 = 1; i2 <= row; i2++) {
			for(int j2 = 1; j2 <= i2; j2++) {
				System.out.print("* " );			
				}
			System.out.println();
		}
		System.out.println(" ");
		
		// Pattern 3 (Reverse of pattern 2)
		for(int i3 = row; i3 >= 1; i3--) {
			for(int j3 = 1; j3 <= i3; j3++) {
				System.out.print("* " );			
				}
			System.out.println();
		}
		System.out.println(" ");
		
		//Pattern 4 (Equilateral Triangle)
		
		int space = row - 1;
		for(int i4 = 1; i4 <= row; i4++) {
			for(int k4 = 1; k4 <=space; k4++) {
				System.out.print(" ");
			}
			space = space-1;
			for(int j4 = 1; j4 <= i4; j4++) {
				System.out.print("* ");			
				}
			System.out.println();
		}
		System.out.println(" ");
		
		//Pattern 5 (Reverse of pattern 4)
		int space5 = 0;
		for(int i5 = row ; i5 >= 1; i5--) {
			for(int k5 = 1; k5 <= space5; k5++) {
				System.out.print(" ");
			}
			space5 = space5 + 1;
			for(int j5 = 1; j5 <= i5; j5++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
