package edu.ccsu.cs407.FinalProject;

public class Wolf extends Creature 
{

	public Wolf()
	{					
		super("Wolf", new Carnivore(), new Walk(), new Fights(), false, true, 5, 5);
	}
}
