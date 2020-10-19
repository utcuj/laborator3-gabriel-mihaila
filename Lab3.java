package com.codegym.lab3;

public class Lab3 {
    public static boolean isVocala(char x){
        char voc[]={'a','e','i','o','u'};

        for(int i=0;i<5;i++) {
            if(x==voc[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //4.3
        String cuvant="coperta";
        int vocale=0,consoane=0;


        for(int j=0;j<cuvant.length();j++)
        {
            if(isVocala(cuvant.charAt(j)))
                vocale++;
            else
                consoane++;
        }

        System.out.println(vocale);
        System.out.println(consoane);
    }
}
