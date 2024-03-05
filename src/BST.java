class NodeBST {
    public NodeBST(int item) {
        key = item;
        left = right = null;
    }
    int key;
    NodeBST left, right;
}
public class BST{
    BST(){
        root = null;
    }

    void insert(int key){
        root = insertRec(root, key);
    }
    NodeBST insertRec(NodeBST root, int key){
        if (root == null){
            root = new NodeBST(key);
            return root;
        }
        if (key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void remove(int key) {
        root = removeRec(root, key);
    }
    NodeBST removeRec(NodeBST root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = removeRec(root.left, key);
        else if (key > root.key)
            root.right = removeRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = removeRec(root.right, root.key);
        }
        return root;
    }
    int minValue(NodeBST root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    boolean search (int key){
        return searchRec(root, key);
    }
    boolean searchRec(NodeBST root, int key) {
        if (root == null)
            return false;
        if (root.key == key)
            return true;
        if (root.key < key)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }

    NodeBST root;

    public static void main(String[] args) {
        BST sample = new BST();

        sample.insert(3);
        sample.insert(1);
        sample.insert(4);
        sample.insert(6);
        sample.insert(9);
        sample.insert(2);
        sample.insert(5);
        sample.insert(7);

        System.out.println(sample.search(9));
        System.out.println(sample.search(5));
        System.out.println(sample.search(8));

        sample.remove(3);
        System.out.println(sample.search(3));
    }
}