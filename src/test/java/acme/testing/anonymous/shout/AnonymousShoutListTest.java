package acme.testing.anonymous.shout;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.DP2Test;

public class AnonymousShoutListTest extends DP2Test{
	
	// Internal state -------------------------------
	
	
	
	
	//Lifecycle management ----------------------------
	
	
	
	
	//Test cases ------------------------
	
	@ParameterizedTest
	@CsvFileSource(resources = "/anonymous/shout/list-all.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void  list(final int recordIndex, final String moment,final String author,  final String text) {
		super.navigateHome();
		super.clickOnMenu("Anonymous", "Shouts list");
		
		super.checkColumnHasValue(recordIndex, 0, moment);
		super.checkColumnHasValue(recordIndex, 1, author);
		super.checkColumnHasValue(recordIndex, 2, text);

		
	}
	
	

}
