static void findBSTMinimumValueDifference(Node root) {
		 if (root != null) {
			 findBSTMinimumValueDifference(root.left);
			 if (previous != null && minDiff > root.value - previous.value) {
				 minDiff = root.value - previous.value;
			 }
			 previous = root;
			 findBSTMinimumValueDifference(root.right);
		 }
	 }
	 
static int minDiff = Integer.MAX_VALUE;
static Node previous;
