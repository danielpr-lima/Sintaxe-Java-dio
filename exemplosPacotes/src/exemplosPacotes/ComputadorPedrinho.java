package exemplosPacotes;

import apps.FacebookMenssenger;
import apps.MSNMenssenger;
import apps.ServicoMenssagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		ServicoMenssagemInstantanea smi = null;
//		não se sabe qual app
//		mas qualquer um devera enviar e receber mensagem 
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMenssenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMenssenger(); 
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}

}
