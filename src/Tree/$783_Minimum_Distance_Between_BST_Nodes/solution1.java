package Tree.$783_Minimum_Distance_Between_BST_Nodes;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    List<Integer> nodeList = new ArrayList<>();

    void inorderTraversal(TreeNode node){
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        nodeList.add(node.val);
        inorderTraversal(node.right);
    }

    public int minDiffInBST(TreeNode root) {
        inorderTraversal(root);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < nodeList.size(); i++) {
            min = Math.min(min, nodeList.get(i) - nodeList.get(i - 1));
        }
        return min;
    }
}