package si;

public class FiguraFactory {
	
	public Carta getFigura(int primaFigura) {
		
		switch(Config.get().getTipoGioco()) {
		
		case BLACKJACK:
			return new FiguraBlackJack(primaFigura);
			
		case SETTEEMEZZO:
			
			return new Figura7eMezzo(primaFigura);
			
		case SOLITARIO:
			
			return new FiguraSolitario(primaFigura);
		}
		
		return null;
		
	}

}
