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

package com.nbp.healthcare.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.healthcare.stage.service.exception.NoSuchHealthCareDueDiligenceException;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligenceTable;
import com.nbp.healthcare.stage.service.service.base.HealthCareDueDiligenceLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.healthcare.stage.service.model.HealthCareDueDiligence", service = AopService.class)
public class HealthCareDueDiligenceLocalServiceImpl extends HealthCareDueDiligenceLocalServiceBaseImpl {
	public HealthCareDueDiligence getHealthCareBy_CI(String caseId) throws NoSuchHealthCareDueDiligenceException {
		return healthCareDueDiligencePersistence.findBygetHealthCareBY_CI(caseId);
	}
	
	public HealthCareDueDiligence getHealthCareDueDiligenceBy_CI_SN(String caseId, String agncyName)
			throws NoSuchHealthCareDueDiligenceException {
		return healthCareDueDiligencePersistence.findBygetHealthCareBY_CI_AN(caseId, agncyName);
	}

		public HealthCareDueDiligence updateHealthCareDueDiligence(String caseId, Date dateSubmittedAgency,
				String nameofAgency, String Status, Date feedbackReceived,String reasonForObejction, String agencyDecision,String durationOfPeriod) {
			HealthCareDueDiligence careDueDiligence = null;
			try {
				careDueDiligence = getHealthCareBy_CI(caseId);
			} catch (NoSuchHealthCareDueDiligenceException e) {
				// TODO Auto-generated catch block
			}
			if (Validator.isNotNull(careDueDiligence)) {
				careDueDiligence.setNameofAgency(nameofAgency);
				careDueDiligence.setStatus(Status);
				careDueDiligence.setDateSubmittedAgency(dateSubmittedAgency);
				careDueDiligence.setFeedbackReceived(feedbackReceived);
				careDueDiligence.setAgencyDecision(agencyDecision);
				careDueDiligence.setReasonForObejction(reasonForObejction);
				careDueDiligence.setDurationOfPeriod(durationOfPeriod);
				healthCareDueDiligencePersistence.update(careDueDiligence);

			} else {
				careDueDiligence = createHealthCareDueDiligence(CounterLocalServiceUtil.increment());
				careDueDiligence.setCaseId(caseId);
				careDueDiligence.setNameofAgency(nameofAgency);
				careDueDiligence.setStatus(Status);
				careDueDiligence.setDateSubmittedAgency(dateSubmittedAgency);
				careDueDiligence.setFeedbackReceived(feedbackReceived);
				careDueDiligence.setAgencyDecision(agencyDecision);
				careDueDiligence.setReasonForObejction(reasonForObejction);
				careDueDiligence.setDurationOfPeriod(durationOfPeriod);
				healthCareDueDiligencePersistence.update(careDueDiligence);

			}
		return careDueDiligence;
	}
		public List<String> getDistinctAgencies(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(HealthCareDueDiligenceTable.INSTANCE.nameofAgency).from(HealthCareDueDiligenceTable.INSTANCE);
			return dslQuery(query);
		}

		@Override
		public HealthCareDueDiligence updateHealthCareDueDiligence(String caseId, Date dateSubmittedAgency,
				String nameofAgency, String Status, String feedbackReceived, Date date) {
return null;
		}

		@Override
		public HealthCareDueDiligence updateHealthCareDueDiligence(String caseId, Date dateSubmittedAgency,
				String nameofAgency, String Status, Date feedbackReceived) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public HealthCareDueDiligence updateHealthCareDueDiligence(String caseId, Date dateSubmittedAgency,
				String nameofAgency, String Status, Date feedbackReceived, String reasonForObejction,
				String agencyDecision) {
			// TODO Auto-generated method stub
			return null;
		}
}