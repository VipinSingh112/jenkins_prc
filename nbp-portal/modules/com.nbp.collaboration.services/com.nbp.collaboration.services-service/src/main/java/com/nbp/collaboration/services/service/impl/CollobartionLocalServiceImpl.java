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

package com.nbp.collaboration.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.collaboration.services.model.Collobartion;
import com.nbp.collaboration.services.service.base.CollobartionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.collaboration.services.model.Collobartion",
	service = AopService.class
)
public class CollobartionLocalServiceImpl
	extends CollobartionLocalServiceBaseImpl {
	
	public List<Collobartion> getCollobartionByCaseId(String caseId){
		return collobartionPersistence.findBycaseId(caseId);		
	}
	public List<Collobartion> getCollobartionStageNameCaseId(String stageName,String caseId){
		return collobartionPersistence.findBystageName_CaseId(caseId, stageName);
	}
	public List<Collobartion> getCollobartionStageNameCaseIdUsertype(String stageName,String caseId,String userType){
		return collobartionPersistence.findByStage_CU(caseId, stageName, userType);
	}
	public List<Collobartion> getCollaborationStageCaseIdUserTypeArchived(String stageName,String caseId,String userType,int archived){
		return collobartionPersistence.findByStage_CUA(caseId, stageName, userType,archived);
	}
}