package qita;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * Created by 梅晨 on 2017/9/13.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int[] apples = new int[num];
            int sum = 0;
            for(int i = 0; i < num; i++){
                int a = in.nextInt();
                sum += a;
                apples[i] = a;
            }
            int avg = sum / num;
            if(sum % num != 0){
                System.out.println(-1);
                return;
            }
            int res = 0;
            for(int n : apples){
                if(n > avg){
                    int over = n - avg;
                    if(over % 2 != 0){
                        System.out.print(-1);
                        return;
                    }else {
                        res += over / 2;
                    }
                }
            }
            System.out.println(res);
        }
    }
}