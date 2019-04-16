package qita;

import java.lang.reflect.Array;
import java.util.Arrays;

public class shuzu {
	public static void shuchu(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void shuchu1(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void shuchu2(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr= {5,1,9,8,6,2,4,3,10,7};
		String[] arr1= { null, "a", null, "a", null, "b", null,
				null, null, "b", null, "c", null, "c", null, null, "d", null,
				null, null, null, null, "d", null, "e", null, null, "e", null,
				null, null, "f", null, "f", null };
		char[] arr2= {'a','c',0,' ','d'};
		shuchu(arr);
		shuchu1(arr1);
		shuchu2(arr2);
		
        Arrays.sort(arr);
        shuchu(arr);
	}

}
