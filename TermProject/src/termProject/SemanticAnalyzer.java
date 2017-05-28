package termProject;

public class SemanticAnalyzer {
	String left = null, right = null;
	int count = 0;
	int count1 = 0;
	SimpleNode sibling;
	SimpleNode child;

	public void typeChecking(SimpleNode tree) {
		if (tree.children != null) {
			for (int i = 0; i < tree.children.length; i++) {
				SimpleNode n = (SimpleNode) tree.children[i];
				if (n != null) {
					typeChecking(n);
					if (n.toString().equals("LHS")) {
						left = n.jjtGetChild(0).getType();
						sibling = (SimpleNode) tree.children[i + 1]
								.jjtGetChild(0);
						count = sibling.jjtGetNumChildren();
						System.out.println(count);
						if (count != 0) {
							if (count == 1) {
								child = (SimpleNode) sibling.jjtGetChild(0);
								count1 = child.jjtGetNumChildren();
								if (count1 != 0) {
									right = child.jjtGetChild(0).jjtGetChild(0)
											.getType();
									if (right != null) {
										if (left.equals(right)) {
											System.out.println("Type Matched");
										} else {
											System.out
													.println("Type MisMatched");
										}
									}
									for (int loop = 1; loop < count1; loop++) {
										right = child.jjtGetChild(loop)
												.jjtGetChild(0).jjtGetChild(0)
												.getType();
										if (right != null) {
											if (left.equals(right)) {
												System.out
														.println("Type Matched");
											} else {
												System.out
														.println("Type MisMatched");
											}
										}
									}
								}
							} else {
									right = sibling.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0)
											.getType();
									if (right != null) {
										if (left.equals(right)) {
											System.out.println("Type Matched");
										} else {
											System.out
													.println("Type MisMatched");
										}
									}
								for (int lop = 1; lop < count; lop++) {
									child = (SimpleNode) sibling.jjtGetChild(
											lop).jjtGetChild(0);
									count1 = child.jjtGetNumChildren();
									if (count1 != 0) {
										right = child.jjtGetChild(0)
												.jjtGetChild(0).getType();
										if (right != null) {
											if (left.equals(right)) {
												System.out
														.println("Type Matched");
											} else {
												System.out
														.println("Type MisMatched");
											}
										}
										for (int loop = 1; loop < count1; loop++) {
											right = child.jjtGetChild(loop)
													.jjtGetChild(0)
													.jjtGetChild(0).getType();
											if (right != null) {
												if (left.equals(right)) {
													System.out
															.println("Type Matched");
												} else {
													System.out
															.println("Type MisMatched");
												}
											}
										}
									}
								}
							}
						}
					}

				}

			}

		}
	}
}
