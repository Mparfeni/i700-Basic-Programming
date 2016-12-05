package statistics;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PopularCoffee {

    private String fileName;
    private FileHandler fh;
    public HashMap<String, Integer> coffeeStatistics;
   
    public PopularCoffee() throws IOException{ 
        coffeeStatistics = new HashMap<String, Integer>();
        fileName = "statistics/CoffeeNames.txt";
        fh = new FileHandler();
    }
    
    public void initializeStatistics(){
        coffeeStatistics = fh.readFile(fileName);
    }
    
    public void writeToStatistics(String coffeeName){
        incrementEntry(coffeeName);
        fh.writeFile(coffeeStatistics, fileName);
    }
    
    private void incrementEntry(String coffeeName){
        Integer count = coffeeStatistics.get(coffeeName);
            
        if (count != null){
            coffeeStatistics.put(coffeeName, count + 1);
        } else {
            coffeeStatistics.put(coffeeName, 1);
        }
    }
    
    public HashMap<String, Integer>  getCoffeeStatistics(){
        return this.coffeeStatistics;
    }
    
    public void sorting(){
        Object[] a = coffeeStatistics.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
    public int compare(Object o1, Object o2) {
        return ((Map.Entry<String, Integer>) o2).getValue().compareTo(((Map.Entry<String, Integer>) o1).getValue());
    }
    });
    for (Object e : a) {
    System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
            + ((Map.Entry<String, Integer>) e).getValue());
    }
    }}
   
