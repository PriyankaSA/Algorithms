package org.algos.string;

/**
 * Created by Priyanka.Sarda on 11/18/2017.
 */
public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        permutation.print("priyanka", "");
    }

    private void print(String string, String prefix) {
        if(string.length() == 0)
            System.out.println(prefix);
        for(int index = 0; index < string.length(); index ++){
            String rem = string.substring(0, index) + string.substring(index + 1);
            print(rem, prefix + string.charAt(index));
        }
    }


}
