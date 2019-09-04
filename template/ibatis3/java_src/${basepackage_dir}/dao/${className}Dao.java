
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;


import java.util.List;
import java.util.Map;
import ${basepackage}.entity.${className};
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
public interface ${className}Dao  extends CrudDao<${className}>{
	<#if table.idColumn? exists>

	  
	  public ${className} findById(Map<String,Object> map);
	  
	 </#if>  

	  
	  public List<${className}> find${className}List(Map<String,Object> map);
	  
	  public int find${className}Count(Map<String,Object> map);
	
	
}
