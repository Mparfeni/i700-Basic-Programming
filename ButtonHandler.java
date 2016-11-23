
package coffeemachine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class ButtonHandler {
    PopularCoffee pc = new PopularCoffee();
    Sound sn = new Sound();
    
    public ButtonHandler(){
     
    }
    
    public void buttonActive(java.awt.event.ActionEvent event){
        System.out.println("Espresso");
        PopularCoffee.array.add("Espresso");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive1(java.awt.event.ActionEvent event){
        System.out.println("Lungo Entkoff");
        PopularCoffee.array.add("Lungo Entkoff");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive2(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino");
        PopularCoffee.array.add("Cappuccino");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive3(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino Vanilla");
        PopularCoffee.array.add("Cappuccino Vanilla");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive4(java.awt.event.ActionEvent event){
        System.out.println("Lungo");
        PopularCoffee.array.add("Lungo");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive5(java.awt.event.ActionEvent event){
        System.out.println("Latte Macchiato");
        PopularCoffee.array.add("Latte Macchiato");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive6(java.awt.event.ActionEvent event){
        System.out.println("Kakao");
        PopularCoffee.array.add("Kakao");
        pc.writeStatistics();
        sn.playSound();
    }
    public void buttonActive7(java.awt.event.ActionEvent event){
        System.out.println("Tee mit Milch");
        PopularCoffee.array.add("Tee mit Milch");
        pc.writeStatistics();
        sn.playSound();
    }
    
}

