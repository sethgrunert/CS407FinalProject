package edu.ccsu.cs407.FinalProject;

/**
 * Creature class outlines a typical creature. Creatures have
 * a name, eating behavior, movement behavior, fighting behavior,
 * a size, a movement speed, can be a cannibal, and can eat larger animals
 * 
 * @author seth
 * @author steve
 * @author dylan
 */

public abstract class Creature 
{
	private String name;
	private EatingStrategy eating;
	private MovementStrategy moving;
	private FightStrategy fighting;
	private boolean isCannibal;
	private boolean canEatLarger;
	private int size;
	private int movementSpeed;
	
	/**
	 * Constructor for creating creatures.
	 * 
	 * @param n			name of the creature
	 * @param eats		eating strategy of creature
	 * @param moves		movement strategy
	 * @param fights	fighting strategy
	 * @param cannibal	boolean to determine if its a cannibal
	 * @param eatBig	boolean to determine if it can eat larger animals
	 * @param s			integer defining creatures size
	 * @param ms		integer defining creatures movement speed
	 */
	public Creature(String n, EatingStrategy eats, MovementStrategy moves, FightStrategy fights, 
			boolean cannibal, boolean eatBig,int s, int ms)
	{
		name = n;
		eating = eats;
		moving = moves;
		fighting = fights;
		isCannibal = cannibal;
		canEatLarger = eatBig;
		size = s;
		movementSpeed = ms;
	};
	
	/**
	 * This method determines a standard turn for most animals. It can
	 * be overridden for additional functionality. At the least creatures
	 * must move, fight, and eat.
	 */
	public void TakeTurn()
	{
		// Template Method
		Move();
		Fight();
		Eat();
	}
	
	// Getters and setters
	private void Eat()
	{
		eating.Eat();
	}
	
	private void Move()
	{
		moving.Move();
	}
	
	private void Fight()
	{
		fighting.Fight();
	}
		
	// Getters and Setters
	public void setName(String s)
	{
		name = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setEatingStrategy(EatingStrategy e)
	{
		eating = e;
	}
	
	public void setMovementStrategy(MovementStrategy m)
	{
		moving = m;
	}
	
	public void setFightStrategy(FightStrategy f)
	{
		fighting = f;
	}
	
	public void setIsCannibal(boolean b)
	{
		isCannibal = b;
	}
	
	public void setSize(int i)
	{
		size = i;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setCanEatLarger(boolean b)
	{
		canEatLarger = b;
	}

	public void setMovementSpeed(int m)
	{
		movementSpeed = m;
	}
	
	public String toString()
	{
		String s = "";
		s += ("Name: "  + name + "\nEating Strategy: " + eating.toString() + "\nMoving Strategy: " + moving.toString() 
				+ "\nFighting Strategy: " + fighting.toString() + "\nSize: " + size + "\nMovement Speed: " + movementSpeed
				+ "\nIs a cannibal? " + isCannibal + "\nCan it eat larger creatures? " + canEatLarger);
		return s;
	}
}
