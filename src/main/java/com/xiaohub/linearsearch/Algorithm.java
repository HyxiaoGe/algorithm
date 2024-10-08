package com.xiaohub.linearsearch;

public class Algorithm {

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        System.out.println(Algorithm.search(data, 16));

    }

}
