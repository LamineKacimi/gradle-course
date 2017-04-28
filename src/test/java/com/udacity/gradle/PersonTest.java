package com.udacity.gradle;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by lamin on 4/28/2017.
 */
public class PersonTest {

    Person p;
    @Before
    public void createNewPerson(){
        p = new Person();
    }

    @org.junit.Test
    public void getFirstName() throws Exception {
        p.setFirstName("Lamine");
        assertEquals("Lamine",p.getFirstName());
    }


    @org.junit.Test
    public void getLastName() throws Exception {
        p.setLastName("Lamine");
        assertEquals("Lamine",p.getLastName());
    }


    @org.junit.Test
    public void getAge() throws Exception {
        p.setAge(35);
        assertEquals(new Integer(35),p.getAge());
    }

    @org.junit.Test
    public void main() throws Exception {
        assertTrue(true);
    }

}