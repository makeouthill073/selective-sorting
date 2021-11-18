package com.company;

import java.util.Scanner;

public class ChoiceTheSortType {

    public String sortType(){
        Scanner choiceMethod = new Scanner(System.in);
        System.out.println("{Sym} - {Num}");
        System.out.print("Напишите что отсортировать: ");
        String scrChoiceMethod = choiceMethod.nextLine();
        return scrChoiceMethod;
    }
    public String sort() {
        Scanner scrSort = new Scanner(System.in);
        System.out.println("{Up} - {Down}");
        System.out.print("Напишите выбор сортировки: ");
        String scrChoiceSort = scrSort.nextLine();
        return scrChoiceSort;
    }

}
