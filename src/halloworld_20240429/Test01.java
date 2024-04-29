/*
연습으로 만든 자바파일
20204-04-29
만든이 : 홍길동
*/

package halloworld_20240429;

public class Test01 {

	public static void main(String[] args) {
		
		// 정수 변수 X를 선언
		int X;  // 메모리(ram)에 4byte 공간이 하나 생성됨 -> 이름이 X로
		X = 10;  // 위에서 선언된 정수 변수 x에 정수값 10이 저장됨 -> X의 초기값은 10이다 -> X를 초기화했다
		int y = 10;
		int z;
		// int x, y, z; // 한번에 3개의 정수변수를 선언(타입이 같을때)
		// int X; // 이미 선언된 변수를 다시 선언하는 것은 불가!
		X = 100;
		int a = 100;  // 정수변수 a를 선언과 동싱에 100으로 초기화
		
		z = a + y;
		
		System.out.println("저의 수학점수는" + a + "점 입니다!");
		
		if (a >= 100) {
			System.out.println("저의 수학점수는" + a + "점 입니다!");
			System.out.println("저의 수학점수는" + a + "점 입니다!");
			System.out.println("저의 수학점수는" + a + "점 입니다!");
		} else {
			System.out.println("저의 수학점수는" + a + "점 아닙니다!");
			System.out.println("저의 수학점수는" + a + "점 아닙니다!");
			System.out.println("저의 수학점수는" + a + "점 아닙니다!");
		}
		
		int b;
		
		char c = 'A'; // c변수에 65가 저장 -> 한 개의 문자는 ''로 묶음
		//char d = "A"; // 에러 발생 -> ""로 묶었다는 것은 문자열을 의미
		
		double e1 = 10.1;
		
		String f = "Korea"; // 문자열은 String(첫글자 대무나!!!)로 선언
		
		float e2 = 3.14f;    // float 는 숫자 뒤에 f까지 써줘야함
		
		long k = 10L;    // long변수 확인하기 위에 숫자 뒤에 L사용
		
		boolean aaa = true;  // true, false는 소문자로
		boolean bbb = false;
		
		System.out.println("큰따옴표\"\"를 찍어봅시다");
		
	}
	
	int a = 10;
	
}









