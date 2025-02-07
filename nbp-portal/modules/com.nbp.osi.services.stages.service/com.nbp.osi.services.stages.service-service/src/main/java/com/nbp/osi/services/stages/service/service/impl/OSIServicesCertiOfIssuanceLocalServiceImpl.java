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

package com.nbp.osi.services.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesCertiOfIssuanceException;
import com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance;
import com.nbp.osi.services.stages.service.service.base.OSIServicesCertiOfIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance",
	service = AopService.class
)
public class OSIServicesCertiOfIssuanceLocalServiceImpl
	extends OSIServicesCertiOfIssuanceLocalServiceBaseImpl {
	public OSIServicesCertiOfIssuance getOSIServicesCertiOfIssuanceByCaseId(String caseId) throws NoSuchOSIServicesCertiOfIssuanceException {
		return osiServicesCertiOfIssuancePersistence.findBygetOsiServicesCertiOfIssuanceServicesByCaseId(caseId) ;
	}
	public OSIServicesCertiOfIssuance updateOsiServicesCertiOfIssuance(String caseId,String nameOfInsolventPerson,
			Date dateCertificateIssued, Date dateOfExpiration,String certificateNum,String nameOfLicensedTrustee) {
		OSIServicesCertiOfIssuance certificateOfIssuance=null;
		certificateOfIssuance=osiServicesCertiOfIssuancePersistence.create(CounterLocalServiceUtil.increment());
		certificateOfIssuance.setCaseId(caseId);
		certificateOfIssuance.setNameOfInsolventPerson(nameOfInsolventPerson);
		certificateOfIssuance.setDateCertificateIssued(dateCertificateIssued);
		certificateOfIssuance.setDateOfExpiration(dateOfExpiration);
		certificateOfIssuance.setCertificateNum(certificateNum);
		certificateOfIssuance.setNameOfLicensedTrustee(nameOfLicensedTrustee);
		osiServicesCertiOfIssuancePersistence.update(certificateOfIssuance);
		return certificateOfIssuance;
	}
}