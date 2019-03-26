package com.zhku.yiyi.project.system.staff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.staff.mapper.StaffMapper;
import com.zhku.yiyi.project.system.staff.domain.Staff;
import com.zhku.yiyi.project.system.staff.service.IStaffService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 人员管理 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
	@Autowired
	private StaffMapper staffMapper;

	/**
     * 查询人员管理信息
     * 
     * @param id 人员管理ID
     * @return 人员管理信息
     */
    @Override
	public Staff selectStaffById(String id)
	{
	    return staffMapper.selectStaffById(id);
	}
	
	/**
     * 查询人员管理列表
     * 
     * @param staff 人员管理信息
     * @return 人员管理集合
     */
	@Override
	public List<Staff> selectStaffList(Staff staff)
	{
	    return staffMapper.selectStaffList(staff);
	}
	
    /**
     * 新增人员管理
     * 
     * @param staff 人员管理信息
     * @return 结果
     */
	@Override
	public int insertStaff(Staff staff)
	{
	    return staffMapper.insertStaff(staff);
	}
	
	/**
     * 修改人员管理
     * 
     * @param staff 人员管理信息
     * @return 结果
     */
	@Override
	public int updateStaff(Staff staff)
	{
	    return staffMapper.updateStaff(staff);
	}

	/**
     * 删除人员管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStaffByIds(String ids)
	{
		return staffMapper.deleteStaffByIds(Convert.toStrArray(ids));
	}
	
}
