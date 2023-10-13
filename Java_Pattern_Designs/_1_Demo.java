//Single Responsibility Principle(SRP)
package Java_Pattern_Designs;

import java.util.ArrayList;
import java.util.List;

class Journal {
    private List<String> entries = new ArrayList<>();
    private static int count = 0;

    void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(), entries);
    }
}

class _1_Demo{
    public static void main(String[] args) {
        Journal jj = new Journal();
        jj.addEntry("Today I cleaned my room");
        jj.addEntry("Today I cooked food");
        jj.addEntry("Today I went for a walk");
        jj.addEntry("Today I went to temple");

        System.out.println(jj);
    }
    
}
