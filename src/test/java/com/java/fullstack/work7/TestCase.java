package com.java.fullstack.work7;
 
 
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

 
 
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Work7Application.class)
public class TestCase {
	 
	
    @Test
    public void add() {
    	System.out.println("calc add start");
    	Assert.assertEquals("ddddddd",5,Calculation.add(1, 2));
    	System.out.println("calc add end");
    }
    
    @Test
    public void sub() {
    	System.out.println("calc sub start");
    	Assert.assertEquals("ddddddd",5,Calculation.sub(5, 1));
    	System.out.println("calc sub end");
    }
}