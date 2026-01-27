package com.ktdsuniversity.edu.stringquiz;

public class Q181847 {
    private String s;
    public String removeLeadingZeros(String n_str) {
        // Integer.parseInt로 앞의 0을 제거하고 다시 문자로 변환
        this.s = String.valueOf(Integer.parseInt(n_str));
        return this.s;
    }
}