import static org.junit.Assert.*;
import org.junit.*;

public class Exercise3Test {
	
	Exercise3 _1;

	@Before
	public void setup() {
		_1 = new Exercise3();
	}

	@Test
	public void testGetNumber() {
		String[] args = {"2"};
		int result = _1.getNumber(args);
		assertEquals(2, result);
	}

	@Test
	public void testGetNumber_Zero() {
		String[] args = {"0"};
		int result = _1.getNumber(args);
		assertEquals(0, result);
	}

	@Test
	public void testGetNumber_Float() {
		String[] args = {"3.14"};
		int result = _1.getNumber(args);
		assertEquals(-1, result);
	}

	@Test
	public void testGetNumber_Char() {
		String[] args = {"PI"};
		int result = _1.getNumber(args);
		assertEquals(-1, result);
	}

	@Test
	public void testGetNumber_NullArgument() {
		String[] args = null;
		int result = _1.getNumber(args);
		assertEquals(-1, result);
	}

	@Test
	public void testGetNumber_EmptyArgument() {
		String[] args = {""};
		int result = _1.getNumber(args);
		assertEquals(-1, result);
	}

	@Test
	public void testGetNumber_MultiArgument() {
		String[] args = {"2", "3"};
		int result = _1.getNumber(args);
		assertEquals(-1, result);
	}

	@Test
	public void testLazyCaterer(){
		int result = _1.lazyCaterer(10);
		assertEquals(56, result);
	}

	@Test
	public void testLazyCaterer_Zero(){
		int result = _1.lazyCaterer(0);
		assertEquals(-1, result);
	}

	@Test
	public void testLazyCaterer_One(){
		int result = _1.lazyCaterer(1);
		assertEquals(2, result);
	}

	@Test
	public void testTriangleSum(){
		int result = _1.triangleSum(10);
		assertEquals(55, result);
	}

	@Test
	public void testTriangleSum_Zero(){
		int result = _1.triangleSum(0);
		assertEquals(-1, result);
	}

	@Test
	public void testTriangleSum_One(){
		int result = _1.triangleSum(1);
		assertEquals(1, result);
	}
	

}