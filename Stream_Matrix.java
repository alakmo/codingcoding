
	public static void main(String[] args) throws FileNotFoundException {
		
		 int c=0;

		List list=new List<Integer>();
		
		try(Stream<String> stream = Files.lines(Paths.get("input1.txt"))){
			list=  stream.map(line -> line.trim())
	          .filter(line -> !line.isEmpty()).mapToInt(Integer::parseInt).collect(Collectors.toList());
	        		  
	          
	          //forEach(line->list.add(Integer.parseInt(line)));
		}catch(Exception e){    
		    e.printStackTrace();            
		}   
		
