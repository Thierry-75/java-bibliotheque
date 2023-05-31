package fr.thierry.bibliotheque;

public class LivreEnfant extends Livre {
	
	String trancheAge ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showBooks(liste);
		addBook();
		addBook();
		addBook();
		delBook();
		delBook();
		hireBook();
		hireBook();
		hireBook();
		returnBook();
		scan.close();
	}

	public LivreEnfant(String titre, String auteur, int an, String emprunteur) {
		super(titre, auteur, an, emprunteur);
		// TODO Auto-generated constructor stub
	}

	public String getTrancheAge() {
		return trancheAge;
	}

	public void setTrancheAge(String trancheAge) {
		this.trancheAge = trancheAge;
	}
}
