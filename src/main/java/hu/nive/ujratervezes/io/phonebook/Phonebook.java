package hu.nive.ujratervezes.io.phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {

        try {
            File myObj = new File(output);
            FileWriter myWriter = new FileWriter(output);
            Iterator itr = contacts.entrySet().iterator();
            String data = new String("");
            while (itr.hasNext()){
                Map.Entry entry = (Map.Entry) itr.next();
                String name = (String) entry.getKey();
                String number = (String) entry.getValue();
                if (!data.equals("")) {
                    data += "\n";
                }
                data += name + ": " + number;
            }
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred ");
        }
    }

}