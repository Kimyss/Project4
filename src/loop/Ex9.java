package loop;

public class Ex9 {

	public static void main(String[] args) {
		
		//break를 사용하여 1부터 20까지 더하다가,
		//합이 100이 넘어가면 반복문을 중단한다 			중단한다 : break
		//for문이 종료되기전 i와 sum의 값을 출력한다
		
		int sum = 0;						//합계를 출력하는 변수
		int i;								//마지막에 i의 값
		
		for(i = 1; i <= 20; i++) {
			sum = sum + i;
//			System.out.println("i: " + i + ",  sum: " + sum);
			
			if(sum >= 100) {
				break;						//합이 100을 넘으면 for문 종료
			}
		}
		 
		System.out.println("i: " + i);
		System.out.println("sum: " + sum);

	}

}
