package semana2.fila;

public class PrincipalFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.insere(5);
		fila.insere(4);
		fila.insere(3);
		fila.insere(2);
		fila.insere(1);
		fila.insere(10);
		fila.insere(15);
		fila.insere(23);
		
		fila.imprimeFila();
		
		fila.remove();
		fila.remove();
		
		fila.insere(22);
		
		fila.imprimeFila();
		
	}
}
