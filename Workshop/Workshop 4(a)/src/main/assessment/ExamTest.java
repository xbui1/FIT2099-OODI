/**
 * 
 */
package main.assessment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Eric Jiang
 *
 */
public class ExamTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Exam exam = new Exam();
		exam.constructor(50, 180);
		assertEquals(exam.getDescription(), "Exam Duration: 180 minutes, Weight: 50%");

	}
	
	@Test
	public void ExamTooShort() {
		try {
			Exam exam = new Exam();
			exam.constructor(60, 25);
		} catch(Exception e){
			assertEquals(e.getMessage(),"Duration of Exams cannot be less than 30 minutes");
		}
	}
	

}
