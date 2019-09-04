package com.windliven.spoc.modules.search.dao;


import java.util.List;
import java.util.Map;
import com.windliven.spoc.modules.search.entity.SsExpiryBranch;
import com.windliven.spoc.common.persistence.CrudDao;
import com.windliven.spoc.common.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Param;

/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author calvin
 */
@MyBatisDao
public interface SsExpiryBranchDao  extends CrudDao<SsExpiryBranch>{

	  
	  public SsExpiryBranch findById(Map<String,Object> map);
	  

	  
	  public List<SsExpiryBranch> findSsExpiryBranchList(Map<String,Object> map);
	  
	  public int findSsExpiryBranchCount(Map<String,Object> map);
	
	
}
