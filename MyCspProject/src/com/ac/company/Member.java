/*	저장 가능한 Entity 클래스
 * 	=======================================
 * 	사용자의 이름, 학번, 전화번호, 메일주조, 카카오톡아이디
 * 	팀장여부, git 허브 아이디를 저장한다. 
 * 	=======================================
 */
package com.ac.company;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long index; // 사용자의 식별 코드

	// id를 받아올 테이블
	// 변수명 : id
	@Persistent
	private String id;

	// 이름을 받아올 테이블
	// 변수명 : name
	@Persistent
	private String name;

	// 학번을 받아올 테이블 변수명
	// 변수명 : stdNum
	@Persistent
	private String stdNum;

	// 전화번호를 받아올 테이블
	// 변수명 : phoneNum
	@Persistent
	private String phoneNum;

	// 메일주소를 받아올 테이블
	// 변수명 : mailAddrass
	@Persistent
	private String mailAddrass;

	// 카카오톡 아이디
	// 변수명 : kaId
	@Persistent
	private String kaId;

	// 팀장여부
	// 변수명 : bossCheck
	@Persistent
	private boolean bossCheck;

	// git 허브 아이디
	// 변수명 : gitId
	@Persistent
	private String gitId;

	public Member(String id, String name, String stdNum, String phoneNum,
			String mailAddrass, String kaId, boolean bossCheck, String gitId) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.stdNum = stdNum;
		this.phoneNum = phoneNum;
		this.mailAddrass = mailAddrass;
		this.kaId = kaId;
		this.bossCheck = bossCheck;
		this.gitId = gitId;
	}

	public Long getIndex() {
		return index;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStdNum() {
		return stdNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getMailAddrass() {
		return mailAddrass;
	}

	public String getKaId() {
		return kaId;
	}

	public boolean getBossCheck() {
		return bossCheck;
	}

	public String getGitId() {
		return gitId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setMailAddrass(String mailAddrass) {
		this.mailAddrass = mailAddrass;
	}

	public void setKaId(String kaId) {
		this.kaId = kaId;
	}

	public void setBossCheck(boolean bossCheck) {
		this.bossCheck = bossCheck;
	}

	public void setGitId(String gitId) {
		this.gitId = gitId;
	}

}
