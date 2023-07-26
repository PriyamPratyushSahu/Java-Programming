
package Online_Coding._01_Collections_Practice;

import java.util.*; 


public class ListOfCollection {

    public static void main(String args[]){
        //List
        List<Integer> L_01 = new ArrayList<>();
        List<Integer> L_02 = new LinkedList<>();
        ArrayList<Integer> AL_01 = new ArrayList<>();
        LinkedList<Integer> LL_02 = new LinkedList<>();

        //Queue
        Queue<Integer> Q_01 = new PriorityQueue<>();
        Queue<Integer> Q_02 = new ArrayDeque<>();
        PriorityQueue<Integer> PQ_03  = new PriorityQueue<>();
        ArrayDeque<Integer> AD_04 = new ArrayDeque<>();

        //Set
        Set<Integer> S_01 = new TreeSet<>();
        Set<Integer> S_02 = new HashSet<>();
        Set<Integer> S_03 = new LinkedHashSet<>();
        TreeSet<Integer> TS_05 = new TreeSet<>();
        HashSet<Integer> HS_06 = new HashSet<>();
        LinkedHashSet<Integer> LHS_07 = new LinkedHashSet<>();

        //Map
        Map<Integer,Integer> M_01 = new HashMap<>();
        //Map<Integer,Integer> M_02 = new TreeMap<>();
        Map<Integer,Integer> M_03 = new LinkedHashMap<>();
        HashMap<Integer,Integer> HM_08 = new HashMap<>();
        //TreeMap<Integer,Integer> TM_09 = new TreeMap<>();
        LinkedHashMap<Integer,Integer> LHM_10 = new LinkedHashMap<>();

    }
    
}
