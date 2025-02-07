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

package com.nbp.janaac.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.stages.services.exception.NoSuchJanaacReportException;
import com.nbp.janaac.stages.services.model.JanaacReport;
import com.nbp.janaac.stages.services.service.base.JanaacReportLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.janaac.stages.services.model.JanaacReport", service = AopService.class)
public class JanaacReportLocalServiceImpl extends JanaacReportLocalServiceBaseImpl {
	public JanaacReport getJanaac_by_caseId(String caseId) throws NoSuchJanaacReportException {
		return janaacReportPersistence.findBygetJanaac_by_caseId(caseId);
	}

	public JanaacReport updateJanaacApplicationReport(String caseId, Date dateOfReport, String report) {
		JanaacReport applicationReport = null;
		try {
			applicationReport = getJanaac_by_caseId(caseId);
		} catch (NoSuchJanaacReportException e) {
		}
		if (Validator.isNotNull(applicationReport)) {
			applicationReport.setCaseId(caseId);
			applicationReport.setDateOfReport(dateOfReport);
			applicationReport.setReport(report);
			applicationReport.setModifiedDate(new Date());
			janaacReportPersistence.update(applicationReport);
		} else {
			applicationReport = createJanaacReport(CounterLocalServiceUtil.increment());
			applicationReport.setCaseId(caseId);
			applicationReport.setDateOfReport(dateOfReport);
			applicationReport.setReport(report);
			applicationReport.setModifiedDate(new Date());
			janaacReportPersistence.update(applicationReport);
		}
		return applicationReport;
	}
}