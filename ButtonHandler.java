package Main;

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
    public ButtonHandler(PopularCoffee popularCoffee){
        pc = popularCoffee;
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
        playMusic("Coffee");
    }
}

