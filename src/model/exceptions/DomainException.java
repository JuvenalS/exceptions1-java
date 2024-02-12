package model.exceptions;

// Exception: 
// RuntimeException: não precisa ter trows no método
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
