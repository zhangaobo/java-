package qita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lianxi1 {
    
	public static void fangfa(int[][] data,int n) {
	//Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	//ArrayList<String> arrayList1 = new ArrayList<String>();
	//String str=new String();
	int sum=0;
	int max=0;
	int qiyu=0;
	for(int i=0;i<n;i++) {
		int l1 = data[i][0];
		int l2 = data[i][1];
		if(l1==1) {
			sum+=l2;
			arrayList.add(l2);
			max=Collections.max(arrayList);
			qiyu=sum-max;
			if(qiyu>max) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		else {
			sum-=l2;
			for(int j=0;j<arrayList.size();j++) {
				if(arrayList.get(j)==l2) {
					arrayList.remove(j);
					break;
				}
			}
			max=Collections.max(arrayList);
			qiyu=sum-max;
			if(qiyu>max) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
     
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[][] data=new int[n][2];
            for(int i=0;i<n;i++){
                data[i][0]=sc.nextInt();
                data[i][1]=sc.nextInt();
            }
            fangfa(data,n);
        }
	}

}
