package cases;
/**
 * �õݹ��㷨ʵ��쳲���������
 * �ݹ��ص㣺
 * 1.�ݹ���Ƿ������������
 * 2.ʹ�õݹ����ʱ��������һ����ȷ�ĵݹ������������Ϊ�ݹ����
 * 3.�����࣬��������Ч�ʵͣ�һ�㲻�ᳫ
 * @author YH93
 *
 */
public class fib {
     public static void main(String[] args) {
		System.out.println("쳲���������");
		for(int i=1;i<=10;i++){
			System.out.print(fab(i)+"  ");
		}
	}
     private static int fab(int index){
    	 if(index==1||index==2){
    		 return 1;
    	 }else{
    		 return fab(index-1)+fab(index-2);
    	 }
     }
}
