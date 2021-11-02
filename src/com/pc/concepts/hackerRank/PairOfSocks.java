package com.pc.concepts.hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * input = [1,2,3,2,1,3,1]
 * output = 3
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */
class PairOfSocksLogic {

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer> sockPairMap = new HashMap<>();
        int counter = 0;
        for (Integer i : ar) {
            if (! sockPairMap.containsKey(i)) {
                sockPairMap.put(i,1);
            } else {
                counter++;
            }
        }
        return counter;
    }
}

public class PairOfSocks {

    public static void main(String[] args) throws IOException {

        List<Integer> array = new ArrayList<>(4);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);
        PairOfSocksLogic.sockMerchant(4,array);
        System.out.println("");
    }
}
