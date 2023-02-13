import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {
    public static void weightedMean(List<Integer> X, List<Integer> W) {

        double weighted_sum = 0;
        double total_weight = 0;
        for (int i = 0; i < X.size(); i++) {
            weighted_sum += X.get(i) * W.get(i);
            total_weight += W.get(i);
        }
        double weighted_mean = weighted_sum / total_weight;

        System.out.printf("%.1f", weighted_mean);
    }
}