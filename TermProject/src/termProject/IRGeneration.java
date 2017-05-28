package termProject;

public class IRGeneration 
{
	static int w = 0;
	static int caseCount = 0;
	static String right = " ";
	String left = "";
	int count = 0;
	int count1 = 0;
	int count2 = 0;
	SimpleNode sibling;
	SimpleNode child;
	public String InterMedCode(SimpleNode tree)
	{

		if (tree.children != null)
		{
			for (int i = 0; i < tree.children.length; ++i)
			{
				SimpleNode n = (SimpleNode) tree.children[i];
				if (n != null) {
					InterMedCode(n);
					if(n.toString().equals("caseSect"))
					{
						String just = "";
						child = (SimpleNode)n.jjtGetChild(0);
						just += "\n\ncase"+caseCount+":";
						caseCount++;
						just += "\nt"+w+": "+child.jjtGetChild(2).jjtGetValue();
						w++;
						just += "\nt"+w+": "+child.jjtGetChild(0).jjtGetValue()+child.jjtGetChild(1).jjtGetValue()+"t"+(w-1);
						w++;
						just += "\nIfz t"+(w-1)+" goto case"+caseCount;
						just += assignment( (SimpleNode)n.jjtGetChild(1).jjtGetChild(1) );
						right += "\n"+just;
					}
					else if(n.toString().equals("defaultSect"))
					{
						right += "\n\ncase"+caseCount+":";
						caseCount++;
						right += assignment( (SimpleNode)n.jjtGetChild(0).jjtGetChild(1) );
					}
					else if(n.toString().equals("forSect"))
					{
						String j = "";
						j += "\nforSect"+caseCount+":";
						caseCount++;
						j += "\nt"+w+": "+n.jjtGetChild(0).jjtGetChild(1).jjtGetChild(0).jjtGetValue();
						w++;
						int cg = w-1;
						j += "\nt"+w+": "+n.jjtGetChild(0).jjtGetChild(0).jjtGetValue()
						  +n.jjtGetChild(0).jjtGetChild(1).jjtGetValue()+"t"+(w-1);
						j +="\nIfz t"+(w-1)+n.jjtGetChild(1).jjtGetChild(1).jjtGetValue()
						   +n.jjtGetChild(1).jjtGetChild(2).jjtGetValue()
						   +" goto forSect"+caseCount;
						j += assignment((SimpleNode)n.jjtGetChild(3).jjtGetChild(0).jjtGetChild(1));
						if(n.jjtGetChild(2).jjtGetChild(1).jjtGetValue() == "++")
						{
							j += "\nt"+cg+": "+"t"+cg+"+1";
						}
						else
						{
							j += "\nt"+cg+": "+"t"+cg+"-1";
						}
						w++;
						j += "\ngoto forSect"+(caseCount-1)+"\n\nforSect"+caseCount+":";
						caseCount++;
						right += "\n" + j;
					}
					else if(n.toString().equals("outputSect"))
					{
						right += "\n\nPushParam "+n.jjtGetChild(0).jjtGetValue();
					}
			   }
		   }
		}
		return right;
	}
	public String mul(SimpleNode sib)
	{
		String temp = "";
		int cn = 0;
		temp += "\nt"+w+": "+sib.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
 		  cn = sib.jjtGetChild(0).jjtGetNumChildren();
 		  for(int loop = 1; loop < cn; loop++)
 		  {
 			 if(loop == 1)
 			 {
 				temp += sib.jjtGetChild(0).jjtGetChild(loop).jjtGetValue().toString()
 					  + sib.jjtGetChild(0).jjtGetChild(loop).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
 			 }
 			 else
 			 {
 				temp +="\nt"+w+": t"+(w-1)+sib.jjtGetChild(0).jjtGetChild(loop).jjtGetValue().toString()
     			  + sib.jjtGetChild(0).jjtGetChild(loop).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
 			 }
 			 w++;	
 		   }
		return temp;
	}
	public String add(SimpleNode sib)
	{
		String temp = "";
		int cn = 0;
		cn = sib.jjtGetNumChildren();
		temp += "\nt"+w+": "+sib.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
   		for(int loop = 1; loop < cn; loop++)
   		{
   			if(loop == 1)
   			{
   				temp += sib.jjtGetChild(loop).jjtGetValue().toString()
   					  +sib.jjtGetChild(loop).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
   			}
   			else
   			{
   				temp +="\nt"+w+": t"+(w-1)+sib.jjtGetChild(loop).jjtGetValue().toString()
       			  + sib.jjtGetChild(loop).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
   			}
   			w++;
	        }
   		return temp;
	}
	public String assignment(SimpleNode sib)
	{
		String temp ="";
		SimpleNode chil=(SimpleNode)sib.jjtGetChild(0);
		count = chil.jjtGetNumChildren();
	
       	if (count != 0)
       	{
   
       		if(count == 1)
       		{ // multiplicationOperation
       		  temp += mul(chil);
       		}
       		else 
       		{ // more than one children
       			   if(chil.jjtGetChild(0).jjtGetNumChildren() == 1)
       			   {
		       		temp += add(chil);
       		       } 
       			   else
       			   {
       				   temp += mul(chil);	 
		       		   temp +="\nt"+w+": t"+(w-1)+chil.jjtGetChild(1).jjtGetValue().toString()
			       			  + chil.jjtGetChild(1).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetValue();
		       		   w++;
       			   }
       	     }
       	 }
       	 temp += "\nt"+w+": "+sib.jjtGetParent().jjtGetChild(0).jjtGetChild(0).jjtGetValue()+"=t"+(w-1);
		 w++;
		 return temp;
	}
}
