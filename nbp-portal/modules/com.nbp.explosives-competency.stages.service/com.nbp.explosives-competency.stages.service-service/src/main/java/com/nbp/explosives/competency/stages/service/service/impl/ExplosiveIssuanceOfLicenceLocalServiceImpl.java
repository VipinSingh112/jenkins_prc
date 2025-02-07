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

package com.nbp.explosives.competency.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveIssuanceOfLicenceException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;
import com.nbp.explosives.competency.stages.service.service.base.ExplosiveIssuanceOfLicenceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence", service = AopService.class)
public class ExplosiveIssuanceOfLicenceLocalServiceImpl extends ExplosiveIssuanceOfLicenceLocalServiceBaseImpl {
	public ExplosiveIssuanceOfLicence getExplosiveLicIssBy_CI(String caseId)
			throws NoSuchExplosiveIssuanceOfLicenceException {
		return explosiveIssuanceOfLicencePersistence.findBygetEXP_CD_CI(caseId);
	}

	public ExplosiveIssuanceOfLicence updateExplosiveIssuanceOfLicence(String caseId, Date dateOfIssue, Date dateOfExp,
			String certificateNum, long certificateId) throws NoSuchExplosiveIssuanceOfLicenceException {
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence = null;
		try {
			explosiveIssuanceOfLicence = explosiveIssuanceOfLicencePersistence.findBygetEXP_CD_CI(caseId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		if (Validator.isNotNull(explosiveIssuanceOfLicence)) {
			// tourismApplicationStages.setStageStartDate(stageStartDate);
			explosiveIssuanceOfLicence.setDateOfIssuance(dateOfIssue);
			explosiveIssuanceOfLicence.setDateOfExpiration(dateOfExp);
			explosiveIssuanceOfLicence.setCertificateNumber(certificateNum);
			explosiveIssuanceOfLicence.setCertificateNumberId(certificateId);
			explosiveIssuanceOfLicence.setModifiedDate(new Date());
			explosiveIssuanceOfLicencePersistence.update(explosiveIssuanceOfLicence);
		} else {
			explosiveIssuanceOfLicence = createExplosiveIssuanceOfLicence(
					CounterLocalServiceUtil.increment(ExplosiveIssuanceOfLicence.class.getName()));
			explosiveIssuanceOfLicence.setCaseId(caseId);
			explosiveIssuanceOfLicence.setDateOfIssuance(dateOfIssue);
			explosiveIssuanceOfLicence.setDateOfExpiration(dateOfExp);
			explosiveIssuanceOfLicence.setCertificateNumber(certificateNum);
			explosiveIssuanceOfLicence.setCertificateNumberId(certificateId);
			explosiveIssuanceOfLicence.setCreateDate(new Date());
			explosiveIssuanceOfLicencePersistence.update(explosiveIssuanceOfLicence);
		}
		return explosiveIssuanceOfLicence;
	}
}