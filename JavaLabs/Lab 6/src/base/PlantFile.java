package base;
import java.util.ArrayList;
import java.util.LinkedList;

public class PlantFile {

    boolean needsWatering;
    String plantFamily;
    String plantName;
    int[] array;
    ArrayList<String> favoritePlantArray = new ArrayList<String>();

    LinkedList<String> wateringInstruction = new LinkedList<>();

    public PlantFile(boolean needsWatering, String plantFamily, String plantName){

        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.plantName = plantName;



    }
    public void addLinkedInstruction(String instruction) {
        wateringInstruction.add(instruction);

        
    }
    public void addArray(int numbers){
        array = new int[3];
        int array = numbers;
    }
    public void addArrayList(String favoritePlant){
        favoritePlantArray.add(favoritePlant);
    }

    }


