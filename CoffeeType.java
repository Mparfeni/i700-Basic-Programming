/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package availability;

import java.util.ArrayList;

/**This method will make an arraylist and add some information in it
 * @author ASUS
 */
public class CoffeeType {
    public static ArrayList<Coffee> allCoffies;
    
    public CoffeeType(){
        allCoffies = new ArrayList<Coffee>();
        allCoffies.add(new Coffee("Espresso",10));
        allCoffies.add(new Coffee("Lungo Entkoff",5));
        allCoffies.add(new Coffee("Cappuccino",8));
        allCoffies.add(new Coffee("Cappuccino Vanilla",7));
        allCoffies.add(new Coffee("Lungo",3));
        allCoffies.add(new Coffee("Latte Macchiato",9));
        allCoffies.add(new Coffee("Kakao",5));
        allCoffies.add(new Coffee("Tee mit Mich",3));   
    }
}

