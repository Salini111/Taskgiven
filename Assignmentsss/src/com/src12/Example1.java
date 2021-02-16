package com.src12;

import java.util.function.Function;

public class Example1 {
	public static void main(String[] args) {
		
                  Function<Integer,String> f=(b)->{
	int flag=0;
	String result = null;
	//Integer j=(Integer)b;
	for(int i=2;i<b;i++) {
		if(b%i==0) {
			flag=1;
			break;
		}
		if(flag==1) {
			result="Not a prime";			
		}
		else {
			result="prime";
			//System.out.println("prime");
		}
	}
	return result;	
};

                   Function<Integer,String> f1=(b)->{
	 int r,sum=0,temp;    
	   String result=null;
	 // Integer n=(Integer)b;
	  temp=b;    
	  while(b>0){    
	   r=b%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   b=b/10;    
	  }    
	  if(temp==sum)    
		  result="Palindrome";
	  else    
		  result="Not a palindrome";
	  return result;
};

                  Function<int[],Integer> f2=(n)->{
	Integer flag=0;	
	//int n[]=(int[])b;
	for(int i=0;i<n.length;i++)
                  {
	flag=flag+n[i];
	}		
	return flag;	
};
 
                 Function<int[],Integer> f3=(n)->{
	Integer flag=0;	
	//int n[]=(int[])b;
	for(int i=0;i<n.length;i++) {
	flag=flag+n[i];
	}		
	return flag;		
};

System.out.println(f.apply(29));
System.out.println(f1.apply(151));
System.out.println(f1.apply(150));
int []n= {6,7,8};
System.out.println(f2.apply(n));
}
}

