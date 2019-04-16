package xiancheng;

public class TestThread3 {
	 
    public static void main(String[] args) {
         
        Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    
                  
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						// TODO Auto-generated catch block
					
                    
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }              
            }
        };
        t1.start();
         
    }
     
}