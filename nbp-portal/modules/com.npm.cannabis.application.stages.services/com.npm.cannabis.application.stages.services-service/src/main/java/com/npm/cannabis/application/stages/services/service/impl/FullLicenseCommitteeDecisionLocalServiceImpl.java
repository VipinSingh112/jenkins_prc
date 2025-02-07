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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.npm.cannabis.application.stages.services.exception.NoSuchFullLicenseCommitteeDecisionException;
import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;
import com.npm.cannabis.application.stages.services.service.base.FullLicenseCommitteeDecisionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision",
	service = AopService.class
)
public class FullLicenseCommitteeDecisionLocalServiceImpl
	extends FullLicenseCommitteeDecisionLocalServiceBaseImpl {
	
	public List<FullLicenseCommitteeDecision> getFullLicenseCommitteeDecisionByCaseId(String caseId){
		return fullLicenseCommitteeDecisionPersistence.findBygetFLCD_CaseId(caseId);
	}
	public FullLicenseCommitteeDecision getFullLicenseCommitteeDecisionBy_Case_Id(String caseId) throws NoSuchFullLicenseCommitteeDecisionException{
		return fullLicenseCommitteeDecisionPersistence.findBygetFLCD_By_CaseId(caseId);
	}
	public FullLicenseCommitteeDecision getFullLicenseCommitteeDecisionByCaseIdStatus(String caseId,String committeeDecision) throws NoSuchFullLicenseCommitteeDecisionException{
		return fullLicenseCommitteeDecisionPersistence.findBygetFLCD_CD_caseId(committeeDecision, caseId);
	}
	public List<FullLicenseCommitteeDecision> getFullLicenseCommitteeDecisionByStatus(String committeeDecision){
		return fullLicenseCommitteeDecisionPersistence.findBygetFLCD_CD(committeeDecision);
	}
	public FullLicenseCommitteeDecision updateCommitteeDecisionApplicationStage(String caseId, String bondFeeDue,
			String committeeDecision,
			String licenseFeeDue,
			long totalAmountDue,
			String stageStatus) {

		FullLicenseCommitteeDecision applicationStage = null;

		try {
			applicationStage = fullLicenseCommitteeDecisionPersistence.findBygetFLCD_By_CaseId(caseId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(applicationStage)) {
			// applicationStage.setStageStartDate(stageStartDate);
			applicationStage.setBondFeeDue(bondFeeDue);
			applicationStage.setCommitteeDecision(committeeDecision);
			applicationStage.setLicenseFeeDue(licenseFeeDue);
			applicationStage.setTotalAmountDue(totalAmountDue);
			fullLicenseCommitteeDecisionPersistence.update(applicationStage);
		} else {
			applicationStage = createFullLicenseCommitteeDecision(
					CounterLocalServiceUtil.increment());
			applicationStage.setCaseId(caseId);
			applicationStage.setBondFeeDue(bondFeeDue);
			applicationStage.setCommitteeDecision(committeeDecision);
			applicationStage.setLicenseFeeDue(licenseFeeDue);
			applicationStage.setTotalAmountDue(totalAmountDue);
			fullLicenseCommitteeDecisionPersistence.update(applicationStage);
		}
		return applicationStage;
	}
}