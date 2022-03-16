import java.util.Date;

// nouns --- > upper camel case
public class CreditCard {
//	constants should be declared in all upper case
	public final int VISA = 5001;

//	variable names are short but meaningful in lower camel case
	public String accountName;
	public String cardNumber;
	public Date expDate;
	
//	methods should be verbs in lower camel case
	public void disputeCharge(String chargeId,float amount) {
		
	}
}
