package statistics;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**This class will work with statistics and sorting.
 * @author ASUS
 */
public class PopularCoffee {

    private String fileName;
    private FileHandler filehandler;
    public HashMap<String, Integer> coffeeStatistics;
   
    public PopularCoffee() throws IOException{ 
        coffeeStatistics = new HashMap<String, Integer>();
        fileName = "statistics/CoffeeNames.txt";
        filehandler = new FileHandler();
    }
    
    /**This method will read our file with statistics.
     */
    public void initializeStatistics(){
        coffeeStatistics = filehandler.readFile(fileName);
    }
    
    /**This method will count our orders and write it in statistics
     */
    public void writeToStatistics(String coffeeName){
        incrementEntry(coffeeName);
        filehandler.writeFile(coffeeStatistics, fileName);
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
    
    /**This method will sort our statistics in decreasing order.
     */
    public void sorting(){
        Object[] a = coffeeStatistics.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
    public int compare(Object o1, Object o2) {
        return ((Map.Entry<String, Integer>) o2).getValue().compareTo(((Map.Entry<String, Integer>) o1).getValue());
    }
        });
        for (Object e : a) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : " + ((Map.Entry<String, Integer>) e).getValue());
        }
    }
}
   
