package sametree;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SameTreeTest {

    @Test
    public void testBasicIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(true));
        assertThat(SameTree.isSameTree(q, p), is(true));
    }

    @Test
    public void testEqualLeafChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(true));
        assertThat(SameTree.isSameTree(q, p), is(true));
    }

    @Test
    public void testNotEqualLeafChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(false));
        assertThat(SameTree.isSameTree(q, p), is(false));
    }

    @Test
    public void testNotEqualBasicIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(false));
        assertThat(SameTree.isSameTree(q, p), is(false));
    }

    @Test
    public void testEqualNullRightChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, new TreeNode(2), null);
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(true));
        assertThat(SameTree.isSameTree(q, p), is(true));
    }

    @Test
    public void testNotEqualNullRightChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(false));
        assertThat(SameTree.isSameTree(q, p), is(false));
    }

    @Test
    public void testEqualNullLeftChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, null, new TreeNode(2));
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(true));
        assertThat(SameTree.isSameTree(q, p), is(true));
    }

    @Test
    public void testNotEqualNullLeftChildIsSameTree() {
        //Given
        TreeNode p = new TreeNode(1, null, new TreeNode(2));
        TreeNode q = new TreeNode(1, null, new TreeNode(3));
        //When Then
        assertThat(SameTree.isSameTree(p, q), is(false));
        assertThat(SameTree.isSameTree(q, p), is(false));
    }
}