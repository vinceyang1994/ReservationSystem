package com.vince.service;

import java.util.Date;
import java.util.List;

import com.vince.model.ReservationModel;

public interface YuYueService {

	public ReservationModel  chaXun();// 所有实验台预约查询

	public boolean yuYue(ReservationModel yuyue);// 实验预约
	
	public List<ReservationModel> chaXun(int table,Date yuyuedate);
}
