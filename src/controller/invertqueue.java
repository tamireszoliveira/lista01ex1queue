package controller;

public class invertqueue{
	class No<T>{
		T dado;
		No<T> proximo;
		
		public No(T dado) {
			this.dado = dado;
			this.proximo = null;
		}
	}
	public class Fila<T>{
		private No<T> inicio, fim;
		public Fila() {
			this.inicio = this.fim = null;
		}
		
		public void insert(T dado) {
			No<T> elemento = new No<>(dado);
			if(fim == null) {
				inicio = fim = elemento;
			} else {
				fim.proximo = elemento;
				fim = elemento;
				
			}
		}
		public T remove() {
			if(inicio == null) {
				return null;
			}
			T dado = inicio.dado;
			inicio = inicio.proximo;
			if(inicio == null) {
				fim = null;
			}
			return dado;
		}
		
		public boolean isEmpty() {
			return inicio == null;
		}
		
		public void print() {
			No<T> aux = inicio;
			System.out.println("Fila: ");
			while(aux != null) {
				System.out.println(aux.dado + " ");
				aux = aux.proximo;
			}
			System.out.println();
		}
		public void invert() {
			Fila<T> filaux = new Fila<>();
			// transferindo elementos para a fila aux
			while(!isEmpty()) {
				filaux.insert(remove());
			}
			
			// realocando elementos da aux pra original
			while(!filaux.isEmpty()) {
				insert(filaux.remove());
			}
		}
	}
}
