package loop;

public class Quiz4 {

	public static void main(String[] args) {
		// 1~ 100까지의 수 중에서 2의 배수만 출력			반복문: for문 또는  while 반복횟숨 명확: for문 쓰는것이 좋다
		// -> 2 4 6 8 ~ 99 100
		
		
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
