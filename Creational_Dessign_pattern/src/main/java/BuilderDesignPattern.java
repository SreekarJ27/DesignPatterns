public class BuilderDesignPattern {
	public static void main(String args[]){
		Feautures ff=new BuilderFactory().setCam_back(10).setBattery(2).setStorage(32).getall();
		System.out.println(ff);
	}
}