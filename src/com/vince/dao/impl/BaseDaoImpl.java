package com.vince.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.vince.model.PageModel;
import com.vince.utils.GenericsUtils;
import com.vince.utils.hibernate.SessionFactoryUtil;
import com.vince.dao.BaseDao;

@SuppressWarnings("unchecked")
// @Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	// 反射机制得到实体类
	private Class<T> entityClass = (Class<T>) GenericsUtils.getGenricType(this
			.getClass());

	private SessionFactory sessionFactory = SessionFactoryUtil
			.getSessionFactory();
	Session session = sessionFactory.getCurrentSession();

	/*
	 * @Resource public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 * 
	 * public SessionFactory getSessionFactory() { return sessionFactory; }
	 * 
	 * private Session getCurrentSession() { return
	 * sessionFactory.getCurrentSession(); }
	 */

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		session.save(obj);
	}

	@Override
	public void saveOrUpdate(Object obj) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		session.update(obj);
	}

	@Override
	public void delete(Serializable... ids) {
		// TODO Auto-generated method stub
		for (Serializable id : ids) {
//反射得到实体类
			T t = (T) session.get(entityClass, id);
			session.delete(t);
		}
	}

	@Override
	public T get(Serializable entityId) {
		// TODO Auto-generated method stub
		return (T) session.get(entityClass, entityId);
	}

	@Override
	public T load(Serializable entityId) {
		// TODO Auto-generated method stub
		return (T) session.load(entityClass, entityId);
	}

	@Override
	public Object uniqueResult(String hql, Object[] queryParams) {
		// TODO Auto-generated method stub
		Query query = session.createQuery(hql);
		setQueryParams(query, queryParams);
		return query.uniqueResult();
	}

	@Override
	public boolean isExist(String where, Object[] queryParams) {
		// TODO Auto-generated method stub
		String hql = new StringBuffer().append("from ")
				.append(GenericsUtils.getGenricName(this.entityClass))
				.append(" ").append(where == null ? "" : where).toString();
		Query query = session.createQuery(hql);
		setQueryParams(query, queryParams);
		if (query.list().size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<T> getAll(String where, Object[] queryParams) {
		// TODO Auto-generated method stub
		String hql = new StringBuffer().append("from ")
				.append(GenericsUtils.getGenricName(this.entityClass))
				.append(" ").append(where == null ? "" : where).toString();
		Query query = session.createQuery(hql);
		setQueryParams(query, queryParams);
		return query.list();
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from "
				+ GenericsUtils.getGenricName(this.entityClass);
		return (Long) uniqueResult(hql, null);
	}

	@Override
	public PageModel<T> find(int pageNo, int maxResult) {
		// TODO Auto-generated method stub
		return find(null, null, null, pageNo, maxResult);
	}

	@Override
	public PageModel<T> find(int pageNo, int maxResult, String where,
			Object[] queryParams) {
		// TODO Auto-generated method stub
		return find(where, queryParams, null, pageNo, maxResult);
	}

	@Override
	public PageModel<T> find(int pageNo, int maxResult,
			Map<String, String> orderby) {
		// TODO Auto-generated method stub
		return find(null, null, orderby, pageNo, maxResult);
	}

	@Override
	public PageModel<T> find(String where, Object[] queryParams,
			Map<String, String> orderby, int pageNo, int maxResult) {
		// TODO Auto-generated method stub
		final PageModel<T> pageModel = new PageModel<T>();
		pageModel.setPageNo(pageNo);
		pageModel.setPageSize(maxResult);
		String hql = new StringBuffer().append("from ")
				.append(GenericsUtils.getGenricName(this.entityClass))
				.append(" ").append(where == null ? "" : where)
				.append(createOrderBy(orderby)).toString();
		Query query = session.createQuery(hql);
		setQueryParams(query, queryParams);
		List<T> list = null;

		if (maxResult < 0 && pageNo < 0) {
			list = query.list();
		} else {
			list = query.setFirstResult(getFirstResult(pageNo, maxResult))
					.setMaxResults(maxResult).list();
			hql = new StringBuffer().append("select count(*) from ")
					.append(GenericsUtils.getGenricName(this.entityClass))
					.append(" ").append(where == null ? "" : where).toString();
			query = session.createQuery(hql);
			setQueryParams(query, queryParams);
			int totalRecords = ((Number) query.uniqueResult()).intValue();
			pageModel.setTotalRecords(totalRecords);
		}
		pageModel.setList(list);
		return pageModel;
	}

	protected int getFirstResult(int pageNo, int maxResult) {
		int firstResult = (pageNo - 1) * maxResult;
		return firstResult < 0 ? 0 : firstResult;
	}

	protected void setQueryParams(Query query, Object[] queryParams) {
		if (queryParams != null && queryParams.length > 0) {
			for (int i = 0; i < queryParams.length; i++) {
				query.setParameter(Integer.toString(i), queryParams[i]);
			}
		}
	}

	protected String createOrderBy(Map<String, String> orderby) {
		StringBuffer sb = new StringBuffer("");
		if (orderby != null && orderby.size() > 0) {
			sb.append(" order by ");
			for (String key : orderby.keySet()) {
				sb.append(key).append(" ").append(orderby.get(key)).append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
