package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// Crearea unui dictionar de tip HashMap
        HashMap<String, Double> dictionar=new HashMap<String, Double>();

        //Adaugarea elementelor in dictionar
        //Persoana si contul bancar in EUR
        dictionar.put("Ana", 3434.81);
        dictionar.put("Alex", 123.49);
        dictionar.put("Dan", 1378.00);
        dictionar.put("Ion", 99.22);
        dictionar.put("Claudiu", -19.08);

        System.out.println(dictionar.get("Dan"));

        //Parcurgerea Dictionaruilui prin folosirea unui for
        for(Map.Entry<String,Double> entry:dictionar.entrySet() ){
            System.out.print(entry.getKey()+": ");
            System.out.println(entry.getValue());
        }

        //Depozitarea a 1000 euro in contul lui Ion
        double valoareCont=dictionar.get("Ion");
        dictionar.put("Ion", valoareCont+1000 ); //rescriere
        System.out.println("Noul cont a lui Ion este "+dictionar.get("Ion"));
    }
}
