/*
 * package cpa20;
 * 
 * import java.util.*; public class MaxGrid { public static void main(String[]
 * args) { Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int
 * list[][] = new int[n][n]; for (int i = 0; i < n ; i++) for (int j = 0; j < n;
 * j++) list[i][j] = sc.nextInt(); int maxSum = 0;
 * System.out.println((int)largestSubgrid(list, maxSum)); }
 * 
 * static int largestSubgrid(int [][] mat , int maxSum) { // `M × N` matrix int
 * M = mat.length; int N = mat[0].length;
 * 
 * // preprocess the matrix int[][] sum = preprocess(mat, M, N);
 * 
 * int total, max = Integer.MIN_VALUE;
 * 
 * // `p` stores bottom-right corner coordinates of the submatrix Point p =
 * null;
 * 
 * // find the maximum sum submatrix
 * 
 * // start from cell (k-1, k-1) and consider each submatrix of size `k × k` for
 * (int i = k - 1; i < M; i++) { for (int j = k - 1; j < N; j++) { // Note that
 * (i, j) is the bottom-right corner coordinates of the // square submatrix of
 * size `k`
 * 
 * total = sum[i][j]; if (i - k >= 0) { total = total - sum[i - k][j]; }
 * 
 * if (j - k >= 0) { total = total - sum[i][j - k]; }
 * 
 * if (i - k >= 0 && j - k >= 0) { total = total + sum[i - k][j - k]; }
 * 
 * if (total > max) { max = total; p = new Point(i, j); } } } // get maximum sum
 * submatrix for (int i = 0; i < k; i++) { List<Integer> row = new
 * ArrayList<>(); for (int j = 0; j < k; j++) { int r = i + p.first - k + 1; int
 * c = j + p.second - k + 1; row.add(mat[r][c]); } System.out.println(row); } }
 * } }
 */