
public class Imobil {

	
	private String tipImobil;
	private double pret;
	private int nrCamere;
	private int comfort;
	
	public Imobil() 
	{		
		tipImobil = "";
		pret = 0.0;
		nrCamere = 0;
		comfort = 0;
	}
	public Imobil ( String tipImobil, double pret, int nrCamere, int comfort) {
		this.tipImobil = tipImobil;
		this.pret = pret;
		this.nrCamere = nrCamere;
		this.comfort = comfort;
	}
	public Imobil (String tipImobil, double pret, int nrCamere) {
		this.tipImobil = tipImobil;
		this.pret = pret;
		this.nrCamere = nrCamere;
	}
	public Imobil ( String tipImobil , double pret) {
		this.tipImobil = tipImobil;
		this.pret = pret;
	}
	public Imobil ( String tipImobil) {
		this.tipImobil = tipImobil;
	}
	public void setTipImobil (String tipImobil){
		this.tipImobil = tipImobil;
	}
	public String getTipImobil() {
		return tipImobil;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public double getPret() {
		return pret;
	}
	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}
	public int getNrCamere() {
		return nrCamere;
	}
	public void setComfort(int comfort) {
		this.comfort = comfort;
	}
	public int getComfort() {
		return comfort;
	}
	}

