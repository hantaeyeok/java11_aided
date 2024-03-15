package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
//메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 작업이 이루어 질 수 있도록 하시시오.
	public void mainCall() {//1.회원가입 2.회원 목록 3.회원삭제 4.프로그램 종료
		boolean sw = true;
		while(sw) {
			System.out.println("1.회원가입");
			System.out.println("2.회원목록");
			System.out.println("3.회원삭제");
			System.out.println("4.프로그램 종료");
			switch(sc.nextInt()) {
				case 1 :
					join();
					
				case 2 :
					
				case 3 :
					
				case 4 :
					sw = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("숫자만 입력해주세요");
			}
		}
	}
	public void join() {
		System.out.print("회원 아이디 : ");
		String memID = sc.next();
		System.out.print("비밀 번호 : ");
		String memPW = sc.next();
		System.out.print("회원 이름 : ");
		String memName = sc.next();
		System.out.print("전화번호 : ");
		String memTel = sc.next();
		System.out.print("생년월일 : ");
		int memYear = sc.nextInt();
		int mcode = 0;
		memList.add(new Member(mcode,memID,memPW,memName,memYear,memTel));
		mcode++;
		System.out.println("회원 정보를 입력 받았습니다.");
	}



}