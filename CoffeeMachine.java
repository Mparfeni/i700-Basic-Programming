package Main;

/**This class will run our program
 * @author ASUS
 */
public class CoffeeMachine{
    
    /**Main method, that will show frame with our programm
     * @param args
     */
    public static void main(String[] args) {
        try{
            new MainMachineFrame().setVisible(true);
        } catch(Exception e){
            System.out.println("Something went wrong: " + e);
        }
    } 
}
