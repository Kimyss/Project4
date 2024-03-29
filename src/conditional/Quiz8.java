package conditional;

public class Quiz8 {

	public static void main(String[] args) {
		
		/*
		 * switch문을 사용할것
		 * 
		 * 점수가 90~99 이면 "수"
		 * 점수가 80~89 이면 "우"
		 * 점수가 70~79 이면 "미"
		 * 그외는 "양"을 출력하세요.
		 * */
		
		int score = 99;
		int value = score / 10;
		
		switch(value) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
		}
	}
}

