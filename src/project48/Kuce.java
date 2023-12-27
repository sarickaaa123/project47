package project48;

	class Kuce{ // SUPERCLASS Kuce
	public void osobina(){ // metod osobina
	System.out.println("Kuceto lae");
 }
}
	class LoveckoKuce extends Kuce{ // SUBCLASS Pas
	public void osobina(){ // metod osobina
	System.out.println("Loveckoto kuce duska");
 }
}
  class glavna {
  public static void main(String [] args){
  Kuce reks = new Kuce(); // kreiraj objekt
  reks.osobina(); // povik na metodot osobina od podklasata Kuce
  LoveckoKuce lovec = new LoveckoKuce(); // kreiraj objekt lovec
  lovec.osobina(); // povik na metodot osobina od podklasata LoveckoKuce
 }
}
