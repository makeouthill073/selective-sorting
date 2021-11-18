package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("symbols.txt");
        Scanner scannerFile = null;
        try {
            scannerFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        String line = scannerFile.nextLine();

        SelectSortMethod selectSortMethod = new SelectSortMethod();
        ChoiceTheSortType choiceTheSortTyp = new ChoiceTheSortType();

        selectSortMethod.getChoice(line, choiceTheSortTyp.sortType(), choiceTheSortTyp.sort());

        scannerFile.close();
    }
}
