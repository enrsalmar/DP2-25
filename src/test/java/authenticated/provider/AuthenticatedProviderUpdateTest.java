package authenticated.provider;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.DP2Test;

public class AuthenticatedProviderUpdateTest extends DP2Test{
	
	@ParameterizedTest
	@CsvFileSource(resources = "/authenticated/provider/update-provider-negative.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(20)
	public void updateProviderNegative(final int recordIndex, final String company, final String sector) {
		super.signIn("provider1", "provider1");
		super.clickOnMenu("Account", "Provider data");		
		super.fillInputBoxIn("company", company);
        super.fillInputBoxIn("sector", sector);
        super.clickOnSubmitButton("Update");

		super.checkErrorsExist();

	}
	@ParameterizedTest
	@CsvFileSource(resources = "/authenticated/provider/update-provider-positive.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void updateProviderPositive(final int recordIndex, final String company, final String sector) {
		super.signIn("provider1", "provider1");
		super.clickOnMenu("Account", "Provider data");		
		super.fillInputBoxIn("company", company);
        super.fillInputBoxIn("sector", sector);
        super.clickOnSubmitButton("Update");

		this.signOut();

	}
	

}