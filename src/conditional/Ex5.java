package conditional;

public class Ex5 {

	public static void main(String[] args) {
		
		String rank = "1";	//순위
		
		switch(rank) {
		case "1":					//rank의 값이 1이면
			System.out.println("메달 색은 금입니다");
			break;
		case "2":					//rank의 값이 2이면
			System.out.println("메달 색은 은입니다");
			break;
		case "3":					//if(rank ==3)
			System.out.println("메달 색은 동입니다");
			break;
		default:				//변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다");
		}

	}

}
