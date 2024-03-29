package loop;

public class Quiz7 {

	public static void main(String[] args) {
//		3단 ~7단 출력
		
		for(int i =3; i <=7; i++) {
			System.out.println("---구구단---");
			for(int j = 1; j <= 9; j++){
				System.out.println(i + "X" + j + "=" + i*j);
			}
				
		}

	}

}
