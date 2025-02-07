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

package com.nbp.cannabis.collaboration.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;
import com.nbp.cannabis.collaboration.services.service.base.CannabisCollobartionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.collaboration.services.model.CannabisCollobartion",
	service = AopService.class
)
public class CannabisCollobartionLocalServiceImpl
	extends CannabisCollobartionLocalServiceBaseImpl {
	
	public List<CannabisCollobartion> getCollobartionByCaseId(String caseId){
		return cannabisCollobartionPersistence.findBycaseId(caseId);		
	}
	public List<CannabisCollobartion> getCollobartionCannabisStageCaseId(String cannabisStage,String caseId){
		return cannabisCollobartionPersistence.findBycannabisStage_CaseId(caseId, cannabisStage);
	}
	public List<CannabisCollobartion> getCollobartionCannabisStageCaseIdUsertype(String cannabisStage,String caseId,String userType){
		return cannabisCollobartionPersistence.findBycannabisStage_CU(caseId, cannabisStage, userType);
	}
	public List<CannabisCollobartion> getCollaborationStageCaseIdUserTypeArchived(String cannabisStage,String caseId,String userType,int archived){
		return cannabisCollobartionPersistence.findBycannabisStage_CUA(caseId, cannabisStage, userType,archived);
	}
}