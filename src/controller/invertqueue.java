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
		private int size;
		public Fila() {
			this.inicio = this.fim = null;
			this.size = 0;

		}
		
		public void insert(T dado) {
			No<T> elemento = new No<>(dado);
			if(fim == null) {
				inicio = fim = elemento;
			} else {
				fim.proximo = elemento;
				fim = elemento;
			}
			size++;
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
			size--;
			return dado;
		}
		
		public boolean isEmpty() {
			return inicio == null;
		}
		
		public int queuesize() {
			return size;
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
				T dado = remove();
				// nova auxiliar
				Fila<T> aux2 = new Fila<>();
				aux2.insert(dado);
			
			while(!filaux.isEmpty()) {
				aux2.insert(filaux.remove());
			}
				filaux = aux2;
			}
			while(!filaux.isEmpty()) {
				insert(filaux.remove());
			}
		}
	}
}

