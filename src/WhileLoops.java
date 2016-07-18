
public class WhileLoops {
	public static void main(String[] args) {
				
				// While loop 1
//				int i = 0;
//				
//				while(i <= 20) {
//					System.out.println(i);
//					i++;
//				}
				
				// While loop 2 - Endless loop
//				String name = "Bram";
//				
//				while(true) {
//					System.out.println(name);
//				}
				
				// While loop 3 - with break
				int loop = 0;
				
				while(true) {
					System.out.println("Looping: " + loop);
					
					if(loop == 2) {
						System.out.println("Bingo number: " + loop);
					}
					
					if(loop == 4) {
						System.out.println("Bingo number: " + loop);
					}
					
					if(loop == 6) {
						System.out.println("Bingo number: " + loop);
					}
					
					if(loop == 10) {
						break;
					}
					
					loop++;
				}
				System.out.println("Exit loop!");
				
	}
}
