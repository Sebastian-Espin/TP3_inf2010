public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements Tree<T>{
    protected Counter counter = new Counter();
    @Override
    public void add(T data) {
        this.root = add(data, root);
        counter.treeAdd();
    }

    protected BinaryNode<T> add(T value, BinaryNode<T> curNode) {
        //TODO
        counter.treeOperation();
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

    // Code pris du libre Data Structures and Algorithm Analysis in Java de Mark Allen Weiss, page 115
    private boolean contains(T value, BinaryNode<T> curNode) {
        //TODO
        counter.treeOperation();
        if (curNode == null)
            return false;
        int compareResult = value.compareTo(curNode.value);
        if (compareResult < 0)
            return contains(value, curNode.left);
        else if (compareResult > 0)
            return contains(value, curNode.right);
        else
            return true;
    }

    @Override
    public void remove(T value) {
        this.root = remove(value, root);
        counter.treeAdd();
    }

    protected BinaryNode<T> remove(T value, BinaryNode<T> curNode) {
        //TODO
        counter.treeOperation();
        if (curNode == null)
            return null;
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
        counter.treeOperation();
        if (curNode == null)
            return null;
        else if (curNode.left == null)
            return curNode;

        return findMin(curNode.left);
    }

    public void getTreeInfo() {
        counter.getInfo();
    }
}
