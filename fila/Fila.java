package semana2.fila;

public class Fila {
	private Nodo inicio;



	public Fila() {
		this.inicio = null;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}
	
	public void insereListaVazia(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(null);
		
		this.inicio = novo;
		
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public void insere(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(null);
		if(this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = inicio;
			while(aux.getProx()!= null) {
				aux = aux.getProx();
			}
			aux.setProx(novo);
		}
	}
	
	public void imprimeFila() {
		if(this.inicio == null)
			System.out.println("Lista Vazia!");
		else {
			Nodo aux = this.inicio;
			while(aux !=null) {
				System.out.println("Valor: " +aux.getValor());
				aux = aux.getProx();
			}
		}
	}
	/*
	public void insereInicio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(this.inicio);
		this.inicio = novo;
	}
	
	public void RemoverFinal() {
		Nodo aux;
		if(this.inicio !=null)
			if(this.inicio.getProx()==null)
				this.inicio = null;
			else {
				aux = inicio;
				while(aux.getProx().getProx() != null)
					aux = aux.getProx();
				aux.setProx(null);
			}
	}
	*/
	
	
	public void pesquisaValor(int valor) {
		int contador = 0;
		if (this.inicio == null) {
			System.out.println("Lista Vazia");
		}
		else {
			boolean achou = false;
			Nodo aux = this.inicio;
			while (aux != null && !achou) {
				contador ++;
				if(valor == aux.getValor()) {
				achou = true;
				break;
				}
				else {
				aux = aux.getProx();
				}
			}
			if (achou) {
				System.out.println("Valor Encontrado!\n Nodos passados: "+contador);
			}		
			else {
			System.out.println("Valor Não Encontrado!\n Nodos passados: "+contador);
			}
		}
	}
	
	public void remove() {
		if(this.inicio==null)
			System.out.println("Lista Vazia!");
		else
			this.inicio = this.inicio.getProx();
	}
	

	
	
}
		
	
	
	


