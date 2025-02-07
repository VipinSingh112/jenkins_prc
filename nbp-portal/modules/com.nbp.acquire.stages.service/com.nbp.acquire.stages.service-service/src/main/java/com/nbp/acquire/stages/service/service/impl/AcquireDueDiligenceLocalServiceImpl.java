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

package com.nbp.acquire.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.stages.service.exception.NoSuchAcquireDueDiligenceException;
import com.nbp.acquire.stages.service.model.AcquireDueDiligence;
import com.nbp.acquire.stages.service.model.AcquireDueDiligenceTable;
import com.nbp.acquire.stages.service.service.AcquireDueDiligenceLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireDueDiligenceLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireDueDiligence",
	service = AopService.class
)
public class AcquireDueDiligenceLocalServiceImpl
	extends AcquireDueDiligenceLocalServiceBaseImpl {
	public List<AcquireDueDiligence> getAcquireDueDiligenceBy_CI(String caseId){
		return acquireDueDiligencePersistence.findBygetADD_CaseId(caseId);
	}
public AcquireDueDiligence getAcquireDueDiligenceBy_CI_SN(String caseId, String agncyName) throws NoSuchAcquireDueDiligenceException {
	return acquireDueDiligencePersistence.findBygetADD_CaseId_AgencyName(caseId, agncyName);
	}

	public AcquireDueDiligence getAcquireDD_By_CI(String caseId) throws NoSuchAcquireDueDiligenceException {
		return acquireDueDiligencePersistence.findBygetADD_CI(caseId);
	}
	  public AcquireDueDiligence updateAcquireApplication(String caseId,String
	  siteVisitRequires, Date prefferedsiteVisitDate, String statusApproved, String
	  agencyName, Date dateSubmittedToAgency, Date dateFeedbackReceived, String
	  agencyRecommendations) { AcquireDueDiligence acquireDueDiligence=null;
	  try {
		acquireDueDiligence=AcquireDueDiligenceLocalServiceUtil.getAcquireDueDiligenceBy_CI_SN(caseId,agencyName);
	  } catch (NoSuchAcquireDueDiligenceException e) {
		} 
		if(Validator.isNotNull(acquireDueDiligence)) {
			acquireDueDiligence.setSiteVisitRequired(siteVisitRequires);
			acquireDueDiligence.setPreferredSitVisitDate(prefferedsiteVisitDate);
			acquireDueDiligence.setAgencySubmissionStatus(statusApproved);
			acquireDueDiligence.setNameOfAgency(agencyName);
			acquireDueDiligence.setDateSubmittedToAgency(dateSubmittedToAgency);
			acquireDueDiligence.setDateFeedbackReceived(dateFeedbackReceived);
			acquireDueDiligence.setAgencyRecommendations(agencyRecommendations);
			acquireDueDiligence.setModifiedDate(new Date());
			acquireDueDiligencePersistence.update(acquireDueDiligence);
		}else {
			acquireDueDiligence=AcquireDueDiligenceLocalServiceUtil.createAcquireDueDiligence(CounterLocalServiceUtil.increment());
			acquireDueDiligence.setCaseId(caseId);
			acquireDueDiligence.setSiteVisitRequired(siteVisitRequires);
			acquireDueDiligence.setPreferredSitVisitDate(prefferedsiteVisitDate);
			acquireDueDiligence.setAgencySubmissionStatus(statusApproved);
			acquireDueDiligence.setNameOfAgency(agencyName);
			acquireDueDiligence.setDateSubmittedToAgency(dateSubmittedToAgency);
			acquireDueDiligence.setDateFeedbackReceived(dateFeedbackReceived);
			acquireDueDiligence.setCreateDate(new Date());
			acquireDueDiligence.setAgencyRecommendations(agencyRecommendations);
			acquireDueDiligencePersistence.update(acquireDueDiligence);
		}
	  return acquireDueDiligence;
	  
	  }
	  public List<String> getDistinctAgencies(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(AcquireDueDiligenceTable.INSTANCE.nameOfAgency).from(AcquireDueDiligenceTable.INSTANCE);
			return dslQuery(query);
		}
	 
}