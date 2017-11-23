package com.linhtran;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer = new Customer(12345, "linh", 'm');
    @org.junit.Test
    public void getId(){
        assertEquals(12345, customer.getId());
    }

    @org.junit.Test
    public void getName(){
        assertTrue("linh".equals(customer.getName()));
    }

    @org.junit.Test
    public void setGetGender(){
        assertEquals('m', customer.getGender());
    }

    @org.junit.Test
    public void testToString(){
        assertTrue("linh(12345)".equals(customer.toString()));
    }

}