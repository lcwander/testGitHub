package com.makotojava.intro;

import org.junit.*;

import static org.junit.Assert.*;

import java.util.logging.Logger;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");

		Logger I = Logger.getLogger(Person.class.getName());
		I.info("Name: " + p.getName());
		I.info("Age: " + p.getAge());
		I.info("Height (cm): " + p.getHeight());
		I.info("Weigth (kg): " + p.getWeight());
		I.info("Eye Color: " + p.getEyeColor());
		I.info("Gender: " + p.getGender());

		assertEquals("Joe Q Author", p.getName());
		assertEquals("Joe Q Author", p.getName());
		assertEquals("Joe Q Author", p.getName());
		assertEquals("Joe Q Author", p.getName());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());

	}

}
