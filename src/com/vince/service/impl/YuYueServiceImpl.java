package com.vince.service.impl;

import java.util.Date;
import java.util.List;

import com.vince.dao.YuYueDao;
import com.vince.dao.impl.YuYueDaoImpl;
import com.vince.model.ReservationModel;
import com.vince.service.YuYueService;

public class YuYueServiceImpl implements YuYueService {
	private YuYueDao yuyuedao= new YuYueDaoImpl();
	/* (non-Javadoc)
	 * @see com.vince.service.UserService#chaXun()
	 */
	
	@Override
	public ReservationModel chaXun() {
		String hql="from"
				Object[] queryParams = {datetime};
		return (ReservationModel) yuyuedao.uniqueResult(hql, queryParams);
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.vince.service.UserService#yuYue(com.vince.model.YuYueModel)
	 */
	@Override
	public boolean yuYue(ReservationModel yuyue) {
		// TODO Auto-generated method stub
		return false;
	}

	public YuYueDao getYuyuedao() {
		return yuyuedao;
	}

	public void setYuyuedao(YuYueDao yuyuedao) {
		this.yuyuedao = yuyuedao;
	}

	/* (non-Javadoc)
	 * @see com.vince.service.YuYueService#chaXun(int, java.util.Date)
	 */
	@Override
	public List<ReservationModel> chaXun(int table, Date yuyuedate) {
		// TODO Auto-generated method stub
		String where = "where table = ?0 and yuyuedate = ?1";
		return (List<ReservationModel>) yuyuedao.getAll(where,new Object[]{table,yuyuedate});
	}

}
