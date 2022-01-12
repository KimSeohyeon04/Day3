import java.util.Scanner;

public class tast6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("시를 입력하시오");
		int H = in.nextInt();
		System.out.println("분을 입력하시오");
		int M = in.nextInt() ;
		in.close();
		
		if(M < 45)
		{
			H--;
			M= 60 - (45 - M);
			if(H < 0)
			{
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else
		{
			System.out.println(H + " " + (M - 45));
		}
	}
}
