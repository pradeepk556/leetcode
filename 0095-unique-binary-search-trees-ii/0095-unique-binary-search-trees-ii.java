/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<TreeNode> build(int left, int right) {
        List<TreeNode> ans  = new ArrayList<>();

        if(left > right) {
            ans.add(null);
            return ans;
        }

        for(int start = left; start <= right; start++) {
            List<TreeNode> leftNodes = build(left, start - 1);
            List<TreeNode> rightNodes = build(start + 1, right);

            for(TreeNode leftNode: leftNodes) {
                for(TreeNode rightNode: rightNodes) {
                    TreeNode curr = new TreeNode(start);
                    curr.left = leftNode;
                    curr.right = rightNode;

                    ans.add(curr);
                }
            }
        }

        return ans;
    }
    public List<TreeNode> generateTrees(int n) {
        return build(1, n);
    }
}