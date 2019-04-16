package exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class wenjianyichang {
	public static void main(String[] args) {
        
        File f= new File("d:/LOL.exe");
          
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
      
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(Exception e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
          
    }
}
