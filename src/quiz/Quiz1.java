package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		/* int형 변수를 선언하고 값을 대입하세요
		 * 그리고 조건문을 사용해서 변수의 값이  	 => 문장을 쪼개고 어느 위치에 넣을지 고민하시길-
		 * 2의 배수거나 3의 배수라면 "2또는 3의 배수입니다" 출력   => ~ 거나 :논리합 ||
|		 * */
		
		int x  = 9;
		if(x % 2 == 0 || x % 3 == 0) {
			System.out.println(x + "는 2의 배수거나 3의 배수입니다");
		}

	}

}
