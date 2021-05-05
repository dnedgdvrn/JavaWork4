
import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Conceret.Starbaks;
import Entites.Customer;
import MernisAdapoter.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		
		
		
		BaseCustomerManager baseCustomerManager =new Starbaks(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Asya","daðdeviren",LocalDate.of(1999, 05, 10),"123456789"));
		
		
		

	}

}
