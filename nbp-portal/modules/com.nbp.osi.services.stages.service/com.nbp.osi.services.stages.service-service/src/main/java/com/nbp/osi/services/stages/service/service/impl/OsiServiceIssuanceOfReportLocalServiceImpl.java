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
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.services.stages.service.exception.NoSuchOsiServiceIssuanceOfReportException;
import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;
import com.nbp.osi.services.stages.service.service.OsiServiceIssuanceOfReportLocalServiceUtil;
import com.nbp.osi.services.stages.service.service.base.OsiServiceIssuanceOfReportLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport",
	service = AopService.class
)
public class OsiServiceIssuanceOfReportLocalServiceImpl extends OsiServiceIssuanceOfReportLocalServiceBaseImpl {
	
	public OsiServiceIssuanceOfReport getOSIIssuanceOfReportBy_CI(String caseId)
			throws NoSuchOsiServiceIssuanceOfReportException {
		return osiServiceIssuanceOfReportPersistence.findBygetOSIIssuanceOfReportBy_CI(caseId);
	}	
	
	public OsiServiceIssuanceOfReport updateInsoIIssuanceOfReport(String caseId, Date dateOfReport,
			String nameOfApplicant, String typeOfApplicant, String decision) {
		OsiServiceIssuanceOfReport isuanceOfReport = null;
		try {
			isuanceOfReport = OsiServiceIssuanceOfReportLocalServiceUtil.getOSIIssuanceOfReportBy_CI(caseId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(isuanceOfReport)) {
			isuanceOfReport.setDateOfReport(dateOfReport);
			isuanceOfReport.setNameOfApplicant(nameOfApplicant);
			isuanceOfReport.setTypeOfApplicant(typeOfApplicant);
			isuanceOfReport.setDecision(decision);
			OsiServiceIssuanceOfReportLocalServiceUtil.updateOsiServiceIssuanceOfReport(isuanceOfReport);
		} else {
			isuanceOfReport = OsiServiceIssuanceOfReportLocalServiceUtil.createOsiServiceIssuanceOfReport(CounterLocalServiceUtil.increment());
			isuanceOfReport.setCaseId(caseId);
			isuanceOfReport.setDateOfReport(dateOfReport);
			isuanceOfReport.setNameOfApplicant(nameOfApplicant);
			isuanceOfReport.setTypeOfApplicant(typeOfApplicant);
			isuanceOfReport.setDecision(decision);
			OsiServiceIssuanceOfReportLocalServiceUtil.updateOsiServiceIssuanceOfReport(isuanceOfReport);
		}
		return isuanceOfReport;
	}
	
}