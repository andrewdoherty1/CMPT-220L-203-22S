package base;
import java.util.LinkedList;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        // Create an ArrayList, Populate it, and Print it out
        // Create an LinkedList, Populate it, and Print it out
        // Create an Queue, Populate it, and Print it out
        // Create an Stack, Populate it, and Print it out
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        PlantFile plant1 = new PlantFile(true, "tree", "oak");
        plant1.addLinkedInstruction("Pour Water");
        plant1.addLinkedInstruction("wait for water to be used by plant");
        plant1.addArrayList("Tulip");
        plant1.addArrayList("Rose");
        plant1.addArrayList("Daisy");
        plant1.addArray(1);
        System.out.println(plant1.favoritePlantArray);


    }
}
