package loop;

public class Quiz2 {

	public static void main(String[] args) {
		//반복문 사용하여 11부터 20까지 합을 구하고 출력
		
		int i = 11;
		int sum = 0;
		
		while(i <=20) {							//num이 20이 될 때까지 반복수행
			sum = sum + i;						// 11 ,12 ~~ 19,20   i의 용도 : 조건, 더해지는 수
			i++;
		}
		System.out.println("11부터 20까지의 합: " + sum);
		
	}
}