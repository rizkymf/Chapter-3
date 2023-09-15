package org.binaracademy.topic3;

import java.util.List;

public class ScoreCalculator {

    public Integer minValue(List<Integer> values) {
        int min = Integer.MAX_VALUE;
        for (Integer num : values) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public Integer maxValue(List<Integer> values) {
        int max = Integer.MIN_VALUE;
        for (Integer num : values) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
