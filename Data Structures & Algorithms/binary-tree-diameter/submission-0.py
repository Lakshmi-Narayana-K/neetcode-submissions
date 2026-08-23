# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        def helper(node):
            if not node:
                return 0, 0
            
            left_height, left_dia = helper(node.left)
            right_height, right_dia = helper(node.right)

            height = 1 + max(left_height, right_height)

            diameter = max(
                left_dia, 
                right_dia, 
                left_height + right_height
            )

            return height, diameter

        _, dia = helper(root)
        return dia