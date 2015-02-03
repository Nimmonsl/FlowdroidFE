/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package featureextractor;

import java.io.File;

/**
 *
 * @author gregsimpson
 */
public class FeatureExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "AngryBirds.txt";
        File file = new File(filename);
        
        
        //char character = 70;
        //System.out.println(character);
 
        CharacterCount count = new CharacterCount(file);
        count.getFrequency();
        count.printFrequency();
        
        count.printUnigram();
    }
    
}
