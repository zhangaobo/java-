package exception;

public class TestException2 {
	public static void main(String[] args) {
        
        //任何除数不能为0:ArithmeticException
        int k = 5/0;
         
        //下标越界异常：ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;
         
        //空指针异常：NullPointerException
        String str = null;
        str.length();
   }
}
