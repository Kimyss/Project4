package loop;

public class Ex10 {

	public static void main(String[] args) {
//		이중포문 만들시 외부for문 역할과 내부 for문 역할의 용도구분요망
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "단---");
			
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}

	}

}
