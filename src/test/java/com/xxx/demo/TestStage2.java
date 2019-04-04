package com.xxx.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStage2 {

	@Test
	public void testStuentTeacherHard1() {
	    Teacher teacher = new Teacher();
	    teacher.prepare();

	    String result = (new Student()).playGameHard(teacher);
	    assertEquals("1",result);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("2",result);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("Fizz",result);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("4",result);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("Buzz",result);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("Fizz",result);

	    // contains '3'
	    teacher.setCurrentNumber(13);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("14",result);

	    // contains '3'
	    teacher.setCurrentNumber(31);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("Fizz",result);
	    
	    teacher.setCurrentNumber(34);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("FizzBuzz",result);
	    
	    // contains '5'
	    teacher.setCurrentNumber(51);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("Buzz",result);

	    // contains '5' '3'
	    teacher.setCurrentNumber(52);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("FizzBuzz",result);
	    
	    // contains '5' '3'
	    teacher.setCurrentNumber(53);
	    result = (new Student()).playGameHard(teacher);
	    assertEquals("FizzBuzz",result);
	}

	@Test
	public void testGameHard1() throws Exception {
		    Game game = new Game();
		    game.beReady(1);
		    assertEquals( 1, game.getStudents().size() );

		    game.runHard();
		    assertEquals( 2, game.getTeacher().getNextNumber() );
		    assertEquals( 1, game.getStudents().size() );
		
	}

	@Test
	public void testGameHard2() throws Exception {
		    Game game = new Game();
		    game.beReady(33);
		    assertEquals( 33, game.getStudents().size() );
		    
		    game.runHard();
		    assertEquals( 34, game.getTeacher().getNextNumber() );
		    assertEquals( 33, game.getStudents().size() );
	}

	@Test
	public void testGameHard3() throws Exception {
		    Game game = new Game();
		    game.beReady(100);
		    assertEquals( 100, game.getStudents().size() );
		    
		    game.runHard();
		    assertEquals( 101, game.getTeacher().getNextNumber() );
		    assertEquals( 100, game.getStudents().size() );
		
	}
}
