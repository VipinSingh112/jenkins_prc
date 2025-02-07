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

package com.nbp.sez.status.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWelcomePackageException;
import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusWelcomePackageLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage",
	service = AopService.class
)
public class SezStatusWelcomePackageLocalServiceImpl
	extends SezStatusWelcomePackageLocalServiceBaseImpl {
	
	public SezStatusWelcomePackage getSezStatus_Welcome_Package_By_CI(String caseId) throws NoSuchSezStatusWelcomePackageException {
		return sezStatusWelcomePackagePersistence.findBygetSezStatus_Welcome_Package_By_CI(caseId);
	}
	public SezStatusWelcomePackage updateSezStatusWelcomePackage(String caseId,Date dateOfWelcomePackageSigned,Date dateOfApplicantSigned,long welcomePackageFileEntry) {
		SezStatusWelcomePackage sezStatusWelcomePackage=null;
		try {
			sezStatusWelcomePackage=sezStatusWelcomePackagePersistence.findBygetSezStatus_Welcome_Package_By_CI(caseId);
		} catch (Exception e) {
		}
		if(sezStatusWelcomePackage==null) {
			sezStatusWelcomePackage=sezStatusWelcomePackagePersistence.create(CounterLocalServiceUtil.increment());
		}
		sezStatusWelcomePackage.setCaseId(caseId);
		sezStatusWelcomePackage.setDateWelcomePackageSigned(dateOfWelcomePackageSigned);
		sezStatusWelcomePackage.setDocLicFileEntryId(welcomePackageFileEntry);
		sezStatusWelcomePackage.setWelcomePackageSubmitToAppli(dateOfApplicantSigned);
		sezStatusWelcomePackagePersistence.update(sezStatusWelcomePackage);
		return sezStatusWelcomePackage;
		
	}
}