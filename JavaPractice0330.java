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
		
		
		// 복습문제 2번째장 4번 : 사용자에게 5개의 숫자를 입력 받아 배열에 담아 출력하시오.
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[]{4,3,2,1,7};
		int i;
		
		System.out.println("숫자 5개를 입력하시오");
		for(i=0; i<intArr.length; i++)
		{
			intArr[i] = sc.nextInt();
		}
		System.out.println("배열에 저장된 값");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		// 복습문제 2번째장 4-1번 : 배열의 0번째 인덱스의 배열의 값과 1번째 인덱스 배열의 값을 바꾸어 저장하라.
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		System.out.println("인덱스 배열 바뀐 값");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		

		System.out.println("---------------------");
		

		// 복습문제 2번째장 5번 : 정수 10개를 입력 받아 가장 큰 값과 가장 작은 값을 구하시오.
		Scanner sc2 = new Scanner(System.in);
		int[] intArr2 = new int[10];
		int i2;
		
		System.out.println("숫자 10개를 입력해 주세요.");
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
		System.out.println("최댓 값은 "+ max + "이고, "+ "최솟 값은 " + min + "입니다.");
		
		
		
		System.out.println("---------------------");
		
		

		// 복습문제 2번째장 6번 : 5명의 수학점수를 입력 받아 총점과 평균을 구하라.
		Scanner sc3 = new Scanner(System.in);
		int[] intArr3 = new int[10];
		int i3;
		
		System.out.println("5명의 수학 점수를 입력해 주세요.");
		for(i3=0; i3<intArr2.length; i3++)
		{
			intArr3[i3] = sc.nextInt();
		}
		
		
		// 복습문제 2번째방 7번 : 배열 10개를 저장(1-10까지의 랜덤한 수를 구해 저장)해두고, 검색할 숫자를 입력하여 찾는 프로그램.
		//					(LineSearch 프로그램)
		// 					: 랜덤수 구하기 (Math.random()함수 이용)
	}

}
