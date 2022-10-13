import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook grade;
	private GradeBook grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade.addScore(56);
		grade.addScore(34);
		
		grade2.addScore(29);
		grade2.addScore(87);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		grade = null;
		grade2 = null;
	}

	@Test
	void testAddScore() {
		assertFalse(grade.toString().equals("56.0 34.0 "));
		assertFalse(grade2.toString().equals("29.0 87.0 "));
		
		assertEquals(2, grade.getScoreSize(), .001); // this is how many values are in grade 
		assertEquals(2, grade2.getScoreSize(), .001); // "" in grade2
		
		
	}

	@Test
	void testSum() {
		assertEquals(90, grade.sum(), .001); // the sum of grade
		assertEquals(116, grade2.sum(), .001); // "" of grade2
		
	}

	@Test
	void testMinimum() {
		assertEquals(34, grade.minimum(), .001);		// minimum of grade
		assertEquals(29, grade2.minimum(), .001); // "" of grade2
	}

	@Test
	void testFinalScore() {
		assertEquals(87, grade2.finalScore(), .001); // The final score of scores
	}
}
