package com.ktdsuniversity.edu.stringquiz;

public class Q181843 {
    private String ms, tg;
    public int isTargetIncluded(String my_string, String target) {
        this.ms = my_string;
        this.tg = target;
        // contains를 활용하여 target 포함 여부 확인
        return this.ms.contains(this.tg) ? 1 : 0;
    }
}
