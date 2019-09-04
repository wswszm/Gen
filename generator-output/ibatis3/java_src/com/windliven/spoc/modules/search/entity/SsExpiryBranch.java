package com.windliven.spoc.modules.search.entity;


import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.windliven.spoc.common.persistence.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 
 * @author 
 */
@Setter
@Getter
@ApiModel(description = "ss_expiry_branch")
public class SsExpiryBranch extends DataEntity<SsExpiryBranch>{
	
	private static final long serialVersionUID = 1L;
	
			@ApiModelProperty(value = "编号")
			private java.lang.String id;
			@ApiModelProperty(value = "项目id")
			private java.lang.String ssSchoolMajorId;
			@ApiModelProperty(value = "申请截止批次（字典）")
			private java.lang.String applyExpiryBranch;
			@ApiModelProperty(value = "0申请季当年 1申请季上年")
			private java.lang.String expiryYear;
			@ApiModelProperty(value = "截止月")
			private java.lang.String expiryMonth;
			@ApiModelProperty(value = "截止日")
			private java.lang.String expiryDay;
	
	

}


