package coffeemachine;

public class ButtonHandler {
    PopularCoffee pc = new PopularCoffee();
    Sound sn = new Sound();
    
    public ButtonHandler(){
        
    }
    
    public void buttonActive(java.awt.event.ActionEvent event){
        System.out.println("Espresso");
        pc.writeFile("Espresso");
        sn.playSound();
       
    }
    public void buttonActive1(java.awt.event.ActionEvent event){
        System.out.println("Lungo Entkoff");
        pc.writeFile("Lungo Entkoff");
        sn.playSound();
 
    }
    public void buttonActive2(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino");
        pc.writeFile("Cappuccino");
        sn.playSound();

    }
    public void buttonActive3(java.awt.event.ActionEvent event){
        System.out.println("Cappuccino Vanilla");
        pc.writeFile("Cappuccino Vanilla");
        sn.playSound();

    }
    public void buttonActive4(java.awt.event.ActionEvent event){
        System.out.println("Lungo");
        pc.writeFile("Lungo");
        sn.playSound();

    }
    public void buttonActive5(java.awt.event.ActionEvent event){
        System.out.println("Latte Macchiato");
        pc.writeFile("Latte Macchiato");
        sn.playSound();

    }
    public void buttonActive6(java.awt.event.ActionEvent event){
        System.out.println("Kakao");
        pc.writeFile("Kakao");
        sn.playSound();
    }
    public void buttonActive7(java.awt.event.ActionEvent event){
        System.out.println("Tee mit Milch");
        pc.writeFile("Tee mit Milch");
        sn.playSound();
        
    }
    
}

