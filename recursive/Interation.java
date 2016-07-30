package entity;
/**
 * �õ����ķ�����ⳬԽ����ʽ
 * @author YH93
 *f(x)=2*(x+1)^n+e^x=0,�����x=1
 */
public class Interation {
	private int count=15;//�ݹ�count��
	public static void main(String[] args) throws Exception {
		int n=7;//n�η���
		Interation in=new Interation();
		in.action(1, n, n);
		
	}
	/**
	 * f(x)����ʽ
	 * @param x ����
	 * @param m ��x+1���Ĵη���
	 * @return
	 */
	public double f(double x,int m){
		return 2*Math.pow(x+1, m)+Math.pow(Math.E, x);
	}
	/**
	 * f(x)����
	 * @param x ����
	 * @param n (x+1)�Ĵη���
	 * @return
	 */
	public double fd(double x,int n) {
		return 2*derivative(x, n)+Math.pow(Math.E, x);
	}
	/**
	 * �õݹ�ķ������
	 * @param x ����
	 * @param m f(x)��(x+1)�Ĵη���
	 * @param n f(x)������(x+1)�Ĵη���
	 * @return
	 */
	public  double action(double x,int m,int n) {
		
		if(count>0){
			count--;
			x=x-f(x,m)/fd(x,n);
			action(x,m,n--);
			System.out.println(x);
		}else{
			System.out.println("��ӽ��ڣ�"+x);
		}
		return x;
		
	}
	/**
	 * ��(x+1)^n�󵼵ķ���
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
