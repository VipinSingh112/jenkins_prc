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
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicensePaymentException;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;
import com.npm.cannabis.application.stages.services.service.base.CannabisLicensePaymentLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisLicensePayment",
	service = AopService.class
)
public class CannabisLicensePaymentLocalServiceImpl
	extends CannabisLicensePaymentLocalServiceBaseImpl {
	
	public CannabisLicensePayment updateCannabisLicensePayment(String caseId,String bondFeeReceived,String licenseFeeReceived,String paymentOption,String paymentStatus) {
		
		CannabisLicensePayment cannabisLicensePayment =null;
		try {
			cannabisLicensePayment = cannabisLicensePaymentPersistence.findBygetCADD_CaseId(caseId);
		} catch (NoSuchCannabisLicensePaymentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Validator.isNotNull(cannabisLicensePayment)) {
			cannabisLicensePayment.setBondAmtDue(bondFeeReceived);
			cannabisLicensePayment.setPaymentAmtRecieved(licenseFeeReceived);
			cannabisLicensePayment.setPaymentOption(paymentOption);
			cannabisLicensePayment.setPaymentStatus(paymentStatus);
			cannabisLicensePayment.setModifiedDate(new Date());
			cannabisLicensePaymentPersistence.update(cannabisLicensePayment);
		}else {
			cannabisLicensePayment = cannabisLicensePaymentPersistence.create(CounterLocalServiceUtil.increment(CannabisLicensePayment.class.getName()));
			cannabisLicensePayment.setBondAmtDue(bondFeeReceived);
			cannabisLicensePayment.setPaymentAmtRecieved(licenseFeeReceived);
			cannabisLicensePayment.setPaymentOption(paymentOption);
			cannabisLicensePayment.setPaymentStatus(paymentStatus);
			cannabisLicensePayment.setCreateDate(new Date());
			cannabisLicensePayment.setCaseId(caseId);
			cannabisLicensePaymentPersistence.update(cannabisLicensePayment);
		}
		
		return cannabisLicensePayment;
		
	}
	
	public CannabisLicensePayment getCannabisLicenceByPayment(long cannabisApplicationId) throws NoSuchCannabisLicensePaymentException{
		return cannabisLicensePaymentPersistence.findBygetCLP_CAI(cannabisApplicationId);
	}
}