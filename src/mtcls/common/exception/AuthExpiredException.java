package mtcls.common.exception;

public class AuthExpiredException extends Exception {
	private static final long serialVersionUID = 6839741226352465451L;

	public AuthExpiredException() {
	}

	public AuthExpiredException(String arg0) {
		super(arg0);
	}

	public AuthExpiredException(Throwable arg0) {
		super(arg0);
	}

	public AuthExpiredException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
