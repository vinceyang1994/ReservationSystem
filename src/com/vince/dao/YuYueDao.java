package com.vince.dao;

import java.util.List;

import com.vince.model.ReservationModel;

public interface YuYueDao extends BaseDao<ReservationModel>{
public ReservationModel chaXun();
	public boolean yuYue(ReservationModel yuyue);
	//public List<?> getAll(String where, Object[] queryParams);
}
