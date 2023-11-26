package main.java.com.ohgiraffers.understand;
import java.util.*;
public class lotto3 {
    public static void main(String[] args) {
        HashMap<String, Set<Integer>> lm = new HashMap<>();

        for (int i = 1; i < 10; i++) {
            Set<Integer> ls = gln();
            lm.put("로또 " + i + " 번", ls);
        }

        Set<Integer> wn = gln();

        boolean wf = false;
        for (Map.Entry<String, Set<Integer>> entry : lm.entrySet()){
            Set<Integer> um = entry.getValue();

            if (um.equals(wn)){
                System.out.println("당첨");
                wf = true;
                break;
            }
        }
        if (!wf){
            System.out.println("탈락");
        }
    }
    public static Set<Integer> gln(){
        Set<Integer> ls = new HashSet<>();
        Random r = new Random();

        while (ls.size() < 3){
            int number = r.nextInt(5)+1;
            ls.add(number);
        }
        return ls;
    }
}

