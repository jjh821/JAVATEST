package com.ktdsuniversity.edu.stringquiz;

public class Q181875 {
    public String[] convertArrayCase(String[] strArr) {
        // 인덱스 홀짝에 따라 toLowerCase와 toUpperCase 적용
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}
