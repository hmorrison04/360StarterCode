
public class UnderAgeException extends Exception 
{
	/**
	 * 
	 */
	public UnderAgeException() {
		super("Parent is too young!");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 4387563130738037824L;
	
}
