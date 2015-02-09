/**
 * @package : com.vince.model
 * @date : 2015年1月14日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @describe : 预约传输信息模型
 * @param x
 *            :
 * @return :
 */
@Entity
public class ReservationModel {

	private Date rapplydatatime;
	private Date rauditordatetime;
	private Date rcanceldatetime;
	private Date rdatetime;
	private short rexecute;
	private int rid;
	private short rpass;
	private String rrefusalreason;
	private int rtable;
	private int uid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return rid;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getRapplydatatime() {
		return rapplydatatime;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getRauditordatetime() {
		return rauditordatetime;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getRcanceldatetime() {
		return rcanceldatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getRdatetime() {
		return rdatetime;
	}

	public short getRexecute() {
		return rexecute;
	}

	public int getRid() {
		return rid;
	}

	public short getRpass() {
		return rpass;
	}

	public String getRrefusalreason() {
		return rrefusalreason;
	}

	public int getRtable() {
		return rtable;
	}

	public int getUid() {
		return uid;
	}

	public void setId(int id) {
		this.rid = id;
	}

	public void setRapplydatatime(Date rapplydatatime) {
		this.rapplydatatime = rapplydatatime;
	}

	public void setRauditordatetime(Date rauditordatetime) {
		this.rauditordatetime = rauditordatetime;
	}

	public void setRcanceldatetime(Date rcanceldatetime) {
		this.rcanceldatetime = rcanceldatetime;
	}

	public void setRdatetime(Date rdatetime) {
		this.rdatetime = rdatetime;
	}

	public void setRexecute(short rexecute) {
		this.rexecute = rexecute;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public void setRpass(short rpass) {
		this.rpass = rpass;
	}

	public void setRrefusalreason(String rrefusalreason) {
		this.rrefusalreason = rrefusalreason;
	}

	public void setRtable(int rtable) {
		this.rtable = rtable;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}
