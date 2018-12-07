package selenuimDemo;

public class m3
{

    public int a,b,c;
    

	public void c(int a,int b,int c)
    {
		//this()
    	//this(1000,2000,3000);
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	//System.out.println("am in m3");
    	System.out.println();
    	System.out.println(this.a);
    	System.out.println(this.b);
    	System.out.println(this.c);
    	//return a;
    }
    
	public static void main(String[] args)
	{
		
		m3 d=new m3();
		d.c(100,200,300);
		

	}

}
