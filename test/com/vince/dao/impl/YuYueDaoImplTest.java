package  com.vince.dao.impl;
/**
 * @package : com.vince.dao.impl
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */


import static org.junit.Assert.*;

import org.junit.Test;

import com.vince.dao.YuYueDao;

/**
 * @describe : 
 * @param x : 
 * @return : 
 */
public class YuYueDaoImplTest {

	/**
	 * Test method for {@link com.vince.dao.impl.YuYueDaoImpl#yuYue(com.vince.model.YuYueModel)}.
	 */
	//@Test
	public void testYuYue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.vince.dao.impl.YuYueDaoImpl#chaXun()}.
	 * @return 
	 */
	@Test
	public void testChaXun() {
		
		YuYueDao yuYueDao = new YuYueDaoImpl();
        System.out.println(yuYueDao.chaXun().size());
	}




}
