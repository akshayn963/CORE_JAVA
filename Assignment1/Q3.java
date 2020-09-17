class Q3{
	public static void main(String args[]){
		int x=2;
        int y= x*x +3*x	-7;
		System.out.println("the value of y="+y);
		
		int a=4;
		int b= a++ + ++a;
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);
		
		int p=2;
        int q=4;		
		int r= p++ - --q - --p + p++;
		System.out.println("the value of p="+p);
		System.out.println("the value of q="+q);
		System.out.println("the value of r="+r);
		
		boolean u=true;
		boolean v=false;
		boolean w=u && v || !(u || v);
		
		System.out.println("the value of u="+u);
		System.out.println("the value of v="+v);
		System.out.println("the value of w="+w);

 	}
}