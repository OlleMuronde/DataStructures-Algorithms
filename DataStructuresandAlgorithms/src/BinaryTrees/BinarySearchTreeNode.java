package BinaryTrees;

public class BinarySearchTreeNode {
	int data;
	private BinarySearchTreeNode left, right;

	public BinarySearchTreeNode(int data) {
		this.data = data;
		left=null;
		right=null;
	}

	public BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.left != null) {
			findMin(root.left);
		}
		return root;
	}

	public BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.right != null) {
			findMin(root.right);
		}
		return root;
	}

	public BinarySearchTreeNode find(BinarySearchTreeNode root, int data) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			find(root.left, data);
		} else if (data > root.data) {
			find(root.right, data);
		}
		System.out.println("found " + root.data);
		return root;
	}


public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data){
	if(root==null){
	 root=new BinarySearchTreeNode(data);
	 System.out.println ("Just assigned "+data);
	 return root; 
	}
if(data<root.data){
	System.out.println("going left with value "+data);
	root.left=insert(root.left,data);
	}
else if(data>root.data){
	System.out.println ("going right with value "+data);
	root.right=insert(root.right,data);
	}

return root;
}


}
