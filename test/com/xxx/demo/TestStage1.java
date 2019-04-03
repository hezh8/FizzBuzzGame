package com.xxx.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStage1 {

	@Test
	public void testStuentTeacher1() {
	    Teacher teacher = new Teacher();
	    teacher.prepare();

	    String result = (new Student()).playGame(teacher);
	    assertEquals("1",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("2",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Fizz",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("4",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Buzz",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Fizz",result);
	}

	@Test
	public void testStuentTeacher2() {
	    Teacher teacher = new Teacher();
	    teacher.prepare();

	    String result = (new Student()).playGame(teacher);
	    assertEquals("1",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("2",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Fizz",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("4",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Buzz",result);

	    // test restarting:
	    teacher.prepare();
	    result = (new Student()).playGame(teacher);
	    assertEquals("1",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("2",result);
	    result = (new Student()).playGame(teacher);
	    assertEquals("Fizz",result);
	}

	@Test
	public void testGame1() throws Exception{
		    Game game = new Game();
		    game.beReady(1);
		    assertEquals( 1, game.getStudents().size());

		    game.run();
		    assertEquals( 2, game.getTeacher().getNextNumber() );
		    assertEquals( 1, game.getStudents().size());
	}

	@Test
	public void testGame2() throws Exception  {
		    Game game = new Game();
		    game.beReady(33);
		    assertEquals( 33, game.getStudents().size());
		    
		    game.run();
		    assertEquals( 34, game.getTeacher().getNextNumber() );
		    assertEquals( 33, game.getStudents().size());
	}

	@Test
	public void testGame3() throws Exception  {	    
		    Game game = new Game();
		    game.beReady(100);
		    assertEquals( 100, game.getStudents().size() );
		    
		    game.run();
		    assertEquals( 101, game.getTeacher().getNextNumber() );
		    assertEquals( 100, game.getStudents().size() );
		
		
	}

	@Test
	public void testGameException1() {
	    Game game = new Game();
	    try {
	        game.beReady(Integer.MIN_VALUE);
	    } catch(Exception e) {
	    	assertEquals(e.getMessage(),"The studentCount arg must be >=1: "+Integer.MIN_VALUE);
	    }
	}

	@Test
	public void testGameException2() {
	    Game game = new Game();
	    try {
	        game.beReady(Integer.MAX_VALUE);
	    } catch(Exception e) {
	    	assertEquals(e.getMessage(),"The studentCount arg must be <999: "+Integer.MAX_VALUE);
	    }
	}
}
