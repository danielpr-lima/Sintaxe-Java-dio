package apps;
//herança
public abstract class ServicoMenssagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//polimofismo somento os filhos podem ver 
	protected void ValidarConectadoInternet() {
		System.out.println("Validando se est[a conectado a internet");
	}
}


