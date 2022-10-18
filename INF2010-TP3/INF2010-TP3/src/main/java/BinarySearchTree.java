public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements Tree<T>{
    @Override
    public void add(T data) {
        this.root = add(data, root);
    }

    protected BinaryNode<T> add(T value, BinaryNode<T> curNode) {
        //TODO
        if (curNode == null)
            return new BinaryNode<T>(value);
        int compareResult = value.compareTo(curNode.value);
        if (compareResult < 0)
            curNode.left = add (value, curNode.left);
        else if (compareResult > 0)
            curNode.right = add (value, curNode.right);
        else
            ;

        return curNode;
    }

    @Override
    public boolean contains(T value) {
        return contains(value, root);
    }

    private boolean contains(T value, BinaryNode<T> curNode) {
        //TODO
        return false;
    }

    @Override
    public void remove(T value) {
        this.root = remove(value, root);
    }

    protected BinaryNode<T> remove(T value, BinaryNode<T> curNode) {
        //TODO
        if (curNode == null)
            return curNode;
        int compareResult = value.compareTo(curNode.value);

        if (compareResult < 0)
            curNode.left = remove(value, curNode.left);
        else if (compareResult > 0)
            curNode.right = remove(value, curNode.right);
        else if (curNode.left != null && curNode.right != null) {
            curNode.value = findMin(curNode.right).value;
            curNode.right = remove(curNode.value, curNode.right);
        }
        return curNode;
    }

    protected BinaryNode<T> findMin(BinaryNode<T> curNode){
        //TODO
        return null;
    }
}
