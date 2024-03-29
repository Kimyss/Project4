package conditional;

public class Quiz4 {

	public static void main(String[] args) {
		//정수형 변수 i를 선언하고 숫자 값을 대입
		//i가  100 < i < 200 속해있다면  	=> 조건. 	'포함'되어야 하기 때문에 논리곱 &&
		//"i는 100이상 200이하 입니다" 라는 메세지를 출력하세요		=> if { }
		//그렇지 않다면 "i는 100보다 작거나 200보다 큽니다" 라는 메세지를 출력  => else { }
		
		int i = 50;
		
		if(i > 100 && i < 200) {
			System.out.println("i는 100이상 200이하 입니다");
		} else {
			System.out.println("i는 100보다 작거나 200보다 큽니다");
		}

	}

}
