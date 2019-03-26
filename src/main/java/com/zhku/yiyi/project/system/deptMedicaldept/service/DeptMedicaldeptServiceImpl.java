package com.zhku.yiyi.project.system.deptMedicaldept.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.deptMedicaldept.mapper.DeptMedicaldeptMapper;
import com.zhku.yiyi.project.system.deptMedicaldept.domain.DeptMedicaldept;
import com.zhku.yiyi.project.system.deptMedicaldept.service.IDeptMedicaldeptService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 机构科室关系(机构只能是医院) 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class DeptMedicaldeptServiceImpl implements IDeptMedicaldeptService 
{
	@Autowired
	private DeptMedicaldeptMapper deptMedicaldeptMapper;

	/**
     * 查询机构科室关系(机构只能是医院)信息
     * 
     * @param id 机构科室关系(机构只能是医院)ID
     * @return 机构科室关系(机构只能是医院)信息
     */
    @Override
	public DeptMedicaldept selectDeptMedicaldeptById(String id)
	{
	    return deptMedicaldeptMapper.selectDeptMedicaldeptById(id);
	}
	
	/**
     * 查询机构科室关系(机构只能是医院)列表
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 机构科室关系(机构只能是医院)集合
     */
	@Override
	public List<DeptMedicaldept> selectDeptMedicaldeptList(DeptMedicaldept deptMedicaldept)
	{
	    return deptMedicaldeptMapper.selectDeptMedicaldeptList(deptMedicaldept);
	}
	
    /**
     * 新增机构科室关系(机构只能是医院)
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 结果
     */
	@Override
	public int insertDeptMedicaldept(DeptMedicaldept deptMedicaldept)
	{
	    return deptMedicaldeptMapper.insertDeptMedicaldept(deptMedicaldept);
	}
	
	/**
     * 修改机构科室关系(机构只能是医院)
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 结果
     */
	@Override
	public int updateDeptMedicaldept(DeptMedicaldept deptMedicaldept)
	{
	    return deptMedicaldeptMapper.updateDeptMedicaldept(deptMedicaldept);
	}

	/**
     * 删除机构科室关系(机构只能是医院)对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDeptMedicaldeptByIds(String ids)
	{
		return deptMedicaldeptMapper.deleteDeptMedicaldeptByIds(Convert.toStrArray(ids));
	}
	
}
