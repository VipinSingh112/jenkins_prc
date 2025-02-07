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

package com.nbp.jtb.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.jtb.application.stage.services.exception.NoSuchJTBLicenceCertificateException;
import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;
import com.nbp.jtb.application.stage.services.service.base.JTBLicenceCertificateLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate",
	service = AopService.class
)
public class JTBLicenceCertificateLocalServiceImpl
	extends JTBLicenceCertificateLocalServiceBaseImpl {
	
	public JTBLicenceCertificate getJtbLicenceCertiBy_CI(String caseId)
			throws NoSuchJTBLicenceCertificateException {
		return jtbLicenceCertificatePersistence.findBygetJtbLicenceCertiBy_CI(caseId);
	}

	List<JTBLicenceCertificate> getJtbLicCertiBy_CI(String caseId) {
		return jtbLicenceCertificatePersistence.findBygetJtbLicCertiBy_CI(caseId);
	}

	public JTBLicenceCertificate updateJTBLicenceCertificate(String caseId, String licenceCertificate,
			String category, Date issueDate, Date expirationDate, String status) {
		JTBLicenceCertificate licenceCerti = null;
		licenceCerti = jtbLicenceCertificatePersistence.create(CounterLocalServiceUtil.increment());
		licenceCerti.setCaseId(caseId);
		licenceCerti.setLicenceCertificate(licenceCertificate);
		licenceCerti.setCategory(category);
		licenceCerti.setIssueDate(issueDate);
		licenceCerti.setExpirationDate(expirationDate);
		licenceCerti.setStatus(status);
		jtbLicenceCertificatePersistence.update(licenceCerti);
		return licenceCerti;
	}

}