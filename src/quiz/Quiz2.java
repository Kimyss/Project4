package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 정수형 변수 age 선언하고 나이 대입
		 * 문자형 변수 gender를 선언하고 성별을 F 또는 M으로 대입
		 * 나이가 8살이상이고 성별이 여자라면 "여학생입니다" 출력	
		 * 										=> ~이고(AND) :논리곱 &&  ~라면 :조건문
		 * */
		
		int age = 9;
		char gender = 'F';
		if(age >= 8 && gender == 'F') {
			System.out.println("나이는 " + age + "세 이고 여학생입니다");
		}
		//참고 : Ctrl + Space :  자동완성 목록
	}

}
