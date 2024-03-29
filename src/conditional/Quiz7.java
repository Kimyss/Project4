package conditional;

public class Quiz7 {

	public static void main(String[] args) {
		//char타입 변수를 선언하고 문자 b, c, d 중에서 하나를 입력하세요
		//문자에 해당하는 동물을 출력하세요.
		//b 새
		//c 고양이
		//d 강아지
		
		char animal = 'a';
		
		switch(animal) {
		case 'b':						//animal == 'b'		//case 작성 후 비교할 '값' 먼저 작성 후 콜론 :
			System.out.println("새");
			break;
		case 'c':
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");
			break;
//		default:				//필요없으면 default 생략 가능
//			System.out.println("다시입력해");
		}

	}

}
