package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {

	public static void main(String[] args) {
		List<Apartment> apartList = new ArrayList<>();
		for(int i = 0; i <10;i++) {
			Apartment apart = new Apartment("마을"+i,"입주자"+i,i,102,100+i,84.4);
			apartList.add(apart);
		}
		for(Apartment a : apartList) {
			System.out.println(a.toString());
		}
	}

}
