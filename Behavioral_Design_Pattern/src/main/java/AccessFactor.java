public class AccessFactor {
	public Calculator c;
	AccessFactor(Calculator c){
		this.c=c;
	}
public void accessing(int a,int b){
		c.Calculation(a,b);
	}
}