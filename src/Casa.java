
public class Casa extends Imobil{
private int garaj;

	
	public Casa() {
	super();
	this.garaj = 0;
	
	}
	public Casa(int garaj) {
		this.garaj = garaj;
		}
	
	public Casa(String tipImobil, double pret, int nrCamere, int comfort) {
		super ();
	}
	public Casa(String tipImobil, double pret, int nrCamere) {
	    super();	
	}	
	public Casa(String tipImobil, double pret) {
		super();
	}
	public Casa(String tipImobil) {
		super();
	}
    public void afiseaza() {
    	System.out.println("Imobilul este " + this.getTipImobil() + " are pretul de " + this.getPret() + " pe noapte, numarul camerelor este de: " + this.getNrCamere() + " cu comfort " + this.getComfort());
    }
    public void afiseaza2() {
    	System.out.println("Imobilul este " + this.getTipImobil() + " are pretul de " + this.getPret() + " pe noapte, numarul camerelor este de: " + this.getNrCamere() + " cu comfort " + this.getComfort() + ". Casa mai detine si " + this.getGaraj() + " garaj");
    }
    public void setGaraj(int garaj) {
    	this.garaj = garaj;
    }
    
	private int getGaraj() {

		return garaj;
	}
   
	
}
