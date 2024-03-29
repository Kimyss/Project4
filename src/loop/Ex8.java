package loop;

public class Ex8 {

	public static void main(String[] args) {
		
		// continue 사용하여 1 ~ 10사이의 홀수들의 합 구하기  -> 10번 반복하면 되고 홀수인 경우에만 더해 조건을 만족하는 겨웅에만 sum을 더해
		
		int sum = 0;								//합계를 저장하는 변수
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {							//i가 짝수라면
				continue;							//다음코드를 수행하지 않고 skip
			}
			sum = sum + i;	
		}
		System.out.println("1부터 10까지의 홀수들의 합은" + sum + "입니다.");

	}

}
