package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode left, right;

	public BinaryTreeNode(int data) {
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode left){
		this.left=left;
	}
    
	public void setRight(BinaryTreeNode right){
		this.right=right;
	}
	
	public void preOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.println("PreOrder "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(BinaryTreeNode root) {
		if (root != null) {
		inOrder(root.left);
		System.out.println("InOrder "+root.data);
		inOrder(root.right);
		}
	}
   public void postOrder(BinaryTreeNode root){
	   if (root != null) {
	   postOrder(root.left);
	   postOrder(root.right);
	   System.out.println("postOrder "+root.data);
   }
   }
   public void LevelOrder(BinaryTreeNode root){
	   Queue<BinaryTreeNode> q= new LinkedList();
	   q.add(root);
	   while(!q.isEmpty())
	   {
		   BinaryTreeNode temp= q.poll();
		   System.out.println("Level Order"+ temp.data);
		   if(temp.left!=null){
			   q.add(temp.left);
		   }
           if(temp.right!=null){
        	   q.add(temp.right);
		   }
	   }
   }
}
