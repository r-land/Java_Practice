package MasterpieceJava.ch2;

import java.util.Scanner;

public class chap2_8 {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}	//책에서 제시한 메소드
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 점의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("두 번째 점의 좌표를 입력하시오>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(inRect(x1, y1, 100, 100, 200, 200) && inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("사각형이 겹칩니다.");
		else
			System.out.println("사각형이 겹치지 않습니다.");
		
		scanner.close();
	}
}
