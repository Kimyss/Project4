package loop;

public class Quiz8 {

	public static void main(String[] args) {
		
//		구구단 짝수 생략 홀수단만
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 0) {
					continue;
				}
				System.out.println(i + "X" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
	

