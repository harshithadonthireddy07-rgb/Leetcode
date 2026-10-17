class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoordinates = new int[points.length];

for (int i = 0; i < points.length; i++) {
    xCoordinates[i] = points[i][0];  
}

Arrays.sort(xCoordinates);
int widestGap = 0;

for (int i = 1; i < xCoordinates.length; i++) {
    int gap = xCoordinates[i] - xCoordinates[i - 1];

    if (gap > widestGap) {
        widestGap = gap;
    }
}

return widestGap;
        
    }
    
}