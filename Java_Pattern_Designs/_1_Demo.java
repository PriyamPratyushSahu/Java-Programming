//Single Responsibility Principle(SRP)
package Java_Pattern_Designs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//The Journal class represents a journal with entries. It follows the SRP by focusing on managing journal entries and related operations.
class Journal {
    private List<String> entries = new ArrayList<>();
    private static int count = 0;

    //adds an entry to the journal, with each entry having a unique identifier based on the count.
    void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    //removes an entry by its index.
    void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    //converts the journal entries into a single string with each entry separated by a newline.
    public String toString(){
        return String.join(System.lineSeparator(), entries);
    }

    //saves the journal to a specified file.
    public void save(String filename) throws FileNotFoundException{
        try(PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }

    // Load journal entries from a local file
    public void load(String filename) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(filename))) {
            entries.clear(); // Clear the existing entries
            while (scanner.hasNextLine()) {
                entries.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Load journal entries from a URL (implementation required)
    public void load(URL url) {
       
    }
}

//The Persistence class is responsible for saving and loading journal entries.
//It provides a method to save a journal to a file and methods for loading from a local file or a URL.
class Persistence{

    //saves the journal to a file. If overwrite is true or the file already exists, it overwrites the file with the journal contents.
    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) throws FileNotFoundException{
        if(overwrite || new File(filename).exists()){
            try(PrintStream out = new PrintStream(filename)){
                out.println(journal.toString());
            }
        }
    }

    // Load journal entries from a local file and return a new Journal object
    public Journal load(String filename) {
        Journal journal = new Journal();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                journal.addEntry(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return journal;
    }

    // Load journal entries from a URL and return a new Journal object (implementation required)
    public Journal load(URL url) {
        return null;
    }
}

class _1_Demo{
    public static void main(String[] args) throws Exception {
        Journal jj = new Journal();
        jj.addEntry("Today I cleaned my room");
        jj.addEntry("Today I cooked food");
        jj.addEntry("Today I went for a walk");
        jj.addEntry("Today I went to temple");

        System.out.println(jj); //jj.toString()

        Persistence pp = new Persistence();
        String filename = System.getProperty("user.dir") + File.separator + "Java_Pattern_Designs" + File.separator + "SaveFileFolder" + File.separator + "Journal_1.txt";
        // Construct the file path based on the current user directory.
        System.out.println(filename);
        pp.saveToFile(jj, filename, true);

        //// Launches the Notepad application with the specified file for viewing the saved journal.
        //Runtime.getRuntime().exec("notepad.exe " + filename);
    }
    
}
