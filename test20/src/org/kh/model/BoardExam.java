package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {

		List<Board> bdList = new ArrayList<>();
		for(int i = 0; i<10;i++) {
			Board bd = new Board(i,"제목"+i,"내용"+i,"글쓴이"+i,"2024-03-0"+i,i);
			bdList.add(bd);
		}
		for(Board b : bdList) {
			System.out.println(b.toString());
		}
	}

}
