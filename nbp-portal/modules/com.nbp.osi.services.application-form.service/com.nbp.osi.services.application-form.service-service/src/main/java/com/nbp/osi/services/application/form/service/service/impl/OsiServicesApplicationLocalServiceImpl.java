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

package com.nbp.osi.services.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicationException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicationTable;
import com.nbp.osi.services.application.form.service.service.base.OsiServicesApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.services.application.form.service.model.OsiServicesApplication",
	service = AopService.class
)
public class OsiServicesApplicationLocalServiceImpl
	extends OsiServicesApplicationLocalServiceBaseImpl {
	public List<OsiServicesApplication> getOsiServicesApplicationByEntityId_Status(int status,long  userId) {
		return osiServicesApplicationPersistence.findBygetOSIServicesByS_U(status,userId);
	}
		public List<OsiServicesApplication> getOsiServicesApplicationStatus(int status,long  userId) {
			return osiServicesApplicationPersistence.findBygetOSIServicesByS_U(status,userId);
	}
		public OsiServicesApplication getOsiServiceApplicationBy_CI(String caseId) throws NoSuchOsiServicesApplicationException {
			return osiServicesApplicationPersistence.findBygetOSIServicesByCaseId(caseId);
		}
	public List<OsiServicesApplication> getOSIServicesByStatus(int status){
		return osiServicesApplicationPersistence.findBygetOSIServicesByStatus(status);
	}
	public OsiServicesApplication getOSIServicesByAppNo(String applicationNumber) throws NoSuchOsiServicesApplicationException {
		return osiServicesApplicationPersistence.findBygetOSIServicesByAppNo(applicationNumber);
	}
	public OsiServicesApplication getOsiServicesByAT_AppNo(String typeOfTransaction,String expiredLicenseAppNumber) throws NoSuchOsiServicesApplicationException { 
		return osiServicesApplicationPersistence.findBygetOsiServicesByAT_AppNo(typeOfTransaction, expiredLicenseAppNumber);
		  }
	public List<String> getOSISERVICEDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(OsiServicesApplicationTable.INSTANCE.typeOfApplicant)
				.from(OsiServicesApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	@Override
	public List<String> getJadscDistinctCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}