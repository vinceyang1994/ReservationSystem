package com.vince.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vince.utils.hibernate.SessionFactoryUtil;
import com.vince.dao.YuYueDao;
import com.vince.model.ReservationModel;

public class YuYueDaoImpl implements YuYueDao {
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private Session session = sf.getCurrentSession();
	ReservationModel reservationmodel = new ReservationModel();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vince.dao.YuYueDao#yuYue(com.vince.model.YuYueModel)
	 */
	@Override
	public boolean yuYue(ReservationModel yuyue) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vince.dao.YuYueDao#chaXun()
	 */
	@Override
	public List<?> chaXun() {

		session.beginTransaction();
		String hql = "from ReservationModel";
		Query query = session.createQuery(hql);
		List<ReservationModel> reservationmodellist = query.list();
		session.getTransaction().commit();

		return reservationmodellist;
	}

	@Override
	public List<?> getAll(String where, Object[] queryParams) {
		// TODO Auto-generated method stub
		String hql = new StringBuffer().append("from ReservationModel")

		.append(" ").append(where == null ? "" : where).toString();
		Query query = session.createQuery(hql);
		setQueryParams(query, queryParams);

		return query.list();
	}

	protected void setQueryParams(Query query, Object[] queryParams) {
		if (queryParams != null && queryParams.length > 0) {
			for (int i = 0; i < queryParams.length; i++) {
				query.setParameter(Integer.toString(i), queryParams[i]);
			}
		}
	}

}
