package loop;

public class Quiz10 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		중첩 반복문 사용하여 직삼각형 그리세요
		
//		반복문없이 작성
		System.out.println("*");  	//1 높이에 따라 별의갯수 결정. 별의 갯수는 높이와 같음
		System.out.println("**");	//2
		System.out.println("***");	//3
		System.out.println("****");	//4
		System.out.println("*****");	//5
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {	//외부 for문의 i를 사용함
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
