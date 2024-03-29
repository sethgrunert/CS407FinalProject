package edu.ccsu.cs407.FinalProject;

public class Main 
{

	public static void main(String[] args) 
	{
		// Get an instance of a creature factory
		ConcreteCreatureFactory factory = ConcreteCreatureFactory.getInstance();
		
		// Make a creature by making a call to the creature factory
		Creature creature = factory.createCreature("wolf");
		
		// Print the creature
		System.out.println(creature.toString());
	}
}
