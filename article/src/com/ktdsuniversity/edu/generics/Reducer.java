package com.ktdsuniversity.edu.generics;
//이걸로 줄테니 인풋      아웃풋 으로 반환
public interface Reducer<INPUT, OUTPUT>{
	
	OUTPUT reduce(INPUT input, OUTPUT output);
	
}
