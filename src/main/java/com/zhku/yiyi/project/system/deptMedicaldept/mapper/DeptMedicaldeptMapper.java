package com.zhku.yiyi.project.system.deptMedicaldept.mapper;

import com.zhku.yiyi.project.system.deptMedicaldept.domain.DeptMedicaldept;
import java.util.List;	

/**
 * 机构科室关系(机构只能是医院) 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface DeptMedicaldeptMapper 
{
	/**
     * 查询机构科室关系(机构只能是医院)信息
     * 
     * @param id 机构科室关系(机构只能是医院)ID
     * @return 机构科室关系(机构只能是医院)信息
     */
	public DeptMedicaldept selectDeptMedicaldeptById(String id);
	
	/**
     * 查询机构科室关系(机构只能是医院)列表
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 机构科室关系(机构只能是医院)集合
     */
	public List<DeptMedicaldept> selectDeptMedicaldeptList(DeptMedicaldept deptMedicaldept);
	
	/**
     * 新增机构科室关系(机构只能是医院)
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 结果
     */
	public int insertDeptMedicaldept(DeptMedicaldept deptMedicaldept);
	
	/**
     * 修改机构科室关系(机构只能是医院)
     * 
     * @param deptMedicaldept 机构科室关系(机构只能是医院)信息
     * @return 结果
     */
	public int updateDeptMedicaldept(DeptMedicaldept deptMedicaldept);
	
	/**
     * 删除机构科室关系(机构只能是医院)
     * 
     * @param id 机构科室关系(机构只能是医院)ID
     * @return 结果
     */
	public int deleteDeptMedicaldeptById(String id);
	
	/**
     * 批量删除机构科室关系(机构只能是医院)
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteDeptMedicaldeptByIds(String[] iDs);
	
}