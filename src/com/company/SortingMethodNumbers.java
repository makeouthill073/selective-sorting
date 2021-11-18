package com.company;

public class SortingMethodNumbers extends SortingMethodChars{
    @Override
    public void getDescendingChar(char[] numbersDescending){
        for(int c = numbersDescending.length-1 ; c > 0 ; c--){
            for(int n = 0 ; n < c ; n++){
                if( numbersDescending[n] < numbersDescending[n+1] ){
                    char tmp = numbersDescending[n];
                    numbersDescending[n] = numbersDescending[n+1];
                    numbersDescending[n+1] = tmp;
                }
            }
        }
    }
    @Override
    public void getAscendingChar(char[] numbersAscending){
        for(int i = numbersAscending.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( numbersAscending[j] > numbersAscending[j+1] ){
                    char tmp = numbersAscending[j];
                    numbersAscending[j] = numbersAscending[j+1];
                    numbersAscending[j+1] = tmp;
                }
            }
        }
    }


}
