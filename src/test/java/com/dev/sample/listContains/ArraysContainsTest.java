package com.dev.sample.listContains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysContainsTest {

    int[] int_numbers = {2,4};
    Integer[] integer_numbers = {2,4};

    @DisplayName("List.contains 테스트")
    @Test
    void listContainsTest(){
        assertAll(
                ()->assertFalse(Arrays.asList(int_numbers).contains(3), "int_numbers contains 3"),
                ()->assertTrue(Arrays.asList(int_numbers).contains(4), "int_numbers contains 4"),

                ()->assertFalse(Arrays.asList(integer_numbers).contains(3), "integer_numbers contains 3"),
                ()->assertTrue(Arrays.asList(integer_numbers).contains(4), "integer_numbers contains 4")
        );
    }

    @DisplayName("List.foreach 테스트")
    @Test
    void listForeachTest(){
        Arrays.asList(int_numbers).forEach(ints -> {
            System.out.println("int_numbers >> " + ints);
        });

        Arrays.asList(integer_numbers).forEach(integers->{
            System.out.println("integer_numbers >> " + integers);
        });
    }
}