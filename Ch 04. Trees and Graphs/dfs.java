 public static void dfs(Node root)
	    {       
	        //Avoid infinite loops
	        if(root == null) return;

	        System.out.print(root.getVertex() );
	        root.state = State.Visited;

	        //for every child
	        for(Node n: root.getAdjacent())
	        {
	            //if childs state is not visited then recurse
	            if(n.state == State.Unvisited)
	            {
	                dfs(n);
	            }
	        }
	    }
	 
