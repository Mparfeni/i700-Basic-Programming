package coffeemachine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class PopularCoffee {
    private String fileName;
    private String titles;
    public static ArrayList array;
    
    
    public PopularCoffee(){
        fileName = "CoffeeNames.txt";
        titles = " " ;
        array = new ArrayList();
    }
  
    
    public void writeStatistics(){
         try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int size = array.size();
            for(int i=0;i<size;i++) {
                output.write(array.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create that file");
        }
    }
    
}
