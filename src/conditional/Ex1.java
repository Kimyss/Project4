package conditional;

public class Ex1 {
	/*
	 * <if문>
	 * 만약 나이가 8살 이상이면 '학교에 다닙니다' 출력하기 	-> 변수가 무엇인지 찾기 
	 * */

	public static void main(String[] args) {
		//조건문
		int age = 7;		
		if (age >= 8) { 	//나이가 8살 이상이라면
			System.out.println("학교에 다닙니다");
		} 
		
//		블록의 의미
//		if (age >= 8) {
//			int temp = 0;	//temp는 블록이 끝나기 전까지만 존재
//		}
//		system.out.println(temp);	//변수가 소멸되어 에러
	}

}
