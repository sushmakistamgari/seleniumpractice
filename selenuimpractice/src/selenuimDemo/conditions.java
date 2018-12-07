package selenuimDemo;

public class conditions
{
	public void equality()
	{
        int a=10; 
        int b=20;
    if(a>b)
    {
    	System.out.println("a is greater than b "+a);
    }
    else if(b>a)
    {
    	System.out.println("b is greater"+b);
    }
    else {
    	System.out.println("equal");
    
    }
    
	}
	public void while1()
	{
		int n=1,i=10;
		System.out.println("while");
		while(n<=i)
		{
			
			System.out.println("number"+n);
			n++;
			
		}
	}
		public void dowhile()
		{
			int n=11, i=20;
			System.out.println("dowhile");
			do
			{
				System.out.println("number"+n);
				n++;
			}while(n<=i);
				
		}
		public void forloop()
		{
			int n=1; 
			int j = 5;
			System.out.println("forloop");
			for( n=1;n<=j;n++)
			{
				System.out.println("number"+n);
			}
		}
	public static void main(String[] args)
	{
		conditions c =new conditions();
		c.equality();
		c.while1();
		c.dowhile();
		c.forloop();

	}

}
