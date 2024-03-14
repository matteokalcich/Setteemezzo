package si;

import java.io.File;

public class Config {
	
	private static Config config;
	public enum TipoMazzo {FRANCESE, TRIESTINE}
	public enum TipoGioco {BLACKJACK, SETTEEMEZZO, SOLITARIO}
	
	private TipoMazzo tipoMazzo = TipoMazzo.TRIESTINE;
	private TipoGioco tipoGioco = TipoGioco.SETTEEMEZZO;
	
	private String deckPath;
	
	private Config() {}
	
	public static Config get() {
		
		if(config == null) {
			
			config = new Config();
		}
		
		return config;
	}
	
	public void setScope(int i) {
		
		tipoGioco = TipoGioco.values()[i-1];
		setTipoMazzo(tipoGioco);
		setDeckPath();
	}
	
	private void setDeckPath() {
		
		
		String cartellaProgetto = System.getProperty("user.dir");
		deckPath = cartellaProgetto + File.separator;
		
		switch(tipoMazzo) {
		
		case FRANCESE:
			deckPath += "carteFrancesi";
			break;
			
		case TRIESTINE:
			deckPath += "carteTriestine";
			break;
		}
		
	}
	
	public String getDeckPath() {
		
		return deckPath;
	}

	public TipoMazzo getTipoMazzo() {
		return tipoMazzo;
	}

	public void setTipoMazzo(int i) {
		
		this.tipoMazzo = TipoMazzo.values()[i-1];
		setDeckPath();
	}
	
	public void setTipoMazzo(TipoGioco tipoGioco) {
		
		switch(tipoGioco) {
		
		case BLACKJACK:
			
			tipoMazzo = TipoMazzo.FRANCESE;
			break;
			
		case SETTEEMEZZO:
			
			tipoMazzo = TipoMazzo.TRIESTINE;
			break;
			
		case SOLITARIO:
			
			break;
		}
	}
	
	public void setTipoMazzo(TipoMazzo tm) {
		
		this.tipoMazzo = tm;
	}
	
	public boolean isSolitario() {
		
		return tipoGioco == TipoGioco.SOLITARIO;
	}

	public TipoGioco getTipoGioco() {
		return tipoGioco;
	}

	public void setTipoGioco(TipoGioco tipoGioco) {
		this.tipoGioco = tipoGioco;
	}


}
