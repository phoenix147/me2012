package at.ac.tuwien.big.me12.csv.me;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MECSVLineTest {

	@Test
	public void testGetOverallSum() {
		MECSVLine line = new MECSVLine();
		line.setExam1Points(25);
		line.setExam2Points(25);
		line.setLab1Points(25);
		line.setLab2Points(25);
		assertEquals(100, line.getOverallSum());
	}

	@Test
	public void testGetOverallAverage() {
		MECSVLine line = new MECSVLine();
		line.setExam1Points(25);
		line.setExam2Points(25);
		line.setLab1Points(25);
		line.setLab2Points(25);
		assertEquals(25, line.getOverallAverage());
		
		line = new MECSVLine();
		line.setExam1Points(10);
		line.setExam2Points(20);
		line.setLab1Points(10);
		line.setLab2Points(20);
		assertEquals(15, line.getOverallAverage());
		
		line = new MECSVLine();
		line.setExam1Points(10);
		// default is 0; thus, we have 10 / 4 = 2.5 rounded 3
		assertEquals(3, line.getOverallAverage());
	}

	@Test
	public void testGetMinLabPoints() {
		MECSVLine line = new MECSVLine();
		line.setExam1Points(25);
		line.setExam2Points(25);
		line.setLab1Points(2);
		line.setLab2Points(25);
		assertEquals(2, line.getMinLabPoints());
	}

	@Test
	public void testGetMaxLabPoints() {
		MECSVLine line = new MECSVLine();
		line.setExam1Points(25);
		line.setExam2Points(25);
		line.setLab1Points(24);
		line.setLab2Points(26);
		assertEquals(26, line.getMaxLabPoints());
	}
	
	@Test
	public void testIsHasSucceededInLab1() {
		MECSVLine line = new MECSVLine();
		line.setLab1Points(25);
		assertEquals(true, line.isHasSucceededInLab1());
		
		line = new MECSVLine();
		line.setLab1Points(2);
		assertEquals(false, line.isHasSucceededInLab1());
	}
	
	@Test
	public void testIsHasSucceededInLab2() {
		MECSVLine line = new MECSVLine();
		line.setLab2Points(8);
		assertEquals(true, line.isHasSucceededInLab2());
		
		line = new MECSVLine();
		line.setLab2Points(7);
		assertEquals(false, line.isHasSucceededInLab2());
	}
	
	@Test
	public void testIsHasSucceededInLab1OrLab2() {
		MECSVLine line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(8);
		assertEquals(true, line.isHasSucceededInLab1OrLab2());
		
		line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(2);
		assertEquals(true, line.isHasSucceededInLab1OrLab2());
		
		line = new MECSVLine();
		line.setLab1Points(2);
		line.setLab2Points(8);
		assertEquals(true, line.isHasSucceededInLab1OrLab2());
		
		line = new MECSVLine();
		line.setLab1Points(2);
		line.setLab2Points(2);
		assertEquals(false, line.isHasSucceededInLab1OrLab2());
	}
	
	@Test
	public void testIsHasSucceededInLabAndLecturePart() {
		MECSVLine line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(8);
		line.setExam1Points(25);
		line.setExam2Points(25);
		assertEquals(true, line.isHasSucceededInLabAndLecturePart());
		
		line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(7);
		line.setExam1Points(25);
		line.setExam2Points(25);
		assertEquals(false, line.isHasSucceededInLabAndLecturePart());
		
		line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(7);
		line.setExam1Points(2);
		line.setExam2Points(25);
		assertEquals(false, line.isHasSucceededInLabAndLecturePart());
		
		line = new MECSVLine();
		line.setLab1Points(8);
		line.setLab2Points(8);
		line.setExam1Points(2);
		line.setExam2Points(25);
		assertEquals(false, line.isHasSucceededInLabAndLecturePart());
	}
	
	@Test
	public void testTestRuleOrder() {
		MECSVLine line = new MECSVLine();
		line.setLab1Points(25);
		assertEquals("SUCCESS", line.getTestRuleOrder());
		
		line = new MECSVLine();
		line.setLab1Points(1);
		assertEquals("UNKNOWN", line.getTestRuleOrder());
	}

}
