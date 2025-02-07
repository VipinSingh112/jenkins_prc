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

package com.nbp.mining.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationCertificateIssuanceException;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;
import com.nbp.mining.stage.service.service.base.MiningApplicationCertificateIssuanceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance",
	service = AopService.class
)
public class MiningApplicationCertificateIssuanceLocalServiceImpl
	extends MiningApplicationCertificateIssuanceLocalServiceBaseImpl {
	public  MiningApplicationCertificateIssuance getMiningApplicationCertificateIssuanceByCI(String caseId) throws NoSuchMiningApplicationCertificateIssuanceException {
		return  miningApplicationCertificateIssuancePersistence.findBygetMining_APP_By_CI(caseId);
	}
	public  MiningApplicationCertificateIssuance getMiningApplicationCertificateIssuanceByCN(String certificateNumber) throws NoSuchMiningApplicationCertificateIssuanceException {
		return  miningApplicationCertificateIssuancePersistence.findBygetMining_APP_By_CN(certificateNumber);
	}
	public MiningApplicationCertificateIssuance updateMiningCertificateIssuance(String caseId, String status,
			Date dateCertificateIssued, Date dateOfExpiration,String certificateNumber,long docId) {
		/** @param caseId
		* @param status
		* @param dateCertificateIssued
		* @param dateOfExpiration
		* @param certificateNumber
		* @param docId
		* We  using this function as it has a complete parameters 
		* 
		* @return MiningApplicationCertificateIssuance
		* */ 
		MiningApplicationCertificateIssuance issuanceOfCertificate = null;
		try {
			issuanceOfCertificate = miningApplicationCertificateIssuancePersistence.findBygetMining_APP_By_CI(caseId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(issuanceOfCertificate)) {
			issuanceOfCertificate.setCertificateNumber(certificateNumber);
			issuanceOfCertificate.setDateCertificateIssued(dateCertificateIssued);
			issuanceOfCertificate.setDateOfExpiration(dateOfExpiration);
			issuanceOfCertificate.setCertificateNumber(certificateNumber);
			issuanceOfCertificate.setDocumentFileEntryId(docId);
			miningApplicationCertificateIssuancePersistence.update(issuanceOfCertificate);
		} else {
			issuanceOfCertificate = miningApplicationCertificateIssuancePersistence.create(CounterLocalServiceUtil.increment());
			issuanceOfCertificate.setCaseId(caseId);
			issuanceOfCertificate.setCertificateNumber(certificateNumber);
			issuanceOfCertificate.setDateCertificateIssued(dateCertificateIssued);
			issuanceOfCertificate.setDateOfExpiration(dateOfExpiration);
			issuanceOfCertificate.setCertificateNumber(certificateNumber);
			issuanceOfCertificate.setDocumentFileEntryId(docId);
			miningApplicationCertificateIssuancePersistence.update(issuanceOfCertificate);
		}
		return issuanceOfCertificate;
	}
	@Override
	public MiningApplicationCertificateIssuance updateMiningCertificateIssuance(String caseId, String status,
			Date dateCertificateIssued, Date dateOfExpiration, String certificateNumber) {
		/** 
		 * We not using this function as it has not a complete parameters 
		 * 
		 * */ 
		// TODO Auto-generated method stub
		return null;
	}
}