package Project3;

class BinaryNode<T> implements BinaryNodeInterface<T>
{
	private T data;
	private BinaryNode<T> leftChild;
	private BinaryNode<T> rightChild;
	
	public BinaryNode()
	{
		this(null);
	}//end default constructor
	
	public BinaryNode(T dataPortion)
	{
		this(dataPortion, null, null);
	}//end constructor
	
	public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, BinaryNode<T> newRightChild)
	{
		data = dataPortion;
		leftChild = newLeftChild;
		rightChild = newRightChild;
	}//end constructor
	
	public T getData()
	{
		return data;
	}//end getData
	
	public void setData(T newData)
	{
		data = newData;
	}//end setData
	
	public BinaryNode<T> getLeftChild()
	{
		return leftChild;
	}//end getLeftChild
	
	public void setLeftChild(BinaryNode<T> newLeftChild)
	{
		leftChild = newLeftChild;
	}//end setLeftChild
	
	public boolean hasLeftChild() 
	{
		return leftChild != null;
	}//end hasLeftChild
	
	public boolean isLeaf()
	{
		return (leftChild == null) && (rightChild == null);
	}//endisLeaf
	
	public BinaryNode<T> getRightChild()
	{
		return rightChild;
	}//end getLeftChild
	
	public void setRightChild(BinaryNode<T> newRightChild)
	{
		rightChild = newRightChild;
	}//end setRightChild
	
	public boolean hasRightChild() 
	{
		return rightChild != null;
	}//end hasRightChild
	
	public int GetNumberOfNodes_BNode()
	{
		int leftNumber = 0;
		int rightNumber = 0;
		
		if(leftChild != null)
			leftNumber = leftChild.GetNumberOfNodes_BNode();
		if(rightChild != null)
			rightNumber = rightChild.GetNumberOfNodes_BNode();
		
		return 1 + leftNumber + rightNumber;
	}//end getNumberOfNodes
	
	public int GetHeight_BNode()
	{
		return GetHeight_BNode(this);
	}
	
	private int GetHeight_BNode(BinaryNode<T> node)
	{
		int height = 0;
		if (node != null)
			height = 1 + Math.max(GetHeight_BNode(node.getLeftChild()),GetHeight_BNode(node.getRightChild()));
		return height;
	}//end GetHeight_BNode
	
	public BinaryNode<T> copy()
	{
		BinaryNode<T> newRoot = new BinaryNode<>(data);
		if(leftChild != null)
			newRoot.setLeftChild(leftChild.copy());
		if(rightChild != null)
			newRoot.setRightChild(rightChild.copy());
		
		return newRoot;
	}//end copy
	
	public T GetLeftmostData_BNode( )
	{
		if (leftChild == null)
			return data;
		else
			return leftChild.GetLeftmostData_BNode( );
	}//end getLeftMostData
	
	public T GetRightmostData_BNode( )
	{
		if (rightChild == null)
			return data;
		else
			return rightChild.GetRightmostData_BNode( );
	}//end getRightmostData

	public void Pre_Order_BNode()
	{
		System.out.println(data);
		if(leftChild !=null)
		{
			leftChild.Pre_Order_BNode();
		}
		if(rightChild !=null)
		{
			rightChild.Pre_Order_BNode();
		}
	}//end Pre_Order_BNode
	
	public void In_Order_BNode()
	{
		if(leftChild !=null)
		{
			leftChild.In_Order_BNode();
		}
		System.out.println(data);
		if(rightChild !=null)
		{
			rightChild.In_Order_BNode();
		}
	}//end In_Order_BNode
	
	public void Post_Order_BNode()
	{
		if(leftChild !=null)
		{
			leftChild.Post_Order_BNode();
		}
		if(rightChild !=null)
		{
			rightChild.Post_Order_BNode();
		}
		System.out.println(data);
	}//end Post_Order_BNode
	
}//end BinaryNode
