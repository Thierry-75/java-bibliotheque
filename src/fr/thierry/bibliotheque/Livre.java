package fr.thierry.bibliotheque;

import java.util.ArrayList;
import java.util.Scanner;

public class Livre extends Bibliotheque {
	
	static Scanner scan = new Scanner(System.in);
	private String titre;
	private String auteur;
	private static String emprunteur;
	private int an;
	private static String star = "[emprunté par ";
	


	
	public Livre(String titre, String auteur, int an, String emprunteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.an = an;
		Livre.emprunteur = emprunteur;
	}
		
	
	public static void hireBook() {
		System.out.println("Indiquez votre prénom :");
		emprunteur = scan.nextLine();
		if(!emprunteur.isEmpty()) {
			try {
		showBooks(liste);
		ArrayList<String>list = new ArrayList<String>();
		for(int i = 0; i < liste.size();i++) {
			list.add(liste.get(i) + ":" + i);
		}
		System.out.println(emprunteur +" Indiquez le nom du livre à emprunter : "+list);
		String subject = scan.nextLine();
		if(!subject.isEmpty()) {
		for(int j = 0; j < liste.size(); j++) {
			if(liste.get(j).contains(subject) ) {
				String hireBook=liste.get(j)+star+emprunteur+"]";
				liste.remove(j);
				liste.add(hireBook);
				showBooks(liste);
				break;
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Ce titre de livre n'existe pas !");
		}
		}
	}
	
	public static void returnBook() {
		showBooks(liste);
		System.out.println("Indiquez le titre du livre à  rendre :");
		String title = scan.nextLine();
		if(!title.isEmpty()) {
			try {
		for(int k = 0; k < liste.size(); k++) {
			if(liste.get(k).contains(title)) {
				liste.remove(k);
				liste.add(title);
				showBooks(liste);
				}
			}
			}catch(Exception e){
				System.out.println("Ce titre de livre n'existe pas");
			}
		}
	}
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}





}
