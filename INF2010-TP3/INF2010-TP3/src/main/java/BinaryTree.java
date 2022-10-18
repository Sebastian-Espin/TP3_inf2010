public class BinaryTree<T> {
    protected BinaryNode<T> root = null;

    public void printPostOrder() {
        if (root != null)
            printPostOrder(root);
        else
            System.out.println("Empty Tree");
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
        if (root != null)
            printPreOrder(root);
        else
            System.out.println("Empty Tree");
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
        if (root != null)
            printInOrder(root);
        else
            System.out.println("Empty Tree");
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

