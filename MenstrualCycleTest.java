import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class MenstrualCycleTest{

	@Test
	public void testCanCheckUserName(){
		MenstrualCycle menstrualCycle = new MenstrualCycle();

		String names = menstrualCycle.getUserNames();
		assertNotNull(names);


	}




} 