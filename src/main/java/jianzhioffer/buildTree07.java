package main.java.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

public class buildTree07 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int inorderLength = inorder.length;
        for (int i = 0; i < inorderLength; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = build(preorder, 0, inorderLength - 1, inorder, 0, inorderLength - 1, map);
        return root;
    }

    private TreeNode build(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, Map<Integer, Integer> map) {
        if (prestart > preend) {
            return null;
        }

        int rootval = preorder[prestart];
        int rootlocation = map.get(rootval);
        TreeNode root = new TreeNode(rootval);
        if (prestart == preend) {
            return root;
        }
        int rootlefts = rootlocation - instart;
        int rootrights = inend - rootlocation;
        TreeNode leftroot = build(preorder, prestart + 1, prestart + rootlefts, inorder, instart, instart + rootlefts, map);
        TreeNode rightroot = build(preorder, prestart + rootlefts + 1, preend, inorder, rootlocation + 1, inend, map);
        root.left = leftroot;
        root.right = rightroot;
        return root;
    }
}
