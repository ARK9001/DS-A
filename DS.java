/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class DSA
{
    public HashMap<String, Integer> nameAgeMap(String[] people, Integer[] ages){
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        if (people.length != ages.length) { 
            return null;
        }
        
        for (int i = 0; i < people.length; i++){
            hmap.put(people[i], ages[i]);           
        }
        return hmap;        
    }

    public ArrayList<String> strArrToArrLst (String[] group){
        ArrayList<String> arrlst = new ArrayList<String>();
        for(String s: group){
            arrlst.add(s);
        }
        return arrlst;

    }

    public boolean hasUniqueChar(String s){
        HashMap<Character, Integer> charHM = new HashMap<Character, Integer>();
        for (int i = 0; i <s.length(); i++){
            if (charHM.containsKey(s.charAt(i))) {
                return false;
            }
            else{
                charHM.put(new Character(s.charAt(i)), i);
            }
        }

        return true;
    }
    
    
    
    public static void main (String[] args) throws java.lang.Exception
    {
        DSA test = new DSA();
        //String[] ppl = new String[3];
        //Integer[] age = new Integer[10];
        String[] ppl = {"Bruce", "Shane", "Aibar"};
        Integer[] age = {22, 21, 23};
        
        HashMap<String, Integer> nameAge = test.nameAgeMap(ppl, age);
        for (String s: nameAge.keySet()){
            System.out.println("Key : " + s + "      Value: " + nameAge.get(s));
        }
        ArrayList<String> tkdArrLst = test.strArrToArrLst(ppl);
        for (String s: tkdArrLst){
            System.out.println(" Array List element is: " + s);
        }

        String s1 = "orange";
        String s2 = "apple";
        System.out.println("Orange has unique characters: " + test.hasUniqueChar(s1));
        System.out.println("Apple has unique characters: " + test.hasUniqueChar(s2));
        
    }
}
