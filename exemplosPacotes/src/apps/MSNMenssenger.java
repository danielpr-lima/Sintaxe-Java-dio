package apps;

public class MSNMenssenger extends ServicoMenssagemInstantanea {
	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN menssenger");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN menssenger");		
	}
}
