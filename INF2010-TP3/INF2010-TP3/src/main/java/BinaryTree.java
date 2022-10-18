public class BinaryTree<T> {
    protected BinaryNode<T> root = null;

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(BinaryNode<T> node) {
        // TODO
        if (node != null){
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.value);
        }
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(BinaryNode<T> node) {
        // TODO
        if (node != null){
            System.out.println(node.value);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(BinaryNode<T> node) {
        // TODO
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.value);
            printInOrder(node.right);
        }
    }
}

