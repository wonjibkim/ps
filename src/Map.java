import java.util.*;
import java.lang.*;

class Map
{
    public static void main (String[] args) throws java.lang.Exception
    {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("key1", 1);
        hm.put("key2", 2);
        hm.put("key3", 3);

        if(hm.containsKey("key1") && hm.containsValue(1))
            System.out.println("YES");

        hm.put("key1", hm.getOrDefault(("key1"), 0) * 10);

        List<String> keyList = new ArrayList<>(hm.keySet());

        // 오름차순으로 키 정렬
        Collections.sort(keyList, new Comparator<String>(){
            public int compare(String s1, String s2){
                int v1 = hm.get(s1);
                int v2 = hm.get(s2);

                return Integer.compare(v1, v2);
            }
        });

        // 출력
        for(String s : keyList){
            System.out.println(s + " = " + hm.get(s));
        }

        System.out.println(hm.size());
    }
}
