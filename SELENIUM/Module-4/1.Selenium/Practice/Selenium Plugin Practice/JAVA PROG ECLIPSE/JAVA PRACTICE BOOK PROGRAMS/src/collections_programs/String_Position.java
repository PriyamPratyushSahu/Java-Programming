package collections_programs;
import java.util.*;
class Source3
{
	public List<List<Integer>> printPositions(String S)
	{
		List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length(); // i is the start of each group
        for (int j = 0; j < N; ++j) {
            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
                // Here, [i, j] represents a group.
                if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1;
            }
        }

        return ans;
	}
	public ArrayList<String> listAfter(ArrayList<String> a, String m, String n)
	{
		//a.add(a.indexOf(m)+1,n);
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i)).equals(m))
			{
				a.add(i+1,n);
			}
		}
		return a;
	}
}
public class String_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source3 s=new Source3();
		System.out.println(s.printPositions("mousssssseeee"));
		ArrayList<String> list=new ArrayList<String>();
		list.add("ad");
		list.add("cc");
		list.add("df");
		list.add("ez");
		String m = "cc", n = "kc";
		System.out.println(s.listAfter(list,m,n));
	}

}
