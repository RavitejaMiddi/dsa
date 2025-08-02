package hashtable;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {


    }
    public static int majEle(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else {
                int val = hm.get(arr[i]);
                hm.replace(arr[i],val,val + 1);
            }
        }
        int median = arr.length/2;

        for(Map.Entry num : hm.entrySet()){
            if(Integer.parseInt(num.getValue().toString()) > median){
                return Integer.parseInt(num.getKey().toString());
            }
        }
        return 0;

    }
}
