
public class Tigru extends Animal{
    private String antilope;
	public Tigru() {
		super();
	}
    public Tigru(String nume) {
    	super (nume);
    }
	public Tigru ( String nume , String culoare) {
		super(nume,culoare);
	}
	public Tigru (String nume, String culoare, int varsta) {
		super(nume,culoare,varsta);
	}
	public void afiseaza() {
		System.out.println("Tigrul se numeste " + this.getNume() + ", are culoarea" + this.getCuloare() + ", are varsta de " + this.getVarsta()+"ani" );
	}
	public void afiseaza2() {
		System.out.println("Tigrul se numeste " + this.getNume() + ", are culoarea " + this.getCuloare() + ", are varsta de " + this.getVarsta()+" ani " + " si mananca " + this.getAntilope() );
	}
	public void setAntilope(String antilope) {
		this.antilope = antilope;
	}
	private String getAntilope() {
	
		return antilope;
	}
}
