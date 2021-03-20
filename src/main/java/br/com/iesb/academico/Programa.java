package br.com.iesb.academico;

import br.com.iesb.academico.telas.TelaMenu;

public class Programa {

	private static TelaMenu menu;

	public static void main(String[] args) {
		System.out.println("funcionou");
		menu = new TelaMenu();
		menu.exibir();
	}
}
