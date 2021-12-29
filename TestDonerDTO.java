package com.xworkz.enums.operation;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.ContactDetails;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class TestDonerDTO {
	public static void main(String[] args) {


		DonerDTO dto = new DonerDTO();
		dto.setName("Arvinda");
		dto.setAge((byte)34);
		dto.setWeight(75.5f);
		dto.setBloodGroup(BloodGroup.O_POSITIVE);
		dto.setGender(Gender.MALE);

		DonerDTO dto1 = new DonerDTO();
		dto1.setName("Manju");
		dto1.setAge((byte)29);
		dto1.setWeight(80.5f);
		dto1.setBloodGroup(BloodGroup.A_POSITIVE);
		dto1.setGender(Gender.MALE);

		DonerDTO dto2 = new DonerDTO();
		dto2.setName("Divya");
		dto2.setAge((byte)23);
		dto2.setWeight(55.7f);
		dto2.setBloodGroup(BloodGroup.AB_POSITIVE);
		dto2.setGender(Gender.FEMALE);

		DonerDTO dto3 = new DonerDTO();
		dto3.setName("Vaishnavi");
		dto3.setAge((byte)27);
		dto3.setWeight(60.0f);
		dto3.setBloodGroup(BloodGroup.A_POSITIVE);
		dto3.setGender(Gender.FEMALE);


		ContactDetails details = new ContactDetails();
		details.setContactNumber(9876543214l);
		details.setEmail("arvindakp.bbk@gmail.com");
		details.setAddress("Udapi");

		ContactDetails details1 = new ContactDetails();
		details1.setContactNumber(9765943217l);
		details1.setEmail("manju.bbk@gmail.com");
		details1.setAddress("Bangalore");

		ContactDetails details2 = new ContactDetails();
		details2.setContactNumber(92345687915l);
		details2.setEmail("Divya.bbk@gmail.com");
		details2.setAddress("Malleshwaram");

		ContactDetails details3 = new ContactDetails();
		details3.setContactNumber(9148407768l);
		details3.setEmail("Vaishnavi.bbk@gmail.com");
		details3.setAddress("Bangalore");


		dto.setDetails(details);
		dto1.setDetails(details1);
		dto2.setDetails(details2);
		dto3.setDetails(details3);


		DonarOperation operation = new DonarOperation();
		operation.save(dto);
		operation.save(dto1);
		operation.save(dto2);
		operation.save(dto3);
		operation.printAll();
		System.out.println();
		System.out.println("get by bloodgroup");
		DonerDTO res=operation.getByBloodGroup(BloodGroup.A_POSITIVE);
		System.out.println(res.toString());
		System.out.println();
		System.out.println("get by gender");
		DonerDTO get = operation.getByGender(Gender.MALE);
		System.out.println(get.toString());
		System.out.println();
		System.out.println("updated contact number by name");
		DonerDTO update = operation.updateContactByName("AMMU",962362282676l);
		System.out.println(update.toString());
		System.out.println();
		operation.printAll();
		System.out.println();
		System.out.println("get all male array");
		DonerDTO[] all = operation.getByAllGender(Gender.MALE);
		for(int index=0;index<all.length;index++) {
			System.out.println(all[index]);
			System.out.println();
			System.out.println("get similar bloodgroup by array");
			DonerDTO[] response =operation.getByAllBloodGroup(BloodGroup.A_POSITIVE);
			for (int i = 0; i < response.length; i++) {
				System.out.println(response[i]);
				System.out.println();

			}

		}

	}

}