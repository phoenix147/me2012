package at.ac.tuwien.big.me12.csv.me;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MECSVLineTest.class, MECSVReaderTest.class,
		MECSVWriterTest.class })
public class AllMECSVTests {

}
