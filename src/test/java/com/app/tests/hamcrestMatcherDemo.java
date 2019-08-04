package com.app.tests;

import org.hamcrest.text.StringContainsInOrder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class  hamcrestMatcherDemo {
    //hamcrest library provides matchers (assertion method)
    // rest assured uses hamcrest assertion (matchers)
    // works with both junit and testng;

    @Test
    public void test(){
        assertThat(1, equalTo(1));
        String str1 = "Kunkka";
        String str2 = "Kunkka";


        assertThat(str1, is("Kunkka"));
        assertThat(str1, is(str2));
        assertThat(str1, is(not("Tidehuner"))); // --> This one is verifying that the strings are not equal to each other
        assertThat(str1, equalToIgnoringCase("kunkka")); // --> this is one is just like the iqnoreCase in String
        // compare iqnoring space
        assertThat(str1, equalToIgnoringWhiteSpace(" kunkka ")); // --> this one should take care of the space, even if
        // it is the beginning or end
        assertThat(10, greaterThan(9)); //--> so this is comparing 2 numbers that the second number is smaller than the first one

        //compare number
        assertThat(10, greaterThan(9));
        assertThat(10, lessThan(11));
        assertThat(10, lessThanOrEqualTo(11));

        //command+D --> duplicate line
        //control+D --> duplicate line

        //verify not null
        assertThat(str1, notNullValue());

        List<String> list = Arrays.asList("one", "too", "tree");

        assertThat(list, hasSize(3));

        assertThat(list, containsInAnyOrder("too", "tree", "one"));

        assertThat(list, hasItems("one", "too"));

        List<Integer> numbers = Arrays.asList(11, 12, 13);
        assertThat(numbers, everyItem(greaterThan(9)));


    }
}
//        //verify if the first arg is equal to the second
//        assertThat(str1 is("Kunkka"));
//        assertThat(str1 is(not ("Tidehunter")));
//
//        //verify if the arg is not equal to second
//        assertThat(str1 is(not("Tidehunter")));
//
//        //compare ignoring case
//        assertThat(str1 equalToIgnoringCase("kunkka"));
//
//        //compare ignoring space before and after
//        assertThat(str1 equalToIgnoringWhiteSpace(" Kunkka  "));