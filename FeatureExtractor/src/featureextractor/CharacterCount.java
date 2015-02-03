/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package featureextractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author gregsimpson
 */
public class CharacterCount {
    int [] array = new int [95];
    double [] unigram = new double [95];
    File file;
    long total;
    
    public CharacterCount(File file){
        this.file = file;
        total = 0;
    }
    
    public void getFrequency(){
        BufferedReader buff = null;
        try {
            String currentLine;
            buff = new BufferedReader(new FileReader(file));
            while((currentLine = buff.readLine()) != null){
                for (int x = 0; x < currentLine.length(); x++){
                    char letter = currentLine.charAt(x);
                    array[letter-' '] += 1;
                    total++;
                }
            }
        }catch(Exception e){
            
        }

    }
    
    public void printFrequency(){
        for(int x = 0; x<array.length; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }
    
    public int [] getFrequencyArray(){
        return array;
    }
    
    public void printUnigram(){
        for(int x=0; x<array.length; x++)
            System.out.print((double)array[x]/total + " ");
    }
    
    public double [] getUnigram(){
        for(int x=0; x<array.length; x++)
            unigram[x] = array[x] / total;
        return unigram;
    }
}
