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

package com.nbp.jadsc.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliReviewAndValidException;
import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;
import com.nbp.jadsc.stage.services.service.base.JadscAppliReviewAndValidLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid",
	service = AopService.class
)
public class JadscAppliReviewAndValidLocalServiceImpl
	extends JadscAppliReviewAndValidLocalServiceBaseImpl {
	
	public JadscAppliReviewAndValid getJadscAppliReviewAndValidByCI(String caseId) throws NoSuchJadscAppliReviewAndValidException{
		return jadscAppliReviewAndValidPersistence.findBygetJadsc_RV_CI(caseId);
		}
	
	public List<JadscAppliReviewAndValid> getJadscAppliReviewAndValidByVersionOfApplication(String versionOfApplication) {
		return jadscAppliReviewAndValidPersistence.findBygetJadsc_By_RV(versionOfApplication);
	}
	
	public JadscAppliReviewAndValid updateJadscAppliReviewAndValid(String caseId,String versionOfApplication, String status) {
		JadscAppliReviewAndValid applicationReviewAndValid=null;
		try {
			applicationReviewAndValid=getJadscAppliReviewAndValidByCI(caseId);
		} catch (NoSuchJadscAppliReviewAndValidException e) {
		}
		if(Validator.isNotNull(applicationReviewAndValid)) {
			applicationReviewAndValid.setCaseId(caseId);
			applicationReviewAndValid.setVersionOfApplication(versionOfApplication);
			applicationReviewAndValid.setStatus(status);
			applicationReviewAndValid.setModifiedDate(new Date());
			jadscAppliReviewAndValidPersistence.update(applicationReviewAndValid);
		}else {
			applicationReviewAndValid=createJadscAppliReviewAndValid(CounterLocalServiceUtil.increment());
			applicationReviewAndValid.setCaseId(caseId);
			applicationReviewAndValid.setVersionOfApplication(versionOfApplication);
			applicationReviewAndValid.setStatus(status);
			applicationReviewAndValid.setModifiedDate(new Date());
			jadscAppliReviewAndValidPersistence.update(applicationReviewAndValid);
		}
		return applicationReviewAndValid;
	}
}
