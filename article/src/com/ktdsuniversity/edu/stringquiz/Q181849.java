package com.ktdsuniversity.edu.stringquiz;

public class Q181849 {
    private String s;
    private int sum;
    public int sumAllDigits(String num_str) {
        this.s = num_str;
        this.sum = 0;
        // split과 for문을 활용하여 각 자리 숫자의 합 계산
        String[] arr = this.s.split("");
        for (String bit : arr) {
            this.sum += Integer.parseInt(bit);
        }
        return this.sum;
    }
}