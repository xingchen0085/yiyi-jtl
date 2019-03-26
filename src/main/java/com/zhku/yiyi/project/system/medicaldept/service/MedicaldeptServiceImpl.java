package com.zhku.yiyi.project.system.medicaldept.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.medicaldept.mapper.MedicaldeptMapper;
import com.zhku.yiyi.project.system.medicaldept.domain.Medicaldept;
import com.zhku.yiyi.project.system.medicaldept.service.IMedicaldeptService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 科室分类 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class MedicaldeptServiceImpl implements IMedicaldeptService 
{
	@Autowired
	private MedicaldeptMapper medicaldeptMapper;

	/**
     * 查询科室分类信息
     * 
     * @param id 科室分类ID
     * @return 科室分类信息
     */
    @Override
	public Medicaldept selectMedicaldeptById(String id)
	{
	    return medicaldeptMapper.selectMedicaldeptById(id);
	}
	
	/**
     * 查询科室分类列表
     * 
     * @param medicaldept 科室分类信息
     * @return 科室分类集合
     */
	@Override
	public List<Medicaldept> selectMedicaldeptList(Medicaldept medicaldept)
	{
	    return medicaldeptMapper.selectMedicaldeptList(medicaldept);
	}
	
    /**
     * 新增科室分类
     * 
     * @param medicaldept 科室分类信息
     * @return 结果
     */
	@Override
	public int insertMedicaldept(Medicaldept medicaldept)
	{
	    return medicaldeptMapper.insertMedicaldept(medicaldept);
	}
	
	/**
     * 修改科室分类
     * 
     * @param medicaldept 科室分类信息
     * @return 结果
     */
	@Override
	public int updateMedicaldept(Medicaldept medicaldept)
	{
	    return medicaldeptMapper.updateMedicaldept(medicaldept);
	}

	/**
     * 删除科室分类对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMedicaldeptByIds(String ids)
	{
		return medicaldeptMapper.deleteMedicaldeptByIds(Convert.toStrArray(ids));
	}
	
}
