package Main;

import availability.CoffeeType;
import statistics.PopularCoffee;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**Class is made for handling button pressing and
 * playing music
 * @author ASUS
 */
public class ButtonHandler { 
    private PopularCoffee pc;
    private CoffeeType coffeeCount;
    
    public ButtonHandler(PopularCoffee popularCoffee){
        pc = popularCoffee;
        coffeeCount = new CoffeeType();
    }

    /**This method will play music*/
    public void playMusic(String Audio){
        URL url = ButtonHandler.class.getResource("/Coffee.wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
    
    /**This method will do some act(show our coffee name, write info to statistics,
     * play music) if we call it.
     * @param event - act, that will happen
     * @param coffeeName - name of coffee, that we want
     */
    public void buttonPressed(java.awt.event.ActionEvent event, String coffeeName){
        System.out.println(coffeeName);
        pc.writeToStatistics(coffeeName);
        for(int i = 0; i<CoffeeType.allCoffies.size(); i++){
            String oneCoffee = CoffeeType.allCoffies.get(i).getName();
            if (oneCoffee == coffeeName){
                CoffeeType.allCoffies.get(i).setAmount();
            }     
        }
        playMusic("Coffee");
    }
}
