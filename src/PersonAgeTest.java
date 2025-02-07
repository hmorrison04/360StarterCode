import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonAgeTest 
{
	PersonAge R;
	PersonAge J;
	PersonAge M;
	PersonAge B;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		R = new PersonAge("Romeo", "Montague", 15);
		J = new PersonAge("Juliet", "?", 13);
		M = new PersonAge("Mercutio", "Capulet", 20);
		B = new PersonAge("B", "C", 20);
	}

	@Test
	void testToString() 
	{
		assertEquals(R.toString(), "Person: firstName = Romeo, lastName = Montague, age = 15");
	}

	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class,
				() ->{
					R.makePerson(J);
				});
		assertThrows(UnderAgeException.class,
				() ->{
					M.makePerson(J);
				});
		PersonAge child;
		try
		{
			child = M.makePerson(B); 
			assertEquals(M.getFirstName(), child.getFirstName());
			assertEquals(0, child.getAge());
			assertEquals(B.getLastName(), child.getLastName());
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
			fail("THREW EXCEPTION");
		}
	
		
		
	}
}
