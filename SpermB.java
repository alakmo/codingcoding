		package s_perm_b;
		
		import java.util.HashMap;
		
		public class SpermB {
		
		public SpermB(){}
		
			public void getPerm(String s,String B){ 
				
		
			HashMap<Character,Integer> sMap=new HashMap<Character,Integer>(s.length());
			HashMap<Character,Integer> bMap=new HashMap<Character,Integer>();
			
			for(Character c: s.toCharArray())
			{
				
				if(!sMap.containsKey(c))
				{
					sMap.put(c, 1);
					
				}
				else 
				{
					sMap.put(c, sMap.get(c)+1);
				}
							
			}
			
			StringBuilder buffer=new StringBuilder();
			int counter=0;
			for(Character c:B.toCharArray())
			{	
				counter++;
				if(sMap.containsKey(c)){
					
					if(!bMap.containsKey(c)|| (bMap.get(c) < sMap.get(c)))
					{
								if(!bMap.containsKey(c))
								{
									bMap.put(c,0);
								}
									bMap.put(c,bMap.get(c)+1);
						buffer.append(c);
						
						if(buffer.length()==s.length())
						{
							System.out.print(buffer+"  ");
									buffer.deleteCharAt(0);
							bMap.put(B.charAt(counter-s.length()),bMap.get(B.charAt(counter-s.length()))-1);
					}
					}
					else{
							buffer.append(c);
							
							bMap.put(c,bMap.get(c)+1);
			
							buffer.deleteCharAt(0);
							bMap.put(B.charAt(counter-s.length()),bMap.get(B.charAt(counter-s.length()))-1);
					}
					}	
				else{
					
					buffer=new StringBuilder();
					bMap=new HashMap<Character,Integer>();
					
				}
				
				
						}
				
			}
			
			
		
			
			public static void main(String[] args) {
				
				SpermB s=new SpermB();
				s.getPerm("abbc","babcabbacaasdsasdffbcbabcacbdfsfsdfsdsdfdfsdf");
							
				// TODO Auto-generated method stub
		
			}
		
			
		}
		
