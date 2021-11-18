package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeFile(char[] syms){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("out.txt");
            fileWriter.write(syms);
            fileWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
