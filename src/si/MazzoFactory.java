package si;

public class MazzoFactory {
	
	protected Mazzo mazzo = null;
	
	public Mazzo genera() {
		
		Config config = Config.get();
		
		switch(config.getTipoMazzo()) {
		
		case TRIESTINE:
			
			mazzo = new MazzoTriestino();
			break;
			
		case FRANCESE:
			
			mazzo = new MazzoFrancese();
			break;
		}
		
		mazzo.genera();
		return mazzo;
	}

}
