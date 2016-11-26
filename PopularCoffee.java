package coffeemachine;

import java.io.*;
import java.util.HashMap;

public class PopularCoffee {
    private String fileName;
    private String titles;
    public static HashMap<String, Integer> coffeeStatistics;
    

    public PopularCoffee(){
        String basePath = System.getProperty("user.dir");
        fileName = basePath + "/src/coffeemachine/CoffeeNames.txt";
        titles = " " ;
        coffeeStatistics = new HashMap<String, Integer>();
    }

    public void writeFile(String coffeeName){
        try {
            FileOutputStream fw = new FileOutputStream(fileName, false);
            ObjectOutputStream output = new ObjectOutputStream(fw);
            int size = coffeeStatistics.size();

            Integer count = coffeeStatistics.get(coffeeName);

            if (count != null){
                coffeeStatistics.put(coffeeName, count + 1);
            } else {
                coffeeStatistics.put(coffeeName, 1);
            }
            System.out.println(coffeeStatistics.toString());
            output.writeObject(coffeeStatistics);

            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create that file");
        }
    }
    public void readFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)));
            coffeeStatistics = (HashMap<String, Integer>) ois.readObject();
            System.out.println(coffeeStatistics.toString());

        } catch (Exception e){
             System.out.println("I cannot read that file");
        }

    }
}
