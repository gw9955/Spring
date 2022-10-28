package kr.or.ddit.vo;

import java.util.Date;

public class AttachVO {
	private String tid;
	private int seq;
	private String attachName;
	private int attachSize;
	private String attachType;
	private Date registDate;

	public AttachVO() {}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getAttachName() {
		return attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	public int getAttachSize() {
		return attachSize;
	}

	public void setAttachSize(int attachSize) {
		this.attachSize = attachSize;
	}

	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	@Override
	public String toString() {
		return "AttachVO [tid=" + tid + ", seq=" + seq + ", attachName=" + attachName + ", attachSize=" + attachSize
				+ ", attachType=" + attachType + ", registDate=" + registDate + "]";
	}

}
