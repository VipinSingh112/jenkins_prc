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

package com.nbp.ncbj.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjApplicationException;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjApplicationTable;
import com.nbp.ncbj.application.form.service.service.base.NcbjApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.ncbj.application.form.service.model.NcbjApplication", service = AopService.class)
public class NcbjApplicationLocalServiceImpl extends NcbjApplicationLocalServiceBaseImpl {
	public List<NcbjApplication> getNCBJAppBy_S_U(long userId, int status) {
		return ncbjApplicationPersistence.findBygetNCBJByS_U(userId, status);
	}
	public List<NcbjApplication> getNCBJAppBy_Status(int status) {
		return ncbjApplicationPersistence.findBygetNCBJByStatus(status);
	}
	public List<NcbjApplication> getNCBJAppBy_AppNum(String applicationNumber) {
		return ncbjApplicationPersistence.findBygetNCBJByAppNum(applicationNumber);
	}
	public NcbjApplication getNcbj_By_App_Num(String applicationNumber) throws NoSuchNcbjApplicationException {
		return ncbjApplicationPersistence.findBygetNcbj_By_App_Num(applicationNumber);
		
	}
	public NcbjApplication getNCBJByCaseId(String caseId) throws NoSuchNcbjApplicationException {
		return ncbjApplicationPersistence.findBygetNCBJByCaseId(caseId);
		
	}
	public NcbjApplication getNcbjByRT_AppNo(String typeOfServices,String expiredLicenseAppNumber ) throws NoSuchNcbjApplicationException {
		return ncbjApplicationPersistence.findBygetNcbjByRT_AppNo(typeOfServices,expiredLicenseAppNumber);
		
	}
	public List<String> getNCBJDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(NcbjApplicationTable.INSTANCE.typeOfCertification)
				.from(NcbjApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}