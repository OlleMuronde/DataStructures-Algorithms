package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
	/// Breadth first traversal, similar to level order traversal. i.e go in as
	/// far as you can and then
	/// print graph nodes.
	
	private Node rootNode;
	
	public Traversals(Node rootNode){
		this.rootNode=rootNode;
	}

	public void dfs(Node rootNode) {
		Stack<Node> stack = new Stack();
		stack.add(rootNode);
		System.out.println(rootNode.getLabel());
		rootNode.setVistedtrue();
		while (!stack.isEmpty()) {
			Node parent = stack.peek();
			Node child = returnUnvisitedChildren(parent);
			if (child != null) {
				stack.add(child);
				System.out.println(child.getLabel());
				child.setVistedtrue();
			} else {
				stack.pop();
			}

		}
	} /// similar to level order traversal you go level by level from root using
		/// queue

	public void bfs(Node rootNode) {
		Queue<Node> q = new LinkedList();
		q.add(rootNode);
		System.out.println(rootNode.getLabel());
		

	}

	public Node returnUnvisitedChildren(Node node) {

		return null;
	}
}
