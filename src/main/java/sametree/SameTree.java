package sametree;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        boolean isEqualVal = p.getVal() == q.getVal();
        if (p.getLeft() == null && p.getRight() == null) {
            return isEqualVal && q.getLeft() == null && q.getRight() == null;
        }
        boolean isEqualLeftChild = p.getLeft() != null
                                    ? isSameTree(p.getLeft(), q.getLeft())
                                    : q.getLeft() == null;

        boolean isEqualRightChild = p.getRight() != null
                                    ? isSameTree(p.getRight(), q.getRight())
                                    : q.getRight() == null;
        return  isEqualVal && isEqualLeftChild && isEqualRightChild;
    }
}
