package com.naresh.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TestUser {

	public static void main(String[] args) {

		User user = new User();
		user.setId(1);
		user.setName("naresh");
		user.setEmail("naresh@gmail.com");
		user.setPassword("pass123");

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(user, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
