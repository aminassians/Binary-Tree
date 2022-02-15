package Project3;

public class TreeTest {

	public static void main(String[] args)
	{
		BinaryTreeInterface<Character> binaryTree = new BinaryTree<>('A',new BinaryTree<Character>('B'),
	    	new BinaryTree<Character>('C', new BinaryTree<Character>('D', new BinaryTree<Character>('F'),null), 
	    	new BinaryTree<Character>('E', new BinaryTree<Character>('G'), new BinaryTree<Character>('H'))));
		System.out.println("\nPreorder:");
		binaryTree.Pre_Order_BTree();
		
		System.out.println("\nInrder:");
		binaryTree.In_Order_BTree();
		
		System.out.println("\nPostrder:");
		binaryTree.Post_Order_BTree();
		
		System.out.println("\nNumber Of Nodes:\n" + binaryTree.GetNumberOfNodes_BTree());
		
		System.out.println("\nHeight Of Tree:\n" + binaryTree.GetHeight_BTree());
		
		System.out.println("\nLeft Most Data:\n" + binaryTree.GetLeftmostData_BTree());
		
		System.out.println("\nRight Most Data:\n" + binaryTree.GetRightmostData_BTree());

		
		BinaryNode<Character> root = binaryTree.getRoot();   

		System.out.println("\nPorder:");
		root.Pre_Order_BNode();
		
		System.out.println("\nInorder:");
		root.In_Order_BNode();
		
		System.out.println("\nPostorder:");
		root.Post_Order_BNode();
		
		System.out.println("\nNumber Of Nodes:\n" + root.GetNumberOfNodes_BNode());
		
		System.out.println("\nHeight Of Tree:\n" + root.GetHeight_BNode());
		
		System.out.println("\nLeft Most Data:\n" + root.GetLeftmostData_BNode());
		
		System.out.println("\nRight Most Data:\n" + root.GetRightmostData_BNode());
	}

}
