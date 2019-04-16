package fanshe;

import fanshe.Hero;

public class TestReflection {
 
    public static void main(String[] args) {
            String className = "charactor.Hero";
            try {
                Class pClass1=Class.forName(className);
                Class pClass2=Hero.class;
                Class pClass3=new Hero().getClass();
                System.out.println(pClass1);
                System.out.println(pClass2);
                System.out.println(pClass3);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}