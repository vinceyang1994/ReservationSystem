/**
 * @package : com.vince.action
 * @date : 2015年1月14日
 * @author : vince
 * @version : 0.9
 */
package com.vince.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.vince.model.ReservationModel;
import com.vince.service.YuYueService;
import com.vince.service.impl.YuYueServiceImpl;

/**
 * @describe : 查找所有实验台预约情况
 * @param x
 *            :
 * @return :
 */

public class ChaXunAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7202740366103980536L;
	private YuYueService yuyueservice = new YuYueServiceImpl();
	private List<ReservationModel> yuyuelist = new ArrayList<ReservationModel>();
	Date firstdate = new Date();
	public String execute() {
		
	yuyuelist = (List<ReservationModel>) yuyueservice
				.chaXun();

		System.out.println(yuyuelist.size());
	for(ReservationModel reservation : yuyuelist){
		Date rdatetime = reservation.getRdatetime();//得到所有已经预约的时间
		System.out.println(rdatetime);
		//switch(rdatetime)
	}
		return SUCCESS;
	}
	
	public List<ReservationModel> getYuyuelist() {
		return yuyuelist;
	}
	public void setYuyuelist(List<ReservationModel> yuyuelist) {
		this.yuyuelist = yuyuelist;
	}
}
