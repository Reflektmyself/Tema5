
public class Leu extends Animal{
private String coama;
	public Leu() {
		super();
	}
	public Leu(String nume) {
		super(nume);
	}
    public Leu(String nume, String culoare) {
    	super ( nume, culoare);
    }
    public Leu(String nume, String culoare, int varsta) {
    	super(nume,culoare,varsta);
    	
    }
  
  public void afiseaza() {
	  System.out.println("Leul se numeste " + this.getNume() + ", are culoarea" + this.getCuloare() + ", are varsta de " + this.getVarsta()+"ani");
  }
  public void afiseaza1() {
	  System.out.println("Leul se numeste " + this.getNume() + ", are culoarea " + this.getCuloare() + ", are varsta de " + this.getVarsta()+" ani" + " si are o coama " + this.getCoama());
  }
public void setCoama(String coama) {
      this.coama = coama;
}
private String getCoama() {
	return coama;
}
}