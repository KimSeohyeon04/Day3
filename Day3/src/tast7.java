import java.util.Scanner;

public class tast7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("N�� ���� �Է��Ͻÿ�");
		int N = in.nextInt();
		
		in.close();
		
		for(int i =1; i<10;i++)
		{
			System.out.println(N + "*" +i+ "="+(N*i));
		}
	}

}
