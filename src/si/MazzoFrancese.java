package si;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class MazzoFrancese extends Mazzo, implements TipoMazzoFrancese {
	
	public MazzoFrancese(List<Image> immagini) {
		
		super.numerocarte = TipoMazzoFrancese.numeroCarte;
		super.numeroCartePerSeme = TipoMazzoFrancese.numeroCartePerSeme;
		super.primaFigura = TipoMazzoFrancese.primaFigura;
		super.semi = getSemi();
		
		super.immagini = immagini;
		mazzo = new Carta(TipoMazzoFrancese.numeroCarte);
	}
	
	@Override
	public List<String> getSemi() {
		
		SemiFrancesi semi[] = SemiFrancesi.values();
		
		ArrayList<String> alSemi = new ArrayList<>();
		
		for(SemiFrancesi s : semi) {
			
			alSemi.add(s.name());
		}
		
		return alSemi;
		
	}
	
	@Override
	public String getSeme(int i) {
		
		return null;
	}
	
}
