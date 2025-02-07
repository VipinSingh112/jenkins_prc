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

package com.nbp.quarry.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.quarry.stage.service.exception.NoSuchQueryLicenceCertificateException;
import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;
import com.nbp.quarry.stage.service.service.base.QueryLicenceCertificateLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.quarry.stage.service.model.QueryLicenceCertificate", service = AopService.class)
public class QueryLicenceCertificateLocalServiceImpl extends QueryLicenceCertificateLocalServiceBaseImpl {
	public QueryLicenceCertificate getQueryLicenceCertificateBy_CI(String caseId)
			throws NoSuchQueryLicenceCertificateException {
		return queryLicenceCertificatePersistence.findBygetQueryLicenceCertificateBy_CI(caseId);
	}

	List<QueryLicenceCertificate> getQueryLicenceCertificatBy_CI(String caseId) {
		return queryLicenceCertificatePersistence.findBygetQueryLicenceCertificatBy_CI(caseId);
	}

	public QueryLicenceCertificate updateQueryLicenceCertificate(String caseId, String licenceCertificate,
			String category, Date issueDate, Date expirationDate, String status) {
		QueryLicenceCertificate licenceCerti = null;
		licenceCerti = queryLicenceCertificatePersistence.create(CounterLocalServiceUtil.increment());
		licenceCerti.setCaseId(caseId);
		licenceCerti.setLicenceCertificate(licenceCertificate);
		licenceCerti.setCategory(category);
		licenceCerti.setIssueDate(issueDate);
		licenceCerti.setExpirationDate(expirationDate);
		licenceCerti.setStatus(status);
		queryLicenceCertificatePersistence.update(licenceCerti);
		return licenceCerti;
	}

}