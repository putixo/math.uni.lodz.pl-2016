package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    
	
	@Test
	public void should1(){
		AnswerEntity an1 = new AnswerEntity();
		Integer integer = new Integer(5);
		assertFalse(an1.equals(integer));
	}
	
	@Test
	public void should2(){
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = an1;
		assertTrue(an1.equals(an2));
	}
	
	@Test
	public void should3(){
		AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText(null);
		AnswerEntity other = new AnswerEntity();
		other.setAnswerText("napis");
		assertFalse(an1.equals(other));		
	}
	
	@Test
	public void should4(){
		AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText("nap");
		AnswerEntity other = new AnswerEntity();
		other.setAnswerText("is");
		assertFalse(an1.equals(other));
	}
	
	@Test
	public void should5(){
		String s = "5";
		AnswerEntity an1 = new AnswerEntity();
		an1.setId(null);
		AnswerEntity an2 = new AnswerEntity();
		an2.setId(Long.parseLong(s));
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void should6(){
		String s = "5";
		String d = "7";
		AnswerEntity an1 = new AnswerEntity();
		an1.setId(Long.parseLong(d));
		AnswerEntity an2 = new AnswerEntity();
		an2.setId(Long.parseLong(s));
		assertFalse(an1.equals(an2));
	}
	
	
	@Test
	public void should7(){
		AnswerEntity an1 = new AnswerEntity();
		an1.setQuestion(null);
		AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(new QuestionEntity());
		assertFalse(an1.equals(an2));
	}
		
		
	@Test 
	public void should8(){
		AnswerEntity an1 = new AnswerEntity();
		an1.setQuestion(new QuestionEntity());
		AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(new QuestionEntity());
		assertFalse(an1.equals(an2));
	}	
	
	@Test
	public void should9(){
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		QuestionEntity q = new QuestionEntity();
		an1.setQuestion(q);
		an2.setQuestion(q);
		assertTrue(an1.equals(an2));
	}
	
	
	@Test
	public void should10(){
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		String s = new String("aaa");
		an1.setAnswerText(s);
		an2.setAnswerText(s);
		assertTrue(an1.equals(an2));
	}
	
	@Test
	public void should11(){
		String a = "5";
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		Long s = new Long(Long.parseLong(a));
		an1.setId(s);
		an2.setId(s);
		assertTrue(an1.equals(an2));
	}
	
	
}	

