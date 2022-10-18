public class Counter {
    //TODO
    private int count;
    private int nNodes;
    public Counter (){
        this.count = 0;
        this.nNodes = 0;
    }

    public void getInfo() {
        System.out.format("Number of operations : %d\n", count);
        System.out.format("Number of nodes : %d\n", nNodes);
    }

    public void treeOperation(){
        count++;
    }


    public void treeAdd() {
        nNodes++;
    }
    public void treeRemove(){
        nNodes--;
    }
    public void decrementCount() {
        count--;
    }

}
