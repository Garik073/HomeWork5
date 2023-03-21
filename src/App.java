/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
import java.util.Map;

import javax.sound.midi.Soundbank;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        Map<Integer, List<String>> stats = new HashMap<>();
        String[] poem = str.split(" ");
        
        for(int i = 0; i < poem.length; i++) {
            String s = poem[i];
            Integer key = s.length();
            
            if(stats.containsKey(key)) {
                stats.get(key).add(s);
            } else {
                List<String> al = new ArrayList<String>();
                al.add(s);
                stats.put(key, al);
            }
            
        }
        
        /* print result */
        
        for(Integer key : stats.keySet()) {
            System.out.printf("%s [%s]  \n", key, String.join(", ", stats.get(key)));
        }
        
    }
}