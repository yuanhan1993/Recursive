package entity;
/**
 * 用迭代的方法求解超越方程式
 * @author YH93
 *f(x)=2*(x+1)^n+e^x=0,假设解x=1
 */
public class Interation {
	private int count=15;//递归count次
	public static void main(String[] args) throws Exception {
		int n=7;//n次方数
		Interation in=new Interation();
		in.action(1, n, n);
		
	}
	/**
	 * f(x)多项式
	 * @param x 变量
	 * @param m （x+1）的次方数
	 * @return
	 */
	public double f(double x,int m){
		return 2*Math.pow(x+1, m)+Math.pow(Math.E, x);
	}
	/**
	 * f(x)导数
	 * @param x 变量
	 * @param n (x+1)的次方数
	 * @return
	 */
	public double fd(double x,int n) {
		return 2*derivative(x, n)+Math.pow(Math.E, x);
	}
	/**
	 * 用递归的方法求解
	 * @param x 变量
	 * @param m f(x)中(x+1)的次方数
	 * @param n f(x)导数中(x+1)的次方数
	 * @return
	 */
	public  double action(double x,int m,int n) {
		
		if(count>0){
			count--;
			x=x-f(x,m)/fd(x,n);
			action(x,m,n--);
			System.out.println(x);
		}else{
			System.out.println("解接近于："+x);
		}
		return x;
		
	}
	/**
	 * 对(x+1)^n求导的方法
	 * @return
	 */
	public  double derivative(double x,double n) {
		if(n>0){
			return n*Math.pow((x+1),n-1);
		}else if(n==0){
           return n;
		}else{
			return n*Math.pow((x+1),n-1);
		}
		
	}

}
