package br.com.getset;

public class Contato {
	private int[] numContato = new int[2];
	private String[] nome = new String[2];
	private String[] cel = new String[2];
	
	public void setContato() {
		this.numContato[0] = 1;
		this.numContato[1] = 2;
		this.nome[0] = "Braioso";
		this.nome[1] = "Braizola";
		this.cel[0] = "9 9999 5555";
		this.cel[1] = "9 0123 4567";
	}

	public void getContato() {
		System.out.println("..Executando função Visualizar Contatos Privados..");
		System.out.println("\n|''''Contato Nº"+numContato[0]+"'''''|\n|Nome: "+nome[0]+"       |\n|Celular: "+cel[0]+"|\n''''''''''''''''''''''");
		System.out.println("\n|''''Contato Nº"+numContato[1]+"'''''|\n|Nome: "+nome[1]+"      |\n|Celular: "+cel[1]+"|\n''''''''''''''''''''''\n..Executando função Visualizar Lista Privada..\n");
		//return getContato();
	}
}

