package ex1;


public class ErrorHandler {

	private String defaultLocale;
	
	public void setDefaultLocale(String defaultLocale) {
		this.defaultLocale = defaultLocale;
	}
	
	public void handleError() {
		//some error handling here which is locale specific
		System.out.println(defaultLocale);
	}
}
