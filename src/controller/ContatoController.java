package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.Contato;

@Named
@RequestScoped
public class ContatoController {

	private Contato contato;

	public Contato getContato() {
		if (contato == null) {
			contato = new Contato();
		}
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void envio() {
		System.out.println(getContato().getNome());
		System.out.println(getContato().getEmail());
		System.out.println(getContato().getMensagem());
	}

}
