package dcll.adav.MySimpleStack;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SimpleStackImplTest extends TestCase {

	SimpleStack simpleStack = new SimpleStackImpl();
	
	public void setup() {
		simpleStack = new SimpleStackImpl();
	}
	
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