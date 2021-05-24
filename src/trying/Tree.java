package trying;

import java.util.ArrayList;

public class Tree {

    public  class Node {

        int data;
        Node left;
        Node right;

        public Node(int value) {

            data = value;
            left = right = null;

        }

    }

    Node root;

    public  void insert(int value) {
        root = addNode(value, root);
    }

    public  Node addNode(int newData, Node root) {
        if (root == null){
            root = new Node(newData);
            return root;
        }
        if (newData < root.data) {
            root.left = addNode(newData, root.left);
            return root;
        }
        else if (newData > root.data) {
            root.right = addNode(newData, root.right);
            return root;
        }
        return root;
    }
    public static ArrayList<Integer> finder(Tree treeFind, int dataFind) {

        Node mainRoot = treeFind.root;
        ArrayList<Integer> answer = new ArrayList<>();
        try {
            do {
                if (dataFind < treeFind.root.data) {
                    treeFind.root = treeFind.root.left;
                }
                if (dataFind > treeFind.root.data)
                {
                    treeFind.root = treeFind.root.right;
                }
            }
            while (treeFind.root.data != dataFind);
            answer.add(treeFind.root.data);
        }
        catch (NullPointerException nullPointerException) {
            treeFind.root = mainRoot;
            System.out.println("Your element wasn`t found");
        }
        treeFind.root = mainRoot;
        return answer;

    }
    void delete(int data){
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null)
            return root;
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {

        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;

    }

    private void balanceRight() {

        Node oldRoot = root;
        if (root.right != null) {
            root = root.right;
        }
        oldRoot.right = root.left;
        root.left = oldRoot;

    }
    private void balanceLeft() {

        Node oldRoot = root;
        if (root.left != null) {
            root = root.left;
        }
        oldRoot.left = root.right;
        root.right = oldRoot;

    }
    public boolean doBalance(){

        if (root == null){
            return false;

        }

        int right = height(root.right);
        int left = height(root.left);

        if (Math.abs(left - right) > 1){

            if (right - left > 1){
                this.balanceRight();
            }
            if ( left - right > 1){
                this.balanceLeft();
            }
            return doBalance();

        }
        return true;

    }

    int height(Node node) {

        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));

    }

}
