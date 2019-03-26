package com.zhku.yiyi.project.system.medicaldept.service;

import com.zhku.yiyi.project.system.medicaldept.domain.Medicaldept;
import java.util.List;

/**
 * 科室分类 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IMedicaldeptService 
{
	/**
     * 查询科室分类信息
     * 
     * @param id 科室分类ID
     * @return 科室分类信息
     */
	public Medicaldept selectMedicaldeptById(String id);
	
	/**
     * 查询科室分类列表
     * 
     * @param medicaldept 科室分类信息
     * @return 科室分类集合
     */
	public List<Medicaldept> selectMedicaldeptList(Medicaldept medicaldept);
	
	/**
     * 新增科室分类
     * 
     * @param medicaldept 科室分类信息
     * @return 结果
     */
	public int insertMedicaldept(Medicaldept medicaldept);
	
	/**
     * 修改科室分类
     * 
     * @param medicaldept 科室分类信息
     * @return 结果
     */
	public int updateMedicaldept(Medicaldept medicaldept);
		
	/**
     * 删除科室分类信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMedicaldeptByIds(String ids);
	
}
