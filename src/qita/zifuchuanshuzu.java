package qita;

public class zifuchuanshuzu {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    // 将字符数组转为字符串
	    // 方法一
	    char[] data = { 'a', 'b', 'c' };// 字符数组
	    String str = new String(data);
	    System.out.println(str);
	    // 方法二
	    String str1 = String.valueOf(data);
	    System.out.println(str1);

	    // 将字符串转为字符串数组
	    // 方法一
	    String string = "abc,def,ghi";
	    String[] strArr = string.split(",");//注意分隔符是需要转译
	    for (int i = 0; i < strArr.length; i++) {
	        System.out.println(strArr[i]);
	    }
	    // 方法二
	    String string1 = "abcdefghijk";
	    //截取某段字符串
	    String sub1 = string1.substring(3, 8);
	    System.out.println(sub1);
	    //查找字符串中的某个字符
	    char sub2 = string1.charAt(4);
	    System.out.println(sub2);
	    //字符串删除某几个元素
	    StringBuffer buffer=new StringBuffer(string1);
	    buffer.delete(1, 4);
	    System.out.println(buffer);
	    //字符串插入元素
	    StringBuffer buffer1=new StringBuffer(string1);
	    buffer1.insert(2, '6');
	    System.out.println(buffer1);
	    //替换字符串中的一些字符
	    StringBuffer buffer2=new StringBuffer(string1);
	    buffer2.replace(2, 5, "9");
	    System.out.println(buffer2);
	    char[] strArr1 = string1.toCharArray();
	    for (int i = 0; i < strArr1.length; i++) {
	        System.out.println(strArr1[i]);
	    }
	}
}
