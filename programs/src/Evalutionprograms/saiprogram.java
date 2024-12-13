package Evalutionprograms;

public class saiprogram {

	public static void main(String[] args) {
		int a[]= {9,2,3,556,7};
        int large=a[0];
        int small=a[0];
	    for(int i=0;i<a.length;i++)
	    {
//	    	if(a[i]<small)
//               {
	    	if(a[i]>large)
	    	{
              
	    		large=a[i];
	    		small=a[i];
	    	}
               }
//	    }
//	    System.out.println("This is the smallest element in the given array :" +small);
	    System.out.println( " This is the largest element in the given array  :" +large);
	}
	}

