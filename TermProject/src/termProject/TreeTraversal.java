package termProject;


public class TreeTraversal 
{
  public void treeTraversalTest(SimpleNode tree)
  {
	  if (tree.children != null) 
	  {
		  for (int i = 0; i < tree.children.length; i++)
		  {
			  SimpleNode n = (SimpleNode)tree.children[i];
			  if(n != null)
			  {
				  
				  treeTraversalTest(n);
				  System.out.println("\n" + tree.children[i].toString() + "\n");
				  if(tree.children[i].toString().equals("initBlock"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("declaration"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("integerSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("identifier"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("floatSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("codeBlock"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("switchSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("switchBody"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("caseSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("condStatement"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("condOp"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("assignmentStatement"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("LHS"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("RHS"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("additionOperation"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("multiplicationOperation"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("intermediateAddition"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("intermediateMultiplication"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("identCons"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("outputSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("forSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("declare"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("initialization"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("constant"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("InDeOperation"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("InDeOperator"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("defaultSect"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }
				  else if(tree.children[i].toString().equals("forBody"))
				  {
					  System.out.println("It's value: " + n.jjtGetValue());
					  System.out.println("Parent: " + n.jjtGetParent());
					  if(n.jjtGetNumChildren() != 0)
					  {
					   System.out.println("First Children: " + n.jjtGetChild(0));
					   System.out.println("Total Children: " + n.jjtGetNumChildren());
					  }
				  }				  
				  
			  }
		  }
	  }
  }
}
