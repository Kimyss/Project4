package conditional;

public class Quiz3 {

	public static void main(String[] args) {
		//문자형 변수 gender를 선언, 문자하나를 대입하세요
		//변수 값 F면 "여성입니다"
		//그렇지 않으면 "남성입니다" 출력
		
		char gender = 'M';
		
		if(gender == 'F') {
			System.out.println("여성입니다");
		} else {
			System.out.println("남성입니다");
		}
		
		//디버깅 Debug
		// F6 : 한줄한줄 체크  F8 : 브레이크지점 (내가 지정해놓은 궁금했던 지점 혹은 아는부분 제외, 시간단축) 체크

	}

}
