package hashtable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Candies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{6,6,6,6}));

    }
    public static int distributeCandies(int[] candyType) {
    int candies = 0;
    int candiesToEat = candyType.length/2;
        Set<Integer> uniqueCandies = new HashSet<>();
        Set set = new TreeSet();
        //we will have all unique candies
        for(int i=0;i<candyType.length;i++){
            if(!uniqueCandies.contains(candyType[i])){
                uniqueCandies.add(candyType[i]);
            }
        }
    candies = uniqueCandies.size();
    if(candies>candiesToEat)
        return candiesToEat;

    return candies;
    }
}
