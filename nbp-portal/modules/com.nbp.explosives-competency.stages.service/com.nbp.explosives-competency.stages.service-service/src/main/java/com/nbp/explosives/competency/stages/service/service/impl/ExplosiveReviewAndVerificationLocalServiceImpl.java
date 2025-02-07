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
import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveReviewAndVerificationException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;
import com.nbp.explosives.competency.stages.service.service.base.ExplosiveReviewAndVerificationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification", service = AopService.class)
public class ExplosiveReviewAndVerificationLocalServiceImpl extends ExplosiveReviewAndVerificationLocalServiceBaseImpl {
	public ExplosiveReviewAndVerification getExplosiveReviewAndVerificationByCI(String caseId)
			throws NoSuchExplosiveReviewAndVerificationException {
		return explosiveReviewAndVerificationPersistence.findBygetEXP_RV_CI(caseId);
	}
	public List<ExplosiveReviewAndVerification> getExplosiveReviewAndVerificationListByCI(String caseId)
			throws NoSuchExplosiveReviewAndVerificationException {
		return explosiveReviewAndVerificationPersistence.findBygetEXP_RV_List_CI(caseId);
	}
	public ExplosiveReviewAndVerification updateExplosiveReviewAndVerificationData(String caseId, Date dateReceived,
			String amountDue, String amountreceived, String receiptNumber, String comments, String amountOutstanding,
			Date dueDate, String status) {
		ExplosiveReviewAndVerification confirmation = null;

		confirmation = explosiveReviewAndVerificationPersistence.create(CounterLocalServiceUtil.increment());
		confirmation.setCaseId(caseId);
		confirmation.setDateReceived(dateReceived);
		confirmation.setAmountDue(amountDue);
		confirmation.setReceivedNumber(receiptNumber);
		confirmation.setAmountreceived(amountreceived);
		confirmation.setAmountOutstanding(amountOutstanding);
		confirmation.setDueDate(dueDate);
		confirmation.setStatus(status);
		confirmation.setComments(comments);
		explosiveReviewAndVerificationPersistence.update(confirmation);
		return confirmation;
	}
}