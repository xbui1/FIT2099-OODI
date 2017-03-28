package main;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UniversityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addStudent() {
		University university = new University();
		university.admitStudents(27849821, "Eric", "Jiang");
		assertEquals(university.students.get(27849821).getDescription(), "27849821 - Eric Jiang");
	}
	
	@Test
	public void addUnits(){
		University university = new University();
		university.createUnit("FIT1045", "Introduction to Programming and Algorithms");
		assertEquals(university.units.get("FIT1045").getUnitName(), "Introduction to Programming and Algorithms");
	}
}
