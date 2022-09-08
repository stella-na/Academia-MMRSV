package exception;

public class ElementoJaExisteException extends Exception {

	private static final long serialVersionUID = -7149188754521117146L;
	private Object elemento;

	public ElementoJaExisteException(Object obj) {
		super("Objeto já está cadastrado no repositório e não pode ser " + "adicionado novamente");
		this.elemento = obj;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
