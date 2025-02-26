package apps;
//herança
public class Telegram extends ServicoMenssagemInstantanea {

	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");		
	}

}
