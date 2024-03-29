package loop;

public class Quiz6 {

	public static void main(String[] args) {
		// for문을 사용해 1부터 100까지 더하는 코드를 작성
		// 단 중간에 합이, 500이 넘어가면 중단
		// for문이 종료되기전 num과 sum의 값을 출력
		// 결과 i는 32 sum 525
		
		int i;
		int sum = 0; 
		for(i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println("i: " + i + " sum: " + sum);
			if(sum >= 500) {
				break;
			}
		}
		System.out.println("i는 "  + i + " sum은 " + sum);
	}
			
}


