package cases;

import java.util.Scanner;

/**
 * ��ŵ������
 * �õݹ�ķ���
 * @author YH93
 *
 */

public class Hanoi {
	private int i=1;//��¼����
	/**
	 * 
	 * @param n  ������Ŀ
	 * @param origin  Դ��
	 * @param assist  ������
	 * @param destination Ŀ����
	 */
	public void hanno(int n,String origin,String assist,String destination){
		if(n==1){
			move(n,origin,destination);
		}else{
			//�Ƚ�Դ����ǰn-1�����ӽ���Ŀ�����ƶ�����������
			hanno(n-1,origin,destination,assist);
			//��ʣ�µ�һ�������ƶ���Ŀ������
			move(n,origin,destination);
			//��󽫽������ϵ�n-1�������ƶ���Ŀ������
			hanno(n-1,assist,origin,destination);
			
		}
	}
	public void move(int n,String origin,String destination){
		System.out.println("��"+i+++"����"+n+"������"+origin+"------->"+destination);
	}
	public static void main(String[] args) {
		//����������
		System.out.println("��������������");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Hanoi hanoi=new Hanoi();
		hanoi.hanno(n, "A", "B","C");

	}

}
