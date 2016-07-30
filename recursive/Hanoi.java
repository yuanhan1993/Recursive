package cases;

import java.util.Scanner;

/**
 * 汉诺塔问题
 * 用递归的方法
 * @author YH93
 *
 */

public class Hanoi {
	private int i=1;//记录步数
	/**
	 * 
	 * @param n  盘子数目
	 * @param origin  源塔
	 * @param assist  借用塔
	 * @param destination 目的塔
	 */
	public void hanno(int n,String origin,String assist,String destination){
		if(n==1){
			move(n,origin,destination);
		}else{
			//先将源塔的前n-1个盘子借助目的塔移动到借助塔上
			hanno(n-1,origin,destination,assist);
			//将剩下的一个盘子移动到目的塔上
			move(n,origin,destination);
			//最后将借用塔上的n-1个盘子移动到目的塔上
			hanno(n-1,assist,origin,destination);
			
		}
	}
	public void move(int n,String origin,String destination){
		System.out.println("第"+i+++"步："+n+"号盘子"+origin+"------->"+destination);
	}
	public static void main(String[] args) {
		//输入盘子数
		System.out.println("请输入盘子数：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Hanoi hanoi=new Hanoi();
		hanoi.hanno(n, "A", "B","C");

	}

}
