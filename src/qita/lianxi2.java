package qita;

import java.util.*;
import java.math.BigInteger;
public class lianxi2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x=sc.nextInt();
            int k=sc.nextInt();
            StringBuilder res=new StringBuilder();
            String k_bin=Integer.toString(k, 2);
            int index=k_bin.length()-1;
            while(k!=0){
                if((x&1)==0){
                    res.append(k_bin.charAt(index--));
                    k/=2;
                }else{
                    res.append("0");
                }
                x>>>=1;
            }
            BigInteger num=new BigInteger(res.reverse().toString(), 2);
            System.out.println(num);
            sc.nextLine();
        }
    }
}