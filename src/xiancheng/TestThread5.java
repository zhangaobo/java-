package xiancheng;

import xiancheng.Hero;

public class TestThread5 {
  
    public static void main(String[] args) {
          
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 6160;
        gareen.damage = 100;
  
        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 3000;
        teemo.damage = 100;
          
        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 5000;
        bh.damage = 100;
          
        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 4505;
        leesin.damage = 100;
          
        Thread t1= new Thread(){
            public void run(){
 
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
         
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
          
    }
      
}
