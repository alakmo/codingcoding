 Scanner scanner = new Scanner(System.in);
        String line;
        String question = "";
        line = scanner.nextLine();
        if (line == null){
            System.out.println("There was no question here. ");
            System.exit(1);
        } else if (line.isEmpty() || line.trim().equals("") || line.trim().equals("\n")) {
            System.out.println("Skipped a blank line");
        } else {
            question = line;
            System.out.println("Question="+question);
        }


        // Update: added this to confirm we have skipped a line

        
        while ((line = scanner.nextLine())!= null){
            System.out.println("Line:"+line);
        }
		





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
		


//HERE Ahmad 


			 int c=0;
			ArrayList<String> list=new ArrayList<String>();
			
			try(Stream<String> stream = Files.lines(Paths.get("input1.txt"))){
				list= (ArrayList<String>) stream.map(line -> line.trim())
		          .filter(line -> !line.isEmpty()).collect(Collectors.toList());
		        		  
		          
		          //forEach(line->list.add(Integer.parseInt(line)));
			}catch(Exception e){    
			    e.printStackTrace();            
			}  
			//list = [44 1 2, 111, 010, 1050, 100]
			
			 
		String numbers = list.get(0);
		String[] numbersArray = numbers.split(" "); 
			
			
			
			
			
			
			
