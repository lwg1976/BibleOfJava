package chapter04;

public class FlowEx24 {

	public static void main(String[] args) throws java.io.IOException {
		int input = 0;
		
		System.out.print("문장을 입력하세요.");
		System.out.print("입력을 마치려면 x를 입력하세요.");
		do {
			input = System.in.read();
			System.out.println((char)input);
		} while(input!=-1 && input!='x');
	}
}
