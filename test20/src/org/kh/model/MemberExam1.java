package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam1 {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	boolean sw = true;
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	public void mainCall() {//1.회원가입 2.회원 목록 3.회원삭제 4.프로그램 종료
		while(sw) {
			System.out.println("1.회원가입");
			System.out.println("2.회원목록");
			System.out.println("3.회원삭제");
			System.out.println("4.프로그램 종료");
			System.out.print("작업 번호 : ");
			int job = sc.nextInt();
			switch(job) {
				case 1 :
					add();
					break;
				case 2 :
					info();
					break;
				case 3 :
					remove();
					break;
				default:
				case 4 :
					System.out.println("프로그램 종료");
					sw = false;
					break;	
			}
		}
	}
	public void add() {
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
	
	public void info() {
		for(Member m: memList) {
			System.out.println(m.toString());
		}
	}
	
	public void remove() {
		System.out.println("삭제하고 싶은 회원 이름입력");
		String name = sc.next();
		Member mb;
		for(int i = 0; i < memList.size();i++) {
			mb = memList.get(i);
			if(mb.getName().equals(name)) {
				System.out.println(memList.get(i).getName()+"삭제 되었습니다.");
				memList.remove(i);
			}
			
		}
	}
	
}
