package ex1;

public class CurrencyService {

	private ExchangeService exchangeService;
	
	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
	
	public double convert(double dollars) {
		double rupees =  dollars * exchangeService.getExchangeRate();	
		return rupees;
	}
}
