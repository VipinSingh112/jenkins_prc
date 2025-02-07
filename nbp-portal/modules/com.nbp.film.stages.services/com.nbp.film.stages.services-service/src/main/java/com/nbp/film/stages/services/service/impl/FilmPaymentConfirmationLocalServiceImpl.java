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

package com.nbp.film.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.film.stages.services.exception.NoSuchFilmPaymentConfirmationException;
import com.nbp.film.stages.services.model.FilmPaymentConfirmation;
import com.nbp.film.stages.services.service.FilmPaymentConfirmationLocalServiceUtil;
import com.nbp.film.stages.services.service.base.FilmPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.film.stages.services.model.FilmPaymentConfirmation",
	service = AopService.class
)
public class FilmPaymentConfirmationLocalServiceImpl
	extends FilmPaymentConfirmationLocalServiceBaseImpl {
	public FilmPaymentConfirmation getFilmPaymentConfirmationBy_CI(String caseId) throws NoSuchFilmPaymentConfirmationException {
		return filmPaymentConfirmationPersistence.findBygetFilmFullPaymentConfirmationBy_CI(caseId);
	}
	public List<FilmPaymentConfirmation> getFilmPaymentConfirmations_By_CI(String caseId) {
		return filmPaymentConfirmationPersistence.findBygetFilmFullPaymentConfirmations_By_CI(caseId);
	}
	public FilmPaymentConfirmation updateFilmPaymentConfirmation(String caseId,Date dateReceived,String amountDue,
			String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
			,String status) {
		FilmPaymentConfirmation confirmation=null;
			confirmation=filmPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			filmPaymentConfirmationPersistence.update(confirmation);
			return confirmation;
	}
}