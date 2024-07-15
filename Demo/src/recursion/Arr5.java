package recursion;

public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {40,12,23,55,29};
		int r[]=sortArray(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(r[i]);
		}

	}
     public static int[] sortArray(int ar[])
     {
    	 for(int j=0;j<ar.length;j++)
    	 {
    		 for(int i=0;i<ar.length-1;i++)
    		 {
    			 if(ar[i]>ar[i+1])
    			 {
    				 int temp=ar[i];
    				 ar[i]=ar[i+1];
    				 ar[i+1]=temp;
    			 }
    		 }
    	 }
    	 return ar;
     }
	{
		
	}

}
