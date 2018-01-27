


public class CreateHeap {

	// This class implement max heap
	// Assume 0-based indexing
	
	int size;
	int[] tree;
	
    public void createHeap() {
    	size = tree.length;
    	int toSwap = (int) Math.floor((size - 2) / 2);
    	
    	for (int element = toSwap; element >= 0; element--) {
    		setInOrder(element);
    	}
    }
    
    public void setInOrder(int input) {
    	int indexMax = input;
    	
    	int lChild = (2 * input) + 1;
    	if (lChild <= size - 1 && tree[lChild] > tree[indexMax]) {
    		indexMax = lChild;
    	}
    	int rChild = (2 * input) + 2;
    	if (rChild <= size - 1 && tree[rChild] > tree[indexMax]) {
    		indexMax = rChild;
    	}
    	
    	if (input != indexMax) {
    		int temp = tree[input];
    		tree[input] = tree[indexMax];
    		tree[indexMax] = temp;
    		setInOrder(indexMax);
    	}
    }
}
