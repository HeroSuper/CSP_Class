/*	���� ������ Entity Ŭ����
 * 	=======================================
 * 	������� �̸�, �й�, ��ȭ��ȣ, ��������, īī������̵�
 * 	���忩��, git ��� ���̵� �����Ѵ�. 
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
	private Long index; // ������� �ĺ� �ڵ�

	// id�� �޾ƿ� ���̺�
	// ������ : id
	@Persistent
	private String id;

	// �̸��� �޾ƿ� ���̺�
	// ������ : name
	@Persistent
	private String name;

	// �й��� �޾ƿ� ���̺� ������
	// ������ : stdNum
	@Persistent
	private String stdNum;

	// ��ȭ��ȣ�� �޾ƿ� ���̺�
	// ������ : phoneNum
	@Persistent
	private String phoneNum;

	// �����ּҸ� �޾ƿ� ���̺�
	// ������ : mailAddrass
	@Persistent
	private String mailAddrass;

	// īī���� ���̵�
	// ������ : kaId
	@Persistent
	private String kaId;

	// ���忩��
	// ������ : bossCheck
	@Persistent
	private boolean bossCheck;

	// git ��� ���̵�
	// ������ : gitId
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
