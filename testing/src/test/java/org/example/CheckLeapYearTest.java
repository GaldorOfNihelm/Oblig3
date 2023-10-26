package org.example;

import org.junit.Test;

import  static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assertions.assertFalse;




public class CheckLeapYearTest {
    @Test
    public void test_year_divisible_4(){
        assertTrue(CheckLeapYear.isLeapYear(2220));
        assertTrue(CheckLeapYear.isLeapYear(1940));
    }
    @Test
    public void test_year_not_divisible_4(){
        assertFalse(CheckLeapYear.isLeapYear(2001));
        assertFalse(CheckLeapYear.isLeapYear(2003));
    }
    @Test
    public void test_years_divisible_400(){
        assertTrue(CheckLeapYear.isLeapYear(3200));
        assertTrue(CheckLeapYear.isLeapYear(1600));
    }
    @Test
    public void test_years_not_divisible_4(){
        assertFalse(CheckLeapYear.isLeapYear(3201));
        assertFalse(CheckLeapYear.isLeapYear(1613));
    }




}
