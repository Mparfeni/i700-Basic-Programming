package coffeemachine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;

public class PopularCoffee {
    private String fileName;
    private String titles;
    public static HashMap<String, Integer> coffeeStatistics;
    
    public PopularCoffee(){
        fileName = "CoffeeNames.txt";
        titles = " " ;
        coffeeStatistics = new HashMap<>();
    }
    
    public void writeStatistics(){
         try {
            
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int size = coffeeStatistics.size();
            for(int i=0;i<size;i++) {
                output.write(" " + coffeeStatistics.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create that file");
        }
    }
     public void readFile() {
       try {
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split(",");
            String Key = temp[0];
            String Value = temp[1];
            coffeeStatistics.put(Key, Integer.parseInt(Value));
            reader.close();
        }}catch(Exception e){
            System.out.println("I cannor read that file");
         }
       
     }
}
