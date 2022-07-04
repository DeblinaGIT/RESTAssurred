package RESTAssured.RESTAssured;

import org.testng.annotations.DataProvider;

public class DataForTest {
	@DataProvider(name = "dataForDelete")
	public Object[] dataForDelete1() {

		return new Object [] {
				8
		};
	}


	@DataProvider(name = "DataForPost")
	public Object[][] createData() {

				/*Object[][] data = new Object[2][3];
				
				data[0][0] = "Henry";
				data[0][1] = "PM";
				
				
				data[1][0] = "Mika";
				data[1][1] = "PO";
				
				
				return data;*/


		return new Object[][] {
			{"Albert", "PM"},
			{"Thomas", "PO"},
			{"Henry", "SDET"}	
		};

	}

}
