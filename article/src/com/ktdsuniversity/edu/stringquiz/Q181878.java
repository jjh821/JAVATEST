package com.ktdsuniversity.edu.stringquiz;

public class Q181878 {
    private String s, p;
    public int findTargetString(String myString, String pat) {
        // toLowerCase와 contains를 조합하여 대소문자 구분 없이 찾기
        this.s = myString.toLowerCase();
        this.p = pat.toLowerCase();
        return this.s.contains(this.p) ? 1 : 0;
    }
}
