package studdatap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Firsttestcasejunit {

	@Test
	void testadminlogin() {
		boolean actualstudent=AccountantDao.validate("krushal","1234567");
		assertEquals(new String[] {"krushal"},actualstudent,"krushal");
		assertEquals(new String[] {"1234567"},actualstudent,"1234567");
		equals(actualstudent);
		System.out.println("data matched successfully");
	}
	}

