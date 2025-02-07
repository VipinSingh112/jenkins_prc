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

package com.nbp.ncbj.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.ncbj.stages.services.exception.NoSuchNcbjLicenceCertificateException;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;
import com.nbp.ncbj.stages.services.service.base.NcbjLicenceCertificateLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate",
	service = AopService.class
)
public class NcbjLicenceCertificateLocalServiceImpl
	extends NcbjLicenceCertificateLocalServiceBaseImpl {
	public NcbjLicenceCertificate getNcbjLicenceCertiBy_CI(String caseId)
			throws NoSuchNcbjLicenceCertificateException {
		return ncbjLicenceCertificatePersistence.findBygetNcbjLicenceCertiBy_CI(caseId);
	}

	List<NcbjLicenceCertificate> getNcbjLicCertiBy_CI(String caseId) {
		return ncbjLicenceCertificatePersistence.findBygetNcbjLicCertiBy_CI(caseId);
	}

	public NcbjLicenceCertificate updateNcbjLicenceCertificate(String caseId, String licenceCertificate,
			String nameOfAppli, String nameOfCerti, String scopeOfCerti, Date issueDate, Date expirationDate, String status) {
		NcbjLicenceCertificate licenceCerti = null;
		licenceCerti = ncbjLicenceCertificatePersistence.create(CounterLocalServiceUtil.increment());
		licenceCerti.setCaseId(caseId);
		licenceCerti.setLicenceCertificate(licenceCertificate);
		licenceCerti.setNameOfApplicant(nameOfAppli);
		licenceCerti.setNameOfCertification(nameOfCerti);
		licenceCerti.setScopeOfCertification(scopeOfCerti);
		licenceCerti.setIssueDate(issueDate);
		licenceCerti.setExpirationDate(expirationDate);
		licenceCerti.setStatus(status);
		ncbjLicenceCertificatePersistence.update(licenceCerti);
		return licenceCerti;
	}

}