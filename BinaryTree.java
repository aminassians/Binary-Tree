package Project3;

import java.util.NoSuchElementException;
public class BinaryTree<T> implements BinaryTreeInterface<T>
{
    private BinaryNode<T> root;
    
    public BinaryTree()
    {
        root = null;
    } // end default constructor
  
    public BinaryTree(T rootData)
    {
        root = new BinaryNode<T>(rootData);
    } // end constructor
  
    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
    {
        privateSetTree(rootData, leftTree, rightTree);
    } // end constructor
    
    public void setTree(T rootData)
    {
    	root = new BinaryNode<T>(rootData);
    }//end setTree
    
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree)
	{
		privateSetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
	}//end setTree
    
    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
    {
    	root = new BinaryNode<T>(rootData);
    	if ((leftTree != null) && !leftTree.isEmpty())
    		root.setLeftChild(leftTree.root);
    	if ((rightTree != null) && !rightTree.isEmpty())
    	{
    		if (rightTree != leftTree)
    			root.setRightChild(rightTree.root);
    		else
    			root.setRightChild(rightTree.root.copy());
    	} // end if
    	
    	if ((leftTree != null) && (leftTree != this))
    		leftTree.clear(); 
    	if ((rightTree != null) && (rightTree != this))
    		rightTree.clear();
    } // end privateSetTree

	public T getRootData() 
	{
		if (isEmpty())
			throw new NoSuchElementException();
		else
			return root.getData();
	}//end getRootData
	
	public boolean isEmpty()
	{
		return root == null;
	}//end isEmpty
	
	public void clear() 
	{
		root = null;
	}//end clear

	public int GetHeight_BTree() 
	{
		return root.GetHeight_BNode();
	}//end getHeight

	public int GetNumberOfNodes_BTree() 
	{
		return root.GetNumberOfNodes_BNode();
	}//end getNumberOfNodes
	
	public T GetLeftmostData_BTree()
	{
		return root.GetLeftmostData_BNode();
	}//end GetLeftmostData_BTree
	
	public T GetRightmostData_BTree()
	{
		return root.GetRightmostData_BNode();
	}//end GetRightmostData_BTree

	public void Pre_Order_BTree()
	{
		Pre_Order_BTree(root);
	}
	
	private void Pre_Order_BTree(BinaryNode<T> node)
	{
		if(node !=null)
		{
			System.out.println(node.getData());
			Pre_Order_BTree(node.getLeftChild());
			Pre_Order_BTree(node.getRightChild());
		}	
	}//end Pre_Order_BTree
	
	public void In_Order_BTree()
	{
		In_Order_BTree(root);
	}
	
	private void In_Order_BTree(BinaryNode<T> node)
	{
		if(node !=null)
		{
			In_Order_BTree(node.getLeftChild());
			System.out.println(node.getData());
			In_Order_BTree(node.getRightChild());
		}	
	}//end In_Order_BTree
	
	public void Post_Order_BTree()
	{
		Post_Order_BTree(root);
	}
	
	private void Post_Order_BTree(BinaryNode<T> node)
	{
		if(node !=null)
		{
			Post_Order_BTree(node.getLeftChild());
			Post_Order_BTree(node.getRightChild());
			System.out.println(node.getData());
		}

	}//end Post_Order_BTree
	
	public BinaryNode<T> getRoot()
	{
		return root;
	}//end getRoot
	
	

}
