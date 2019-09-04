package com.windliven.spoc.modules.search.service;

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


import com.windliven.spoc.modules.search.entity.SsExpiryBranch;
import com.windliven.spoc.modules.search.dao.SsExpiryBranchDao;

/**
 * 更高效的AccountService实现，基于MyBatis + Memcached的方案，以JSON格式存储Memcached中的内容。
 * 
 * @author calvin
 */
@Service
@Transactional(readOnly = true)
public class SsExpiryBranchService extends CrudService<SsExpiryBranchDao, SsExpiryBranch> {
	
	private static Logger logger = LoggerFactory.getLogger(SsExpiryBranchService.class);

	@Override
	public SsExpiryBranch get(String id) {
		   SsExpiryBranch entity = super.get(id);
			return entity;
			}

	@Override
	public List<SsExpiryBranch> findList(SsExpiryBranch entity) {
			return super.findList(entity);
			}

	@Override
	public Page<SsExpiryBranch> findPage(Page<SsExpiryBranch> page, SsExpiryBranch entity) {
			return super.findPage(page, entity);
			}

	@Transactional(readOnly = false)
	@Override
	public void save(SsExpiryBranch entity) {
			super.save(entity);
			}

	@Transactional(readOnly = false)
	@Override
	public void delete(SsExpiryBranch entity) {
			super.delete(entity);
			}
	
	

	

	

	

	

	
}


