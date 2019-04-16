package neibulei;

public class Chengyuan {
	private double radius = 0;
    public static int count =1;
    public Chengyuan(double radius) {
        this.radius = radius;
    }
     
    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println(radius);  //外部类的private成员
            System.out.println(count);   //外部类的静态成员
        }
    }
    
    public static void main(String[] args) {
    	Chengyuan one=new Chengyuan(33.00);
    	Chengyuan.Draw draw = one.new Draw(); 
    	draw.drawSahpe();
    }
}


