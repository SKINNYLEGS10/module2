package com.company;


public class Main {

    public static void main(String[] args) {
        int ten[][] = new int[2][5];
        for (int t = 0; t < 2; t++) {
            ten[t][0] = 1;
            ten[t][1] = 2;
            ten[t][2] = 3;
            for (int e = 0; e < 5; e++) {
                ten[0][e] = 1;
                ten[1][e] = 2;
                System.out.println(ten[t][e]);
            }
        }
        int eleven[] = {2, 5, 7};
        Adding(eleven);
        int Twelve[] = {1, 4, 8};
        int cloneTwelve[] = Twelve.clone();
        for(int w = 0; w < Twelve.length; w++){
            System.out.println(cloneTwelve[w]);
        }
    }
    public static void Adding(int[]eleven){
        int Adding = 0;
        for(int k = 0; k < eleven.length; k++){
            Adding += eleven[k];
            System.out.println(Adding);
        }
    }
}
