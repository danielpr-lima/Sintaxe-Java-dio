package apps;
//herança
public class FacebookMenssenger extends ServicoMenssagemInstantanea {
	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem pelo Fecebook menssenger");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Fecebook menssenger");		
	}
}
