public class Sample {
	private State s;
	Sample(){
		s=null;
	}
	public void setState(State s){
		this.s = s;		
	}
	public State getState(){
		return s;
	}
}