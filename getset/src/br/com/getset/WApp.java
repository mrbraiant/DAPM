package br.com.getset;

public class WApp {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setContato();
		contato.getContato();
				
		Msg msg = new Msg();		
		msg.setMsg();		
		msg.getMsg();
	}
}