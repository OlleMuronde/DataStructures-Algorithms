package BinaryTrees;

public class Test {

	public static void main(String[] args) {
		BinarySearchTreeNode node= new BinarySearchTreeNode(15);
	node=node.insert(node,10);
	node=node.insert (node,90);
	node=node.insert (node,13);
	node= node.insert(node,64);
    
	BinaryTreeNode temp=new BinaryTreeNode(1);
	temp.setLeft(new BinaryTreeNode(2));
	temp.setRight(new BinaryTreeNode(3));
	temp.setLeft(new BinaryTreeNode(4));
	temp.setRight(new BinaryTreeNode(5));
	
    temp.preOrder(temp);
	temp.postOrder(temp);
	temp.inOrder(temp);
	temp.LevelOrder(temp);
	}

}
