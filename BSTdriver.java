public class BSTdriver{
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(6);
        tree.insertRecursion(4);
        tree.insertRecursion(7);
        tree.insertRecursion(10);
        tree.insertRecursion(8);
        tree.insertRecursion(5);
        //tree.inOrder(tree.root);
        tree.insert(5);
        tree.insert(9);
        tree.insert(12);
        tree.insert(3);

        tree.insertRecursion(9);
        tree.insertRecursion(15);
        tree.insert(25);
        tree.insert(6);

        System.out.println(" ");
        tree.inOrder(tree.root);
    }
}