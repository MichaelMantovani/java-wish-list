package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		Regalo trenino = new Regalo("trenino", "cugino");
//		System.out.println(trenino);

		List<Regalo> regali = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		boolean nuovoRegalo = true;
		while (nuovoRegalo) {
			System.out.println("Vuoi aggiungere un regalo alla lista ?");
			nuovoRegalo = in.nextLine().equals("si");
			if (nuovoRegalo == false) {
				break;
			}

			System.out.println("Come si chiama il regalo ?");
			String nomeRegalo = in.nextLine();
			System.out.println("Per chi è il regalo ?");
			String destinatarioRegalo = in.nextLine();

			Regalo regalo = new Regalo(nomeRegalo, destinatarioRegalo);

			regali.add(regalo);

			System.out.println("\n" + "I regali nella tua lista sono " + regali.size() + "\n" + "\n"
					+ "----------------------------------");
		}

		System.out.println("Come vuoi ordinare la lista per nome del regalo o per destinatario ?");
		String sortBy = in.nextLine();
		in.close();
		if (sortBy.equals("nome")){
			Collections.sort(regali, Comparator.comparing(Regalo::getNome));
		} else Collections.sort(regali, Comparator.comparing(Regalo::getDestinatario));
		
		
		 System.out.println(regali);

	}
}
