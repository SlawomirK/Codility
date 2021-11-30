/*
 * Copyright (c) 2021. Sławomir Kobyliński
 */

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int k){
        if(k==0 || k==A.length || checkDif(A))
        return A;
        else return goCyclic(A,k);
    }

    private boolean checkDif(int[] a) {
       int difference= Math.toIntExact(Arrays.stream(a).distinct().count());
       return difference == 1;
    }

    private int[] goCyclic(int[] a, int k) {
        int leng=a.length;

        int[] resultArray = new int[leng];
        for(int i=0;i<leng;i++){
            if(i+k>leng-1){
                resultArray[i-k+1]=a[i];
            }else
            resultArray[i+k]=a[i];
        }
        return resultArray;
    }
}
