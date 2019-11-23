/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
 

// But the following [1,2,2,null,3,null,3] is not:

//     1
//    / \
//   2   2
//    \   \
//    3    3

   
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        } else {
            
        TreeNode t1 = root.left;
        TreeNode t2 = root.right;
        
             return helper(t1, t2);
        }
        
    }
    
    
    
    public boolean helper(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null){
            return true;
        }
        
        if(t1!=null && t2== null){
            return false;
        }
        
        if(t1==null && t2!=null){
            return false;
        }
        if(t1!=null && t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
        }
        
        return helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }
}