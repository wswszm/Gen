
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;


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
@ApiModel(description = "${table.remarks}${table.sqlName}")
public class ${className} extends DataEntity<${className}>{
	
	private static final long serialVersionUID = 1L;
	
	<#list table.columns as column>
       <#if column.columnNameLower!='createBy'&&column.columnNameLower!='createDate'&&column.columnNameLower!='updateBy'&&column.columnNameLower!='updateDate'&&column.columnNameLower!='remarks'&&column.columnNameLower!='delFlag'>
			@ApiModelProperty(value = "${column.remarks}")
			private ${column.javaType} ${column.columnNameLower};
	  </#if>
	</#list>
	
	

}


