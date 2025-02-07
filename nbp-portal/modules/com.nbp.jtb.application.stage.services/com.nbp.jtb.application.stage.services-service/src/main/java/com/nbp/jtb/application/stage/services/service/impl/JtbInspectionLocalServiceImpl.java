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

package com.nbp.jtb.application.stage.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.jtb.application.stage.services.exception.NoSuchJtbInspectionException;
import com.nbp.jtb.application.stage.services.model.JtbInspection;
import com.nbp.jtb.application.stage.services.service.base.JtbInspectionLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jtb.application.stage.services.model.JtbInspection",
	service = AopService.class
)
public class JtbInspectionLocalServiceImpl
	extends JtbInspectionLocalServiceBaseImpl {
	
	public  JtbInspection getJtbyInspecBy_CI(String caseId) throws NoSuchJtbInspectionException {
		return jtbInspectionPersistence.findBygetJtbyInspecBy_CI(caseId);
	}
	public List< JtbInspection>  getJtb_FBAI(long jtbApplicationId){
		return jtbInspectionPersistence.findBygetJtb_FBAI(jtbApplicationId);
	}
	public List< JtbInspection> getJtb_CaseId(String caseId){
		return jtbInspectionPersistence.findBygetJtb_CaseId(caseId);
	}
	public List< JtbInspection> getJtb_Status(String status){
		return jtbInspectionPersistence.findBygetJtb_Status(status);
	}
	public List<JtbInspection> getJtb_CaseIdStatus(String caseId,String status){
		return jtbInspectionPersistence.findBygetJtb_CaseIdStatus(status, caseId);
	}
	public List< JtbInspection> getJtb_CIAppId(String status,long jtbApplicationId){
		return jtbInspectionPersistence.findBygetJtb_CIAppId(status, jtbApplicationId);
	}
	
	public  JtbInspection getJtbByStatus_Slot_AppId(String status,long slotBookedByUser,long jtbApplicationId) throws NoSuchJtbInspectionException {
		return jtbInspectionPersistence.findBygetJtbByStatus_Slot_AppId(status, slotBookedByUser, jtbApplicationId);
	}
	

 
}