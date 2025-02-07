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

package com.nbp.fire.brigade.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeCertificateException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateLocalServiceUtil;
import com.nbp.fire.brigade.stage.service.service.base.FireBrigadeCertificateLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate", service = AopService.class)
public class FireBrigadeCertificateLocalServiceImpl extends FireBrigadeCertificateLocalServiceBaseImpl {
	public FireBrigadeCertificate getFireBrigadeCertificateByCaseId(String caseId)
			throws NoSuchFireBrigadeCertificateException {
		return fireBrigadeCertificatePersistence.findBygetFireBrigadeCertificateByCaseId(caseId);
	}

	public FireBrigadeCertificate updateFireBrigadeApplicationCertificate(String caseId, String nameOfOwner, String typeOfPremises,
			Date dateOfIssue, Date dateOfExpiry,String certificateNumber) {
		FireBrigadeCertificate certificate = null;
		
		try {
			certificate=FireBrigadeCertificateLocalServiceUtil.getFireBrigadeCertificateByCaseId(caseId);
		} catch (Exception e) {
		}
        if(Validator.isNull(certificate)) {
		certificate = fireBrigadeCertificatePersistence.create(CounterLocalServiceUtil.increment());
        }
		certificate.setCaseId(caseId);
		certificate.setNameOfOwner(nameOfOwner);
		certificate.setTypeOfPremises(typeOfPremises);
		certificate.setIssueDate(dateOfIssue);
		certificate.setExpirationDate(dateOfExpiry);
		certificate.setCertificateNumber(certificateNumber);
		fireBrigadeCertificatePersistence.update(certificate);
		return certificate;
	}

	@Override
	public FireBrigadeCertificate updateFireBrigadeCertificate(String caseId, String nameOfOwner, String typeOfPremises,
			Date dateOfIssue, Date dateOfExpiry) {
		// TODO Auto-generated method stub
		return null;
	}
}