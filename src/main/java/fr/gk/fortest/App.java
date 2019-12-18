package fr.gk.fortest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public int fact(int val) {
		
		if (val==0) {
			return 1;
		}else {
			return val*fact(val-1);
		}
		
	}
	
	public int maxi (int a, int b) {
		
		if(a>b) {
			return a;
		}else if(a<b){
			return b;
		}
		return a;
	}
}
