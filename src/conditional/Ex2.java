package conditional;

public class Ex2 {

	public static void main(String[] args) {
		
		int age = 10;	//조건으로 사용할 학생의 나이
		
		if(age >= 8) {			
			System.out.println("학교에 다닙니다");		//조건을 만족했을때 수행코드
		} else {		//그렇지 않다면
			System.out.println("학교에 다니지 않습니다");  //조건을 만족하지 않았을때 수행코드
		}
		
		//디버깅 Debug
		// F6 : 한줄한줄 체크  F8 : 브레이크지점 (내가 지정해놓은 궁금했던 지점 혹은 아는부분 제외, 시간단축) 체크
	}
}
