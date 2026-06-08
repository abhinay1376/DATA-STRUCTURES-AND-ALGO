class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
               List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            int i = left;
            while (i <= right) {
                result.add(matrix[top][i]);
                i++;
            }
            top++;
            
            i = top;
            while (i <= bottom) {
                result.add(matrix[i][right]);
                i++;
            }
            right--;
            
            if (top <= bottom) {
                i = right;
                while (i >= left) {
                    result.add(matrix[bottom][i]);
                    i--;
                }
                bottom--;
            }
            
            if (left <= right) {
                i = bottom;
                while (i >= top) {
                    result.add(matrix[i][left]);
                    i--;
                }
                left++;
            }
        }
        
        return result;
    }
}