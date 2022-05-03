import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
      HashMap<Integer,Integer> map = new HashMap();
      for(int i = 0; i < a.size(); i++){
        int key = a.get(i);
        if(map.containsKey(key)){
          map.put(key, map.get(key) + 1);
        }else{
          map.put(key,1);
          
        }
      }
      
      
      int result = -1;
      // * Use interator
      // Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
      // while(iter.hasNext()){
      //   Map.Entry element = (Map.Entry)iter.next();
      //   if((Integer)element.getValue() == 1){
      //     result = (Integer)element.getKey();
      //   }
      // }
      
      // * Use Enhanced For loop
      for(Map.Entry<Integer, Integer> element : map.entrySet()){
        if(element.getValue() == 1){
          result = element.getKey();
        }
      }
      
      return result;
      
    }

  }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
