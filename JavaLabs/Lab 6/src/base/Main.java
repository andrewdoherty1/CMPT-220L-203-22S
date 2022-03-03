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
        // add elements to LinkedList
        plant1.addLinkedInstruction("Pour Water");
        plant1.addLinkedInstruction("wait for water to be used by plant");
        // add elements to ArrayList
        plant1.sunLightInstruction("place in window");
        plant1.sunLightInstruction("let sun hit");
        plant1.sunLightInstruction("watch plant grow");
        // add elements to Queue
        plant1.addQueue("Make hole in dirt");
        plant1.addQueue("place seed in hole");
        plant1.addQueue("cover seed with dirt");
        plant1.addQueue("water seed");
        // add elements to stack
        plant1.addStack("Bottom of pot");
        plant1.addStack("Sand");
        plant1.addStack("Soil");
        plant1.addStack("Top of pot(air)");
        // add elements to array
        plant1.addArray(1);
        // print statement for plant1
        System.out.println(plant1.sunLightArrayList);


    }
}
