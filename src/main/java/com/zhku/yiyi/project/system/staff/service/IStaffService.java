package com.zhku.yiyi.project.system.staff.service;

import com.zhku.yiyi.project.system.staff.domain.Staff;
import java.util.List;

/**
 * 人员管理 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IStaffService 
{
	/**
     * 查询人员管理信息
     * 
     * @param id 人员管理ID
     * @return 人员管理信息
     */
	public Staff selectStaffById(String id);
	
	/**
     * 查询人员管理列表
     * 
     * @param staff 人员管理信息
     * @return 人员管理集合
     */
	public List<Staff> selectStaffList(Staff staff);
	
	/**
     * 新增人员管理
     * 
     * @param staff 人员管理信息
     * @return 结果
     */
	public int insertStaff(Staff staff);
	
	/**
     * 修改人员管理
     * 
     * @param staff 人员管理信息
     * @return 结果
     */
	public int updateStaff(Staff staff);
		
	/**
     * 删除人员管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStaffByIds(String ids);
	
}
