package cases;
/**
 * 用递归算法实现斐波那契数列
 * 递归特点：
 * 1.递归就是方法里调用自身
 * 2.使用递归策略时，必须有一个明确的递归结束条件，称为递归出口
 * 3.程序简洁，但是运行效率低，一般不提倡
 * @author YH93
 *
 */
public class fib {
     public static void main(String[] args) {
		System.out.println("斐波那契数列");
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
