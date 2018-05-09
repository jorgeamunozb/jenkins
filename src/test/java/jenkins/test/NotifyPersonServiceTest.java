package jenkins.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jenkins.domain.Person;
import jenkins.service.EmailService;
import jenkins.service.NotifyPersonService;
import jenkins.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {

	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest() {
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
	}
	
}
