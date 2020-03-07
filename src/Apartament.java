
public class Apartament extends Imobil{
private int parcare;
    public Apartament() {
    	super();
    }
    public Apartament(String tipImobil, double pret, int nrCamere, int comfort) {
    	super(tipImobil, pret, nrCamere, comfort);
    }
    public Apartament(String tipImobil, double pret, int nrCamere){
    	super(tipImobil, pret, nrCamere);
    }
    public Apartament(String tipImobil, double pret) {
    	super(tipImobil, pret);
    }
    public Apartament(String tipImobil) {
        super(tipImobil);
    }
    public void afiseaza() {
    	System.out.println("Imobilul este " + this.getTipImobil() + " are pretul de " + this.getPret() + " ,numarul camerelor este de: " + this.getNrCamere()  +" camere cu comfort " + this.getComfort());
    }
    public void afiseaza2() {
    	System.out.println("Imobilul este " + this.getTipImobil() + " are pretul de " + this.getPret() + " ,numarul camerelor este de: " + this.getNrCamere()  +" camere cu comfort " + this.getComfort() + ". Apartamentul  mai detine si " + this.getParcare() + " locuri de parcare" );
    }
    public void setParcare(int parcare) {
    	this.parcare = parcare;
    }
	private int getParcare() {
	
		return parcare;
	}
}

	