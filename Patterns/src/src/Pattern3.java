package src;

public class Pattern3 {

	public static void main(String[] args) {
		OddEvenPatern();
	}

	private static void OddEvenPatern() {
		for(int i =1; i<= 5; i++) {
			if(i%2 == 0) {	
				for(int j=0; j<3; j++) {
					if(j%2 == 0) System.out.print("**");
					else
					System.out.print("EE");
				}
			}
			else {
				for(int a = 0; a<3; a++) {
					if(a%2 == 1) System.out.print("**");
					else
						System.out.print("OO");
				}	
			}
			System.out.println();
		}
	}

}
