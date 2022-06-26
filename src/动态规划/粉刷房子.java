package 动态规划;

public class 粉刷房子 {

    private int getMin(int[][] costs, int index, int row) {
        switch (index) {
            case 0:
                return Math.min(costs[row -1][1], costs[row -1][2]);
            case 1:
                return Math.min(costs[row -1][0], costs[row -1][2]);
            case 2:
                return Math.min(costs[row -1][0], costs[row -1][1]);
            default:
                return -1;
        }
    }

    public int minCost(int[][] costs) {
        for (int i = 0; i < costs.length; i++) {
            if (i == 0) {
                continue;
            }

            for (int j = 0; j < costs[0].length; j++) {
                costs[i][j] += getMin(costs, j, i);
            }
        }
        return Math.min(costs[costs.length - 1][0], Math.min(costs[costs.length - 1][1], costs[costs.length - 1][2]));
    }
}
