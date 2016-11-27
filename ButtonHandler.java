package coffeemachine;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class ButtonHandler {
    PopularCoffee pc = new PopularCoffee();
    
    public ButtonHandler(){
        
    }
    public void play(String nomeDoAudio){
        URL url = ButtonHandler.class.getResource(nomeDoAudio+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
    
    public void buttonActive(java.awt.event.ActionEvent event){
        System.out.println("Espresso");
        pc.writeFile("Espresso");
        play("Coffee");
        
        
       
    }
    public void buttonActive1(java.awt.event.ActionEvent event){
        System.out.println("Lungo Entkoff");
        pc.writeFile("Lungo Entkoff");
        play("Coffee");
 
    }
    public void buttonActive2(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino");
        pc.writeFile("Cappuccino");
        play("Coffee");

    }
    public void buttonActive3(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino Vanilla");
        pc.writeFile("Cappuccino Vanilla");
        play("Coffee");

    }
    public void buttonActive4(java.awt.event.ActionEvent event){
        System.out.println("Lungo");
        pc.writeFile("Lungo");
        play("Coffee");

    }
    public void buttonActive5(java.awt.event.ActionEvent event){
        System.out.println("Latte Macchiato");
        pc.writeFile("Latte Macchiato");
        play("Coffee");

    }
    public void buttonActive6(java.awt.event.ActionEvent event){
        System.out.println("Kakao");
        pc.writeFile("Kakao");
        play("Coffee");
    }
    public void buttonActive7(java.awt.event.ActionEvent event){
        System.out.println("Tee mit Milch");
        pc.writeFile("Tee mit Milch");
        play("Coffee");   
    }  
}

