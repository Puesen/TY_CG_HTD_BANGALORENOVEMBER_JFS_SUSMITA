
public class InstanceBlock {


	final int MAXIMUM;
	static final double PI;
	public InstanceBlock(){
		System.out.println("Constructor is called");
	}
	public InstanceBlock(int a){
		System.out.println("Constructor is called");
	}
	
	{
		System.out.println("Instance Initializer block executed");
	this.MAXIMUM=3000;
	}
	static {
		System.out.println("Static Initializer block executed");
		PI=3.142;
	}
	
}
