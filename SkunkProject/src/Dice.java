import edu.princeton.cs.introcs.StdOut;

/**
 * Dice represents a single pair of rollable Die objects, randomly generating
 * sums of their two values
 * 
 * This is a Javadoc comment: add more to your finished class below
 * 
 * @author eric
 *
 */

public class Dice
{
	// Instance fields (variables) may be declared anywhere in class body
	// Convention: put at top

	private int lastRoll;
	private Die die1;
	private Die die2;
	private boolean predictable = false;
	private int[] rolls; 
	private int nextRoll_Index;

	// Constructors (object initializers) also can be declared anywhere
	// Convention: after instance fields/variables

	public Dice()
	{
		// initialize instance variables die1 and die2 by
		// creating a new instance of each

		this.die1 = new Die();
		this.die2 = new Die();
		//this.roll();
	}

	public Dice(Die die1, Die die2) // overloaded constructor
	{
		this.die1 = die1;
		this.die2 = die2;
		//this.roll();
	}

	
//	// Method for JUnit Testing
//	public Dice(int[] predictable_Rolls)
//	{
//		if (predictable_Rolls == null)
//		{
//			throw new RuntimeException("Null initializing int[] array");
//		}
//
//		this.predictable = true;
//		this.rolls = predictable_Rolls;
//		this.nextRoll_Index = 0;
//	}
	// Instance methods can also be declared anywhere
	// Convention: after constructors

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		// roll each of die1, die2, sum their last rolls,
		// then set Dice.lastRoll to this value

		die1.roll();
		die2.roll();
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
		
	}

	// the following method converts the internals of
	// this Dice object, and returns a descriptive String:
	//
	// Roll of 7 => 4 + 3
	//

	public String toString()
	{
		return "Dice with last roll: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}
	
	public Die getDie1()
	{
		return this.die1;
	}

	public Die getDie2()
	{
		return this.die2;
	}

	public void setDie1(Die d)
	{
		this.die1 = d;
	}

	public void setDie2(Die d)
	{
		this.die2 = d;
	}
}

	// static methods can go anywhere - but at end is standard
//
//	public static final int NUM_TRIALS = 360;
//
//	public static void main(String[] args)
//	{
//		Dice dice1 = new Dice();
//		int doubleSkunkCount = 0;
//
//		for (int i = 0; i < NUM_TRIALS; i++)
//		{
//			dice1.roll();
//			StdOut.println(dice1);
//
//			if (dice1.getLastRoll() == 2)
//				doubleSkunkCount++;
//		}
//
//		StdOut.println("Actual count: " + doubleSkunkCount);
//		StdOut.println("Expected count: " + (NUM_TRIALS / 36.0));
//	}
//}
