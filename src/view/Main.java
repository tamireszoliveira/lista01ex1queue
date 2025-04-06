package view;
import controller.invertqueue;


public class Main {

	public static void main(String[] args) {
		invertqueue q = new invertqueue();
		invertqueue.Fila<Integer> fila = q.new Fila<>();		
		fila.insert(1);
		fila.insert(2);
		fila.insert(3);
		fila.insert(4);
		fila.insert(5);

		System.out.println("Fila original:");
		fila.print();
		fila.invert();
		System.out.println("Fila invertida:");
		fila.print();
	}
}
