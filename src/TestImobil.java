
public class TestImobil {

	public static void main(String[] args) {

		Casa csa = new Casa();
		csa.setTipImobil("casa");
		csa.setPret(200.50);
		csa.setNrCamere(4);
		csa.setComfort(2);
		csa.setGaraj(1);
		
		
	
csa.afiseaza();
csa.afiseaza2();
        Apartament aptm = new Apartament();
        aptm.setTipImobil("apartament");
        aptm.setPret(150.25);
        aptm.setNrCamere(3);
        aptm.setComfort(1);
        aptm.setParcare(2);
        
aptm.afiseaza();
aptm.afiseaza2();
}
}