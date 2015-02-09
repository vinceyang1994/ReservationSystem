/**
 * @package : com.vince.dao.impl
 * @date : 2015年1月28日
 * @author : vince
 * @version : 0.9
 */
package com.vince.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.vince.dao.BaseDao;
import com.vince.model.ReservationModel;
import com.vince.utils.hibernate.SessionFactoryUtil;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
public class BaseDaoImplTest {
	private SessionFactory sf;
	private Session session;
	private BaseDao<ReservationModel> yuyuedao;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sf = SessionFactoryUtil.getSessionFactory();
		session = sf.getCurrentSession();
		yuyuedao = new BaseDaoImpl<ReservationModel>();

	}

	@Test
	public void testGetSessionFactory() {
		System.out.println(sf);
	}

	@Test
	public void testSave() {
		ReservationModel yuyue = new ReservationModel();
		yuyue.setId(3);
		yuyue.setRapplydatatime(new Date());
		yuyue.setRauditordatetime(new Date(2015,02,01,01,0,0));
		yuyue.setRdatetime(new Date());
		yuyue.setRtable(2);
		yuyue.setRid(3);
		yuyue.setUid(1564645574);
		session.beginTransaction();
		yuyuedao.save(yuyue);
	}

	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#update(java.lang.Object)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#delete(java.io.Serializable[])}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#get(java.io.Serializable)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#load(java.io.Serializable)}.
	 */
	@Test
	public void testLoad() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#uniqueResult(java.lang.String, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testUniqueResult() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#isExist(java.lang.String, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testIsExist() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#getAll(java.lang.String, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testGetAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.vince.dao.impl.BaseDaoImpl#getCount()}.
	 */
	@Test
	public void testGetCount() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.vince.dao.impl.BaseDaoImpl#find(int, int)}.
	 */
	@Test
	public void testFindIntInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#find(int, int, java.lang.String, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testFindIntIntStringObjectArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#find(int, int, java.util.Map)}.
	 */
	@Test
	public void testFindIntIntMapOfStringString() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#find(java.lang.String, java.lang.Object[], java.util.Map, int, int)}
	 * .
	 */
	@Test
	public void testFindStringObjectArrayMapOfStringStringIntInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#getFirstResult(int, int)}.
	 */
	@Test
	public void testGetFirstResult() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#setQueryParams(org.hibernate.Query, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testSetQueryParams() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.vince.dao.impl.BaseDaoImpl#createOrderBy(java.util.Map)}.
	 */
	@Test
	public void testCreateOrderBy() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#Object()}.
	 */
	@Test
	public void testObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#getClass()}.
	 */
	@Test
	public void testGetClass() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	@Test
	public void testClone() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#notify()}.
	 */
	@Test
	public void testNotify() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#notifyAll()}.
	 */
	@Test
	public void testNotifyAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long)}.
	 */
	@Test
	public void testWaitLong() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long, int)}.
	 */
	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#wait()}.
	 */
	@Test
	public void testWait() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Test
	public void testFinalize() {
		fail("Not yet implemented"); // TODO
	}

}
