package loop;

public class Quiz9 {

	public static void main(String[] args) {
//		중첩반복문을 사용 직사각형
//		우선 하드코딩 해보는것도- 패턴
		
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-----");
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
			
		}
		System.out.println("");
		System.out.println("-----");
		
				
		for(int i = 1; i <= 3; i++) {
			for(int j =1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
