package cisc191.sdmesa.edu;
/**
 * Lead Author(s):
 * @author Shaun Stephenson
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of class:
 * ElectricMountainBike is a Bicycle that is Movable, Gearable, and Electric
 * 
 */

// IS-A relationship: ElectricMountainBike extends Bicycle
// IS relationship: ElectricMountainBike implements Gearable, Movable, Chargeable
public class ElectricMountainBike extends Bicycle implements Gearable, Movable, Chargeable
{
	// HAS-A relationships: An ElectricMountainBike has-a gear, speed, and charge
	private int gear;
	private int speed;
	private int charge;
	
	// TODO: Add battery level monitoring
	
	public ElectricMountainBike(String newMake)
	{
		super(newMake);
		this.gear = 1;
		this.speed = 0;
		this.charge = 0;
	}

	// Gearable interface implementation
	@Override
	public int getGear()
	{
		return gear;
	}

	@Override
	public void gearUp()
	{
		gear++;
	}

	@Override
	public void gearDown() {
		if (gear > 1) {
			gear--;
		}
	}

	// Movable interface implementation
	@Override
	public int getSpeed()
	{
		return speed;
	}

	@Override
	public void speedUp() {
		speed++;
		// When speeding up, charge decreases by 1
		if (charge > 0) {
			charge--;
		}
	}

	// Chargeable interface implementation
	@Override
	public int getCharge()
	{
		return charge;
	}

	@Override
	public void chargeTo(int chargeLevel)
	{
		this.charge = chargeLevel;
	}
}
