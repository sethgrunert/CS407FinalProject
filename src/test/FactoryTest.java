package test;

import junit.framework.TestCase;
import edu.ccsu.cs407.FinalProject.Creature;
import edu.ccsu.cs407.FinalProject.ConcreteCreatureFactory;

/**
 * This class tests the factory class methods
 * 
 * @author Dylan
 * @author Steven
 * @author Seth
 */

public class FactoryTest extends TestCase 
{
	
	/**
	 * This method tests that an object returned from the creature factory
	 * is in fact a creature.
	 */
	
	public void testCreateMethodReturnsCreature()
	{
		// make a factory
		ConcreteCreatureFactory testFactory = ConcreteCreatureFactory.getInstance();
		
		// make an object and store a return from the creature factory
		Object c = testFactory.createCreature("");
		
		// test to see if object is a creature
		assertTrue(c instanceof Creature);
	}
	
	/**
	 * This method tests that the getInstance method of the factory
	 * class returns the same object every time. 
	 */
	
	public void testSingleInstanceOfFactory()
	{
		// make a couple of factory objects
		ConcreteCreatureFactory testFactory = ConcreteCreatureFactory.getInstance();
		ConcreteCreatureFactory testFactory2 = ConcreteCreatureFactory.getInstance();
		
		// test to see if both references refer to the same object
		assertSame(testFactory, testFactory2);
	}
}
