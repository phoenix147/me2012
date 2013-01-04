package at.ac.tuwien.big.me12.csv.me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.junit.Test;

public class MECSVWriterTest {

	private static final String CSV_TEMP_NAME = "csv-files/temp.csv";

	@Test
	public void testWriteFile() throws IOException {
		MECSVFile csvFile = createTestMECSVFile();
		performFileWriteTest(csvFile, false);
		performFileWriteTest(csvFile, true);
	}

	private void performFileWriteTest(MECSVFile csvFile,
			boolean writeDerviedFields) throws IOException {
		MECSVWriter writer = new MECSVWriter(new FileWriter(CSV_TEMP_NAME));
		writer.writeFile(csvFile, writeDerviedFields);
		checkWrittenFile(writeDerviedFields);
		deleteTempCSVFile();
	}

	private MECSVFile createTestMECSVFile() {
		MECSVFile csvFile = new MECSVFile();
		csvFile.getLines().add(
				createMECSVLine("1234561", "Anna", "Bolika", 21, 22, 41, 42));
		csvFile.getLines().add(
				createMECSVLine("1234562", "Falk", "Ennest", 23, 24, 43, 44));
		return csvFile;
	}

	private MECSVLine createMECSVLine(String studRegNo, String firstName,
			String lastName, int lab1, int lab2, int exam1, int exam2) {
		MECSVLine csvLine1 = new MECSVLine();
		csvLine1.setStudentRegistrationNumber(studRegNo);
		csvLine1.setStudentFirstName(firstName);
		csvLine1.setStudentLastName(lastName);
		csvLine1.setLab1Points(lab1);
		csvLine1.setLab2Points(lab2);
		csvLine1.setExam1Points(exam1);
		csvLine1.setExam2Points(exam2);
		return csvLine1;
	}

	private void checkWrittenFile(boolean derivedFieldsWritten)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				CSV_TEMP_NAME));
		String lineString = null;
		int line = 1;
		while ((lineString = bufferedReader.readLine()) != null) {
			List<String> items = getItems(lineString);
			if (line == 1) {
				assertEquals("1234561", items.get(0));
				assertEquals("Anna", items.get(1));
				assertEquals("Bolika", items.get(2));
				assertEquals("21", items.get(3));
				assertEquals("22", items.get(4));
				assertEquals("41", items.get(5));
				assertEquals("42", items.get(6));
				if (derivedFieldsWritten) {
					assertEquals(16, items.size());
					assertEquals("126", items.get(7));
					assertEquals("32", items.get(8));
					assertEquals("21", items.get(9));
					assertEquals("42", items.get(10));
					assertEquals("true", items.get(11));
					assertEquals("true", items.get(12));
					assertEquals("true", items.get(13));
					assertEquals("true", items.get(14));
					assertEquals("SUCCESS", items.get(15));
				} else {
					assertEquals(7, items.size());
				}
			} else if (line == 2) {
				assertEquals("1234562", items.get(0));
				assertEquals("Falk", items.get(1));
				assertEquals("Ennest", items.get(2));
				assertEquals("23", items.get(3));
				assertEquals("24", items.get(4));
				assertEquals("43", items.get(5));
				assertEquals("44", items.get(6));
				if (derivedFieldsWritten) {
					assertEquals(16, items.size());
					assertEquals("134", items.get(7));
					assertEquals("34", items.get(8));
					assertEquals("23", items.get(9));
					assertEquals("44", items.get(10));
					assertEquals("true", items.get(11));
					assertEquals("true", items.get(12));
					assertEquals("true", items.get(13));
					assertEquals("true", items.get(14));
					assertEquals("SUCCESS", items.get(15));
				} else {
					assertEquals(7, items.size());
				}
			} else {
				fail("File contains more lines than expected.");
			}
			line++;
		}
		bufferedReader.close();
	}

	private List<String> getItems(String line) {
		List<String> list = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(line, ",");
		while (tokenizer.hasMoreTokens()) {
			list.add(tokenizer.nextToken());
		}
		return list;
	}
	
	private boolean deleteTempCSVFile() {
		return new File(CSV_TEMP_NAME).delete();
	}

}
