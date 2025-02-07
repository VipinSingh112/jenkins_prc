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

package com.nbp.osi.insolvency.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyApplicationException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;
import com.nbp.osi.insolvency.application.form.services.service.base.OsiInsolvencyApplicationLocalServiceBaseImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPersistence;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication", service = AopService.class)
public class OsiInsolvencyApplicationLocalServiceImpl extends OsiInsolvencyApplicationLocalServiceBaseImpl {

	public List<OsiInsolvencyApplication> getOsiInsolvencyApplicationByS_U(int status, long userId) {
		return osiInsolvencyApplicationPersistence.findBygetOsiByS_U(userId, status);

	}

	public List<OsiInsolvencyApplication> getOsiInsolvencyApplicationByStatus(int status) {
		return osiInsolvencyApplicationPersistence.findBygetOsiInsolvencyByStatus(status);
	}
	
	public OsiInsolvencyApplication getOsiInsolvencyByAppNum(String applicationNumber) throws NoSuchOsiInsolvencyApplicationException {
		return osiInsolvencyApplicationPersistence.findBygetOsiByAppNum(applicationNumber);
	}
	
	public List<OsiInsolvencyApplication> getOsiInsolvencyApplicationByS_UId(long userId,int status){
		return osiInsolvencyApplicationPersistence.findBygetOsiInsolvencyByStatus_UserId(userId, status);
	}
	
	public OsiInsolvencyApplication getOsiInsolvencyByCaseId(String caseId) throws NoSuchOsiInsolvencyApplicationException {
		return osiInsolvencyApplicationPersistence.findBygetOsiByCaseId(caseId);
	}
	
	public List<OsiInsolvencyApplication> getOsiInsolvencyByApplicationStatus_Status(String applicantStatus,int status){
		return osiInsolvencyApplicationPersistence.findBygetOsiInsolvencyByApplicationStatus_Status(applicantStatus, status);
	}

}