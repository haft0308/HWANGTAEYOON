import java.util.Scanner;
public class JavaPractice0330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// page 48 - 1
		int[] a = new int[10];
		for(int i = 0; i<10; i++)
		{
			a[i] = i+1;
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------");
		// page 48 - 2 : length
		
		// page 48 - 3
		int[][]arr=new int[2][3];
		System.out.println(arr.length);
		
		
		
		System.out.println("---------------------");
		
		// page 49 - 1
		int[][]arr2=new int[5][7];
		System.out.println(arr2[4].length);
		
		
		System.out.println("---------------------");
		
		// page 49 - 2
		int[][]arr3=new int[8][3];
		System.out.println(arr3[2].length);
		
		
		System.out.println("---------------------");
		
		
		// �������� 2��°�� 4�� : ����ڿ��� 5���� ���ڸ� �Է� �޾� �迭�� ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[]{4,3,2,1,7};
		int i;
		
		System.out.println("���� 5���� �Է��Ͻÿ�");
		for(i=0; i<intArr.length; i++)
		{
			intArr[i] = sc.nextInt();
		}
		System.out.println("�迭�� ����� ��");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		// �������� 2��°�� 4-1�� : �迭�� 0��° �ε����� �迭�� ���� 1��° �ε��� �迭�� ���� �ٲپ� �����϶�.
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		System.out.println("�ε��� �迭 �ٲ� ��");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		

		System.out.println("---------------------");
		

		// �������� 2��°�� 5�� : ���� 10���� �Է� �޾� ���� ū ���� ���� ���� ���� ���Ͻÿ�.
		Scanner sc2 = new Scanner(System.in);
		int[] intArr2 = new int[10];
		int i2;
		
		System.out.println("���� 10���� �Է��� �ּ���.");
		for(i2=0; i2<intArr2.length; i2++)
		{
			intArr2[i2] = sc.nextInt();
		}
		
		int max, min;
		max = min = intArr2[0];
		for(i2=0; i2<intArr2.length; i2++)
		{
			if(max < intArr2[i2])
			{
				max = intArr2[i2];
			}
			if(min > intArr2[i2])
			{
				min = intArr2[i2];
			}
		}
		System.out.println("�ִ� ���� "+ max + "�̰�, "+ "�ּ� ���� " + min + "�Դϴ�.");
		
		
		
		System.out.println("---------------------");
		
		

		// �������� 2��°�� 6�� : 5���� ���������� �Է� �޾� ������ ����� ���϶�.
		Scanner sc3 = new Scanner(System.in);
		int[] intArr3 = new int[10];
		int i3;
		
		System.out.println("5���� ���� ������ �Է��� �ּ���.");
		for(i3=0; i3<intArr2.length; i3++)
		{
			intArr3[i3] = sc.nextInt();
		}
		
		
		// �������� 2��°�� 7�� : �迭 10���� ����(1-10������ ������ ���� ���� ����)�صΰ�, �˻��� ���ڸ� �Է��Ͽ� ã�� ���α׷�.
		//					(LineSearch ���α׷�)
		// 					: ������ ���ϱ� (Math.random()�Լ� �̿�)
	}

}
