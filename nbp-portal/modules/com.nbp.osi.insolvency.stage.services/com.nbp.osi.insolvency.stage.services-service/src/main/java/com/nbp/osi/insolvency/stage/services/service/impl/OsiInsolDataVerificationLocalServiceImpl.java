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
import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolDataVerificationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;
import com.nbp.osi.insolvency.stage.services.service.OsiInsolDataVerificationLocalServiceUtil;
import com.nbp.osi.insolvency.stage.services.service.base.OsiInsolDataVerificationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification", service = AopService.class)
public class OsiInsolDataVerificationLocalServiceImpl extends OsiInsolDataVerificationLocalServiceBaseImpl {
	public OsiInsolDataVerification getOSIIRIssuanceOfReportBy_CI(String caseId)
			throws NoSuchOsiInsolDataVerificationException {
		return osiInsolDataVerificationPersistence.findBygetOSIIRDataVerificationBy_CI(caseId);
	}

	public OsiInsolDataVerification updateDataVerification(String caseId, String status) {
		OsiInsolDataVerification dataVerification = null;
		try {
			dataVerification = OsiInsolDataVerificationLocalServiceUtil.getOSIIRIssuanceOfReportBy_CI(caseId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(dataVerification)) {
			dataVerification.setStatus(status);
			OsiInsolDataVerificationLocalServiceUtil.updateOsiInsolDataVerification(dataVerification);
		} else {
			dataVerification = OsiInsolDataVerificationLocalServiceUtil
					.createOsiInsolDataVerification(CounterLocalServiceUtil.increment());
			dataVerification.setCaseId(caseId);
			dataVerification.setStatus(status);
			OsiInsolDataVerificationLocalServiceUtil.updateOsiInsolDataVerification(dataVerification);
		}
		return dataVerification;
	}
}