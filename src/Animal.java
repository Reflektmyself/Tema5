
public class Animal {

	private String nume;
	private String culoare;
	private int varsta;

public Animal() {
	nume = "";
	culoare = "";
	varsta = 0;
}
public Animal (String nume, String culoare, int varsta ) {
	
	this.nume = nume;
	this.culoare = culoare;
	this.varsta = varsta;
}
public Animal (String nume, String culoare) {
	this.nume=nume;
	this.culoare=culoare;

}
public Animal(String nume) {
	this.nume=nume;
      
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getNume() {
	return nume;
}
public void setCuloare(String culoare) {
	this.culoare = culoare;
}
public String getCuloare() {
	return culoare;
}
public void setVarsta(int varsta) {
	this.varsta = varsta;
}
public int getVarsta() {
	return varsta;
}
public void afiseaza() {
	System.out.println("Animalul se numeste " + this.getNume() + ", are culoarea " + this.getCuloare() + " si are varsta de " + this.getVarsta() +" ani");
}
}

