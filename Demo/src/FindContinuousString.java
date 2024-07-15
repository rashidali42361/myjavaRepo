import java.util.HashSet;
import java.util.Set;

public class FindContinuousString {

	public static void main(String[] args) {
		String str="abcabcbb";
		Set<Character> seen=new HashSet();
		int r=0;
		int l=0;
		int max=0;
		while(r<str.length())
		{
			char c=str.charAt(r);
			if(seen.add(c))
			{
				max=Math.max(max,r-l+1);
				r++;
			}
			else
			{
				while(str.charAt(l)!=c)
				{
					//seen.remove(str.charAt(l));
					l++;
				}
				seen.remove(c);
				l++;
			}
			
		}
		System.out.println(max);
		
		
	

	}

}
