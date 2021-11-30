/*
 * Copyright (c) 2021. Sławomir Kobyliński
 */

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertArrayEquals;

public class CyclicRotation_Test {

    CyclicRotation cyclicRotation;
    @BeforeEach
    void beforeEach(){
        cyclicRotation=new CyclicRotation();
    }
    @Test
    void shouldReturnTrue1(){
        //given
        int[] A=new int[]{3, 8, 9, 7, 6};
        int k=3;
        //when
        int[] result=cyclicRotation.solution(A,k);
        //then
        assertArrayEquals(result,new int[]{9, 7, 6, 3, 8});
    }

    @Test
    void shouldReturnTrue2(){
        //given
        int[] A=new int[]{0,0,0};
        int k=1;
        //when
        int[] result=cyclicRotation.solution(A,k);
        //then
        assertArrayEquals(result,new int[]{0,0,0});
    }

    @Test
    void shouldReturnTrueOK(){
        //given
        int[] A=new int[]{1,2,3,4};
        int k=4;
        //when
        int[] result=cyclicRotation.solution(A,k);
        //then
        assertArrayEquals(result,A);
    }



}
