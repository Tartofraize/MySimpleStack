package dcll.adav.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SimpleStackImplTest extends TestCase {

	SimpleStack simpleStack;
	
	@Before
	public void setup() {
		simpleStack = new SimpleStackImpl();
	}
	
	@Test
	public void test() {
		Assert.assertEquals(true, simpleStack.isEmpty());
		simpleStack.push(new Item(new String("toto")));
		Assert.assertEquals(false, simpleStack.isEmpty());
		simpleStack.push(new Item(new Integer(9)));
		Assert.assertEquals(2, simpleStack.getSize());
		Assert.assertEquals(9, simpleStack.pop().getValue());
		Assert.assertEquals(1, simpleStack.getSize());
		Assert.assertEquals(9, simpleStack.peek().getValue());
		Assert.assertEquals(2, simpleStack.getSize());
	}

}
