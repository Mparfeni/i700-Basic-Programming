package statistics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**This class will handle our file, do write and read operations.
 * @author ASUS
 */
public class FileHandler {
    private String basePath;
   
    /** Initialize a path to our main directory */
    public FileHandler(){
        basePath = System.getProperty("user.dir") + "/";
    }

    /**This method will take the values from hashmap and
     * write it down tto the file.
     * @param statistics - our hashmap
     * @param pathToFile - path, where our file will be located
     */
    public void writeFile(HashMap<String, Integer> statistics, String pathToFile){
        try {
            File path = new File(basePath + pathToFile);
            FileOutputStream fw = new FileOutputStream(path, false);
            ObjectOutputStream output = new ObjectOutputStream(fw);
            
            output.writeObject(statistics);
            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create that file");
        }
    }

    /**This method will make an empty hashmap, open our file and
     * write the statistics from file to our hashmap
     * @param pathToFile - path, where our file will be located
     * @return - will return our hashmap after adding new values in it
     */
    public HashMap<String, Integer> readFile(String pathToFile) {
        HashMap<String, Integer> returnHashMap = new HashMap<String, Integer>();
        try {
            File path = new File(basePath + pathToFile);
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            returnHashMap = (HashMap<String, Integer>) ois.readObject();
        } catch (Exception e){
             System.out.println("I cannot read that file");
        }
        return returnHashMap;
    }
}
