// Java program for the above approach
import java.util.*;
public class prac6_2 {
    public void printOddIndexNumber()
	{

        for(int i=0;i<a.length-1;i++){  
            if(i%2!=0){  
            System.out.println(a[i]+"(odd index)");  
            }  
        }
    }
    public  void printEvenIndexNumber()
	{

        for(int i=0;i<a.length-1;i++){  
            if(i%2==0){  
            System.out.println(a[i]+"(even index)");  }}
              
		
	}

	
	//int a[]={1,2,5,6,3,2};  
    
    Random rd = new Random(); // creating Random object    
    int[] a = new int[5];
    for (int i = 0; i < a.length; i++) {
       a[i] = rd.nextInt();
    }


	public static void main(String[] args)
	{
		
		prac6_2 mt = new prac6_2();

		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				mt.printEvenIndexNumber();
			}
		});

	
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				mt.printOddIndexNumber();
			}
		});
		t1.start();
		t2.start();
	}
}
