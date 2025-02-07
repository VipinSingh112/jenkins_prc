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

package com.nbp.osi.insolvency.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsoIIssuanceOfReportException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport;
import com.nbp.osi.insolvency.stage.services.service.OsiInsoIIssuanceOfReportLocalServiceUtil;
import com.nbp.osi.insolvency.stage.services.service.base.OsiInsoIIssuanceOfReportLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport", service = AopService.class)
public class OsiInsoIIssuanceOfReportLocalServiceImpl extends OsiInsoIIssuanceOfReportLocalServiceBaseImpl {
	public OsiInsoIIssuanceOfReport getOSIIRIssuanceOfReportBy_CI(String caseId)
			throws NoSuchOsiInsoIIssuanceOfReportException {
		return osiInsoIIssuanceOfReportPersistence.findBygetOSIIRIssuanceOfReportBy_CI(caseId);
	}

	public OsiInsoIIssuanceOfReport updateIIssuanceOfReportInsoIIssuanceOfReport(String caseId, Date dateOfReport,
			String nameOfApplicant, String typeOfApplicant, String decision) {
		OsiInsoIIssuanceOfReport isuanceOfReport = null;
		try {
			isuanceOfReport = OsiInsoIIssuanceOfReportLocalServiceUtil.getOSIIRIssuanceOfReportBy_CI(caseId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(isuanceOfReport)) {
			isuanceOfReport.setDateOfReport(dateOfReport);
			isuanceOfReport.setNameOfApplicant(nameOfApplicant);
			isuanceOfReport.setTypeOfApplicant(typeOfApplicant);
			isuanceOfReport.setDecision(decision);
			OsiInsoIIssuanceOfReportLocalServiceUtil.updateOsiInsoIIssuanceOfReport(isuanceOfReport);
		} else {
			isuanceOfReport = OsiInsoIIssuanceOfReportLocalServiceUtil
					.createOsiInsoIIssuanceOfReport(CounterLocalServiceUtil.increment());
			isuanceOfReport.setCaseId(caseId);
			isuanceOfReport.setDateOfReport(dateOfReport);
			isuanceOfReport.setNameOfApplicant(nameOfApplicant);
			isuanceOfReport.setTypeOfApplicant(typeOfApplicant);
			isuanceOfReport.setDecision(decision);
			OsiInsoIIssuanceOfReportLocalServiceUtil.updateOsiInsoIIssuanceOfReport(isuanceOfReport);
		}
		return isuanceOfReport;
	}
}