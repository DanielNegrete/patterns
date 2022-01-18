package src;

public class Pattern2 {

	public static void main(String[] args) {
		AsteriskPatern();
	}
	
	private static void AsteriskPatern() {
		for(int i =1; i<= 5; i++) {
			if(i%2 == 0) {
				System.out.print(" ");	
				for(int j=0; j<4; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int a = 0; a<6; a++) {
					System.out.print("*");
				}	
			}
			System.out.println();
		}
	}

}
