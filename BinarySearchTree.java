public class BinarySearchTree {
    public Node root;
public BinarySearchTree(int value) {
    Node newNode = new Node();
    newNode.value = value;
    newNode.left = null;
    newNode.right = null;
    this.root = newNode;
}

public void insertRecursion(int value) {
    root = insertAt(value,root);
}

public Node insertAt(int value,Node node){
    if(node==null){
        Node newNode = new Node();
        newNode.value = value;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }else{
        if(value>node.value){
            node.right = insertAt(value,node.right);
        }else{
            node.left = insertAt(value,node.left);
        }
        return node;
    }
}

public void insert(int value){
    Node newNode = new Node();
    newNode.value = value;
    newNode.left = null;
    newNode.right = null;
    Node temp = root;
    while(temp!=newNode){
        if(value>temp.value){
            if(temp.right==null){
                temp.right = newNode;
            }
            temp = temp.right;
        }else{
            if(temp.left==null){
                temp.left = newNode;
            }
            temp = temp.left;
        }
    }
}

public void inOrder(Node node){
    if (node!=null){
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
}
}