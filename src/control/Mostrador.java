package control;

import java.io.IOException;

import javax.swing.JTextArea;

public class Mostrador {
	Libro libro;
	private int contadorNumeroPagina = 0;

	public Mostrador() {
		super();
		libro = new Libro();
	}

	public void mostrarPagina(JTextArea textArea) {
		StringBuilder cadena = new StringBuilder();
		// TODO igual el textArea sabe el tama�o de letra
		double height2 = 18;
		boolean salir = false;
		do {
			try {
				cadena.append(libro.damecaracter());
				textArea.setText(cadena.toString());
			} catch (IOException e) {
				salir = true;
			}
		} while (textArea.getPreferredSize().getHeight() + height2 <= textArea.getHeight() && !salir);
	}

	public void sumarPagina() {
		contadorNumeroPagina++;
	}

	public int getContadorNumeroPagina() {
		return contadorNumeroPagina;
	}

	public void setContadorNumeroPagina(int contadorNumeroPagina) {
		this.contadorNumeroPagina = contadorNumeroPagina;
	}

}
