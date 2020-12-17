package com.slpl.web.entity.community;

public class CommunityCategory {
	private int id;
	private String name;
	private int memberCnt;

	
	public CommunityCategory(int id, String name, int memberCnt) {
		super();
		this.id = id;
		this.name = name;
		this.memberCnt = memberCnt;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberCnt() {
		return memberCnt;
	}
	public void setMemberCnt(int memberCnt) {
		this.memberCnt = memberCnt;
	}
	
	
	
}
