package Online_Coding._01_Collections_Practice;

import java.util.*;

public class Practice {

    public static void main(String args[]) {
            Scanner pp = new Scanner(System.in);
            int n;
            n = pp.nextInt();
            for (int i = 1; i <= n; i++) {
                String s = pp.nextLine();
                String strArr[] = s.split(" ");
                //System.out.println(Arrays.toString(strArr));
                
                Set<String> uniqueWordsCaps = new HashSet<>();
                PriorityQueue<String> pQ = new PriorityQueue<>();
                for (String ss : strArr) {
                    if (!uniqueWordsCaps.contains(ss.toUpperCase())) {
                        uniqueWordsCaps.add(ss.toUpperCase());
                        pQ.add(ss);
                    }
                }
                
                // System.out.println(uniqueWordsCaps);
                //System.out.println(pQ);
                StringBuilder stringBuilder = new StringBuilder();
                while (!pQ.isEmpty()) {
                    String element = pQ.poll();
                    stringBuilder.append(element);
                    stringBuilder.append(" ");
                }

                
                String resultString = stringBuilder.toString().trim();
                System.out.println(resultString);
            }
            pp.close();
        }
}
