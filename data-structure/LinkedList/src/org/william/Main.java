package org.william;

public class Main {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.adicionar("AC");
		linkedList.adicionar("BA");
		linkedList.adicionar("CE");
		linkedList.adicionar("SP");
		
		for (int i = 0; i < linkedList.getTamanho(); i++) {
			System.out.println(linkedList.getElemento(i).getValor());
		}
		

	}
}
