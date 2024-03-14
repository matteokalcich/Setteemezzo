package si;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public abstract class GicoDiCarte {

	protected Mazzo mazzo = null;
	protected float punteggio = 0;
	protected ArrayList<Carta> mano = null;
	
	
	public GiocoDiCarte() { 
		
		mano = new ArrayList<Carta>();
	}
	
	public abstract Image daiCarte();
	
	public abstract void aggiornaPunteggio();
	
	public List<Image> mostraMazzo(){
		
		return mazzo.getImages();		
		
	}
	
	public float getPunteggio() {
		
		return punteggio;
	}
	
	public Image getRetro() {
		
		return mazzo.getRetro();
	}
	
	public String daiDescrizione() {
		
		Carta c = mano.get(mano.size()-1);
		return c.toString();
	}
	
	public void nuovaMano() {
		
		mazzo = new MazzoFactory().genera();
	}
}
