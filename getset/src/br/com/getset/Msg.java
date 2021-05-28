package br.com.getset;

public class Msg {
	private String[] msg = new String[2];
	private String[] destinatario = new String[2];
	private String[] horaEnvio = new String[2]; 
	private String[] cont = new String[2];
	
	
	
	public void setMsg() {
		//setMsg incluindo valores diretos
		this.msg[0] = "|'''Mensagem Nº 1''''|";
		this.msg[1] = "|'''Mensagem Nº 2''''|";
		this.destinatario[0] = "Tico";
		this.destinatario[1] = "Teco";
		this.horaEnvio[0] = "00:00";
		this.horaEnvio[1] = "11:11";
		this.cont[0] = "Oi";
		this.cont[1] = "Boa noitty";
	}
		
	
	public void getMsg() {
		System.out.println(msg[0]+"\n|''''''''''''''''''''|\n|Destinatario: "+				destinatario[0]+"  |\n|''''''''''''''''''''|\n|Hora do Envio: "+				horaEnvio[0]+"|\n|Mensagem: "+cont[0]+"        |\n|____________________|\n");
		System.out.println(msg[1]+"\n|''''''''''''''''''''|\n|Destinatario: "+destinatario[1]+"  |\n|''''''''''''''''''''|\n|Hora do Envio: "+horaEnvio[1]+"|\n|Mensagem: "+cont[1]+"|\n|____________________|\n");
		//return getMsg();
	}
}
