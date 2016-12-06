package availability;

/**This method will initialize some variables for availability
 * @author ASUS
 */
public class Coffee {
	private final String name;
	public int amount;

	public Coffee(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}
        
        public void setAmount(){
            amount -= 1;
        }
}
