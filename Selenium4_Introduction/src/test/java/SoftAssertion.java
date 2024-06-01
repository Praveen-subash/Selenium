import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test user
		
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(false);
		
		//If you dont give the below line test will not get passed
		sf.assertAll();
		
		
		

	}

}
