/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AutomationWeek9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibraryTest {
	// @Test
	// public void testSomeLibraryMethod() {
	// Library classUnderTest = new Library();
	// assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	// }

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all test in class");
	}

	@Before
	public void before() {
		System.out.println("Before each test method");
	}

	@After
	public void after() {
		System.out.println("After each test in test method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After all test in class");
	}

	@Test
	public void test01() {
		System.out.println("Test 1");
	}

	@Test
	public void test02() {
		System.out.println("Test 2");
	}
}
