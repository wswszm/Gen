
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;

import com.windliven.spoc.common.persistence.Page;
import com.windliven.spoc.common.service.CrudService;
import com.windliven.spoc.common.utils.StringUtils;


import ${basepackage}.entity.${className};
import ${basepackage}.dao.${className}Dao;

/**
 * 更高效的AccountService实现，基于MyBatis + Memcached的方案，以JSON格式存储Memcached中的内容。
 * 
 * @author calvin
 */
@Service
@Transactional(readOnly = true)
public class ${className}Service extends CrudService<${className}Dao, ${className}> {
	
	private static Logger logger = LoggerFactory.getLogger(${className}Service.class);

	@Override
	public ${className} get(String id) {
		   ${className} entity = super.get(id);
			return entity;
			}

	@Override
	public List<${className}> findList(${className} entity) {
			return super.findList(entity);
			}

	@Override
	public Page<${className}> findPage(Page<${className}> page, ${className} entity) {
			return super.findPage(page, entity);
			}

	@Transactional(readOnly = false)
	@Override
	public void save(${className} entity) {
			super.save(entity);
			}

	@Transactional(readOnly = false)
	@Override
	public void delete(${className} entity) {
			super.delete(entity);
			}
	
	

	

	

	

	

	
}


