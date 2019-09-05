/**
 * 
 */
package client;
import entity.BankAccoutExample;

/**
 * @author vineetvishwakarma
 *
 */
public class BankAccountOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccoutExample vineetAccount = new BankAccoutExample();
		
		vineetAccount.deposit(4500);
		System.out.println("Vineet Account Balance:"+vineetAccount.getBalance());
	}

}
