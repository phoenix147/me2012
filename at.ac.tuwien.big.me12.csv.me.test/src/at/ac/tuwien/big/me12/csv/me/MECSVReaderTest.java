package at.ac.tuwien.big.me12.csv.me;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class MECSVReaderTest {

	private static final String CSV_FILE_TEST1 = "csv-files/test1.csv";

	@Test
	public void testReadFile() throws IOException {
		MECSVReader reader = new MECSVReader(new FileReader(CSV_FILE_TEST1));
		MECSVFile meCSVFile = reader.readFile();
		checkLineCountTest1(meCSVFile);
		checkLinesOfTest1(meCSVFile);
	}

	private void checkLineCountTest1(MECSVFile meCSVFile) {
		assertEquals(4, meCSVFile.getLines().size());
	}

	private void checkLinesOfTest1(MECSVFile meCSVFile) {
		checkLineValues(meCSVFile.getLines().get(0), "1234561", "Klaus",
				"Thaler", 19, 20, 48, 50);
		checkLineValues(meCSVFile.getLines().get(1), "1234562", "Klara",
				"Fall", 25, 24, 20, 48);
		checkLineValues(meCSVFile.getLines().get(2), "1234563", "Peter",
				"Silie", 7, 15, 26, 30);
		checkLineValues(meCSVFile.getLines().get(3), "1234564", "Anna", "Log",
				25, 25, 50, 50);
	}

	private void checkLineValues(MECSVLine line, String studRegNo,
			String studFirstName, String studLastName, int lab1, int lab2,
			int exam1, int exam2) {
		assertEquals(studRegNo, line.getStudentRegistrationNumber());
		assertEquals(studFirstName, line.getStudentFirstName());
		assertEquals(studLastName, line.getStudentLastName());
		assertEquals(lab1, line.getLab1Points());
		assertEquals(lab2, line.getLab2Points());
		assertEquals(exam1, line.getExam1Points());
		assertEquals(exam2, line.getExam2Points());
	}

}
