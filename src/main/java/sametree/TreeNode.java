package sametree;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int val , TreeNode left, TreeNode right) {
        this.val = val;
        this.left  = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
