package com.gabi.tema;

public class Ex5 {
    public static void main(String[] args) {
        int ghicite[]={12,23,44,2,8,14};
        Bilet a=new Bilet(ghicite);
        Loterie lot=new Loterie();

        int corecte[]=lot.numereLoterie();

        int count=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(ghicite[i]==corecte[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==6){
            System.out.println("Ai castigat!");
        }
        else{
            System.out.println("Ai pierdut");
        }
    }
}
