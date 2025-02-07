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

package com.nbp.miic.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.stages.service.exception.NoSuchMiicCertificateOfIssuanceException;
import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;
import com.nbp.miic.stages.service.service.MiicCertificateOfIssuanceLocalServiceUtil;
import com.nbp.miic.stages.service.service.base.MiicCertificateOfIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.miic.stages.service.model.MiicCertificateOfIssuance", service = AopService.class)
public class MiicCertificateOfIssuanceLocalServiceImpl extends MiicCertificateOfIssuanceLocalServiceBaseImpl {
	public MiicCertificateOfIssuance getMiic_RD_by_CI(String caseId) throws NoSuchMiicCertificateOfIssuanceException {
		return miicCertificateOfIssuancePersistence.findBygetMiic_CI_by_CI(caseId);
	}

	public MiicCertificateOfIssuance updateMiicCertificateOfIssuanceData(String caseId, String certificateNumber,
			Date dateCertificateIssued, Date dateOfExpiration,String nameOfLicensedTrustee ) {
		MiicCertificateOfIssuance certificateOfIssuance = null;
		try {
			certificateOfIssuance = MiicCertificateOfIssuanceLocalServiceUtil.getMiic_RD_by_CI(caseId);
		} catch (NoSuchMiicCertificateOfIssuanceException e) {
		}
		if (Validator.isNotNull(certificateOfIssuance)) {
			certificateOfIssuance.setCaseId(caseId);
			certificateOfIssuance.setCertificateNumber(certificateNumber);
			certificateOfIssuance.setDateCertificateIssued(dateCertificateIssued);
			certificateOfIssuance.setDateOfExpiration(dateOfExpiration);
			certificateOfIssuance.setNameOfLicensedTrustee(nameOfLicensedTrustee);
			miicCertificateOfIssuancePersistence.update(certificateOfIssuance);
		} else {
			certificateOfIssuance = miicCertificateOfIssuancePersistence.create(CounterLocalServiceUtil.increment());
			certificateOfIssuance.setCaseId(caseId);
			certificateOfIssuance.setCertificateNumber(certificateNumber);
			certificateOfIssuance.setDateCertificateIssued(dateCertificateIssued);
			certificateOfIssuance.setDateOfExpiration(dateOfExpiration);
			certificateOfIssuance.setNameOfLicensedTrustee(nameOfLicensedTrustee);
			miicCertificateOfIssuancePersistence.update(certificateOfIssuance);
		}
		return certificateOfIssuance;
	}

	@Override
	public MiicCertificateOfIssuance updateMiicCertificateOfIssuance(String caseId, String certificateNumber,
			Date dateCertificateIssued, Date dateOfExpiration) {
		// TODO Auto-generated method stub
		return null;
	}
}