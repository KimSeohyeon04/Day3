import java.util.Scanner;

public class tast8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���ڸ� ���� �Է��ϼ���");
		int jumsu = in.nextInt();
		
		if(jumsu % 11 == 0)
		{
			System.out.println("Yes ! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No ! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
		}
	}
}
