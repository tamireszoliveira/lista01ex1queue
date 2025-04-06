package view;
import controller.invertqueue;


public class Main {

	public static void main(String[] args) {
		invertqueue q = new invertqueue();
		invertqueue.Fila<Integer> fila = q.new Fila<>();		
		fila.insert(61);
		fila.insert(90);
		fila.insert(73);
		fila.insert(12);
		fila.insert(39);
		fila.insert(18);


		System.out.println("Fila original:");
		fila.print();
		fila.invert();
		System.out.println("Fila invertida:");
		fila.print();
	}
}
