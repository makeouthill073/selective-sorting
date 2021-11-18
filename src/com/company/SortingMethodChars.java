package com.company;

public class SortingMethodChars {

    public void getDescendingChar(char[] symbolsDescending){
        for(int i = symbolsDescending.length-1 ;
            i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( symbolsDescending[j] < symbolsDescending[j+1] ){
                    char tmp = symbolsDescending[j];
                    symbolsDescending[j] = symbolsDescending[j+1];
                    symbolsDescending[j+1] = tmp;
                }
            }
        }
    }

    public void getAscendingChar(char[] symbolsAscending){
        for(int i = symbolsAscending.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( symbolsAscending[j] > symbolsAscending[j+1] ){
                    char tmp = symbolsAscending[j];
                    symbolsAscending[j] = symbolsAscending[j+1];
                    symbolsAscending[j+1] = tmp;
                }
            }
        }
    }
}
