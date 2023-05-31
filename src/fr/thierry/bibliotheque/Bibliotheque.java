package fr.thierry.bibliotheque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bibliotheque {

	protected static ArrayList<String> liste = new ArrayList<String>((Arrays.asList("les misérables","madame de bovary","les révolutions coperniciennes","1984"))); 
	private static String livre;
	static Scanner scan = new Scanner(System.in);
	

	public static void showBooks(ArrayList<String> liste) {
		System.out.println("Liste des livres: "+liste);
	}
	public static void addBook() {
		System.out.println("Indiquez le livre à ajouter :");
		livre = scan.nextLine();
		if(!livre.isEmpty()) {
		liste.add(livre);
		System.out.println("Vous avez ajouté le titre : "+ livre);
		System.out.println(liste);
		System.out.println("---------------------------------------");
		}else
			addBook();
	}
	public static void delBook() {
		ArrayList<String>list = new ArrayList<String>();
		for(int i = 0; i < liste.size();i++) {
			list.add(liste.get(i) + ":" + i);
		}
		System.out.println("Indiquez le numéro du livre a supprimer : "+list);
		int numero = scan.nextInt();
		try {
		liste.remove(numero);
		for(int i = 0; i < liste.size();i++) {
			list.add(liste.get(i) + ":" + i);
		}
	//	showBooks(list);
		System.out.println("---------------------------------------");
		}
		catch(Exception e) {
			System.out.println("Ce numéro de livre n'existe pas ");
		}
		
	}
	public static String getLivre() {
		return livre;
	}
	public static void setLivre(String livre) {
		Bibliotheque.livre = livre;
	}
}
