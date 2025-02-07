/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.manufacturing.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.manufacturing.application.form.service.exception.NoSuchManufacturingApplicationException;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplicationTable;
import com.nbp.manufacturing.application.form.service.service.base.ManufacturingApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.manufacturing.application.form.service.model.ManufacturingApplication",
	service = AopService.class
)
public class ManufacturingApplicationLocalServiceImpl
	extends ManufacturingApplicationLocalServiceBaseImpl {
	public List<ManufacturingApplication> getManufacturingByS_U(long userID,int status){
		return manufacturingApplicationPersistence.findBygetManuafactureByS_U(userID, status);
		} 
	public List<ManufacturingApplication> getManufacturingByStatus(int status){
		return manufacturingApplicationPersistence.findBygetManufacturingByStatus(status);
		}
	public ManufacturingApplication getManufacturingByAppNum(String applicationNumber) throws NoSuchManufacturingApplicationException {
		return manufacturingApplicationPersistence.findBygetManufacturingByAppNum(applicationNumber);
		}
	public ManufacturingApplication getManufacturingByRT_AppNo(String requestType,String appNumber) throws NoSuchManufacturingApplicationException {
		return manufacturingApplicationPersistence.findBygetManufacturingByRT_AppNo(requestType, appNumber);
	}
	public ManufacturingApplication getManufacturingByCaseId(String caseId) throws NoSuchManufacturingApplicationException {
		return manufacturingApplicationPersistence.findBygetManufacturingByCaseId(caseId);
		}
	public List<String> getManuFacturingDistinctStages(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(ManufacturingApplicationTable.INSTANCE.requestType).from(ManufacturingApplicationTable.INSTANCE);
		return dslQuery(query);
	}

}