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

package com.nbp.agriculture.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.exception.NoSuchAgriculturePermitException;
import com.nbp.agriculture.stages.services.model.AgriculturePermit;
import com.nbp.agriculture.stages.services.service.base.AgriculturePermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.agriculture.stages.services.model.AgriculturePermit",
	service = AopService.class
)
public class AgriculturePermitLocalServiceImpl
	extends AgriculturePermitLocalServiceBaseImpl {
	public AgriculturePermit getAgricultureBy_CI(String caseId) throws NoSuchAgriculturePermitException {
		return agriculturePermitPersistence.findBygetAgriculturePermitBy_CI(caseId);
		}
	
	  public AgriculturePermit getAgricultureBy_PN(String PermitNumber) throws
	  NoSuchAgriculturePermitException { return
	  agriculturePermitPersistence.findBygetAgriculturePermitBy_PermitNum(PermitNumber); }
	 
	
	public AgriculturePermit updateAgriculturePermit(String caseId,String PIRPermtNumber,Date dateofIssue,Date dateofExpiration,String durationofPermit ) {
		AgriculturePermit agriculturePermit=null;
		try {
			agriculturePermit=agriculturePermitPersistence.findBygetAgriculturePermitBy_CI(caseId);
		} catch (NoSuchAgriculturePermitException e) {
		}
		if(Validator.isNotNull(agriculturePermit)) {
			agriculturePermit.setPirPermtNumber(PIRPermtNumber);
			agriculturePermit.setDateofIssue(dateofIssue);
			agriculturePermit.setDateOfExpiration(dateofExpiration);
			agriculturePermit.setDurationOfPermit(durationofPermit);
			agriculturePermitPersistence.update(agriculturePermit);
		}else {
			agriculturePermit=createAgriculturePermit(CounterLocalServiceUtil.increment());
			agriculturePermit.setCaseId(caseId);
			agriculturePermit.setPirPermtNumber(PIRPermtNumber);
			agriculturePermit.setDateofIssue(dateofIssue);
			agriculturePermit.setDateOfExpiration(dateofExpiration);
			agriculturePermit.setDurationOfPermit(durationofPermit);
			agriculturePermitPersistence.update(agriculturePermit);
		}
				
		return agriculturePermit;
		
	}
}