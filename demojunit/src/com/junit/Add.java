package com.junit;
public class Add {
    //hyy
	int a,b,c;
	//hello
	public Add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int sum()
	{
		return a+b+c;
		
	}
	
   public int multiply()
   {
	   return a*b*c;  
   }
   
   
  
	public static void main(String[] args) {
		Add var=new Add(2,3,4);
		System.out.println("The sum  is "+var.sum());
		System.out.println("The multiply is "+var.multiply());
		System.out.println("The divide value is "+var.sum()/10);

	}

}
