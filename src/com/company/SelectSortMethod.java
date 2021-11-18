package com.company;

import java.util.Arrays;

public class SelectSortMethod {

    final String chSymbols = "sym";
    final String chNumbers = "num";

    final String ascending = "up";
    final String descending = "down";

    public void getChoice(String line, String scrChoiceMethod, String scrChoiceSort){

        String symbols = "";
        String numbers = "";

        SortingMethodNumbers sortingMethodNumbers = new SortingMethodNumbers();
        SortingMethodChars sortingMethodChars = new SortingMethodChars();
        WriteFile write = new WriteFile();

        if (scrChoiceMethod.equalsIgnoreCase(chSymbols)) {
            symbols = line.replaceAll("[0-9]", "");
        } else if (scrChoiceMethod.equalsIgnoreCase(chNumbers)) {
            numbers = line.replaceAll("[a-zA-Z]+", "");
        } else {
            System.out.println("Попробуйте еще раз ");
        }

        symbols = symbols.replaceAll(", ", "");
        numbers = numbers.replaceAll(", ", "");
        char[] resultNums = numbers.toCharArray();
        char[] resultSyms = symbols.toCharArray();
        symbols.isEmpty();
        numbers.isEmpty();

        if (scrChoiceSort.equalsIgnoreCase(ascending)){
            if (numbers.isEmpty() == false){
                sortingMethodNumbers.getAscendingChar(resultNums);
                System.out.println(Arrays.toString(resultNums));
                write.writeFile(resultNums);
                return;
            }else if (symbols.isEmpty() == false){
                sortingMethodChars.getAscendingChar(resultSyms);
                System.out.println(Arrays.toString(resultSyms));
                write.writeFile(resultSyms);
                return;
            }
        }else if (scrChoiceSort.equalsIgnoreCase(descending)){
            if (numbers.isEmpty() == false){
                sortingMethodNumbers.getDescendingChar(resultNums);
                System.out.println(Arrays.toString(resultNums));
                write.writeFile(resultNums);
                return;
            }else if(symbols.isEmpty() == false){
                sortingMethodChars.getDescendingChar(resultSyms);
                System.out.println(Arrays.toString(resultSyms));
                write.writeFile(resultSyms);
                return;
            }
        }else {
            System.out.println("Попробуйте еще раз!");
        }
    }
}
