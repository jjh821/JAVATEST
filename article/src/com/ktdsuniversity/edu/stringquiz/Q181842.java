package com.ktdsuniversity.edu.stringquiz;

public class Q181842 {
    private String s1, s2;
    public int checkSubString(String str1, String str2) {
        this.s1 = str1;
        this.s2 = str2;
        // contains를 사용하여 내용이 포함되어 있는지 확인
        return this.s2.contains(this.s1) ? 1 : 0;
    }
}
