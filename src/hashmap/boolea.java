package hashmap;

import java.util.*;
public class boolea {

	private static boolea bb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 boolea.bb = new boolea();
	 int[] aa= {4,5,6,4,5,9};
	 int[] cc= {};
	 System.out.println(bb.duplicate(aa,4,cc)); 

	}
	
	 public boolean duplicate(int numbers[],int length,int [] duplication) {
         boolean[] k = new boolean[length];
         for(int i=0;i<length;i++){
             if(k[numbers[i]]==true)
             {duplication[0] = numbers[i];
              return true;}
             else
                 k[numbers[i]]=true;
         }
        return false;
    }

}
