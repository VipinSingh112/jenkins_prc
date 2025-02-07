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

package com.nbp.osi.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.osi.application.form.services.exception.NoSuchOsiApplicationException;
import com.nbp.osi.application.form.services.model.OsiApplication;
import com.nbp.osi.application.form.services.service.base.OsiApplicationLocalServiceBaseImpl;
import com.nbp.osi.application.form.services.service.persistence.OsiApplicationPersistence;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.application.form.services.model.OsiApplication",
	service = AopService.class
)
public class OsiApplicationLocalServiceImpl
	extends OsiApplicationLocalServiceBaseImpl {
	
	  public List<OsiApplication> getOsiApplicationByStatus(int status){
	  return osiApplicationPersistence.findBygetOsiByStatus(status);
		  }
	
	  public List<OsiApplication> getOsiApplicationByS_U(int status , long userId){
	  return osiApplicationPersistence.findBygetOsiByS_U(userId, status);
	  
	  }	 
	  public List<OsiApplication> getOsiApplicationByS_UId( long userId,int status){
		return osiApplicationPersistence.findBygetOsiByStatus_UserId(userId, status);
		  
	  }
	@Override
	public List<OsiApplication> getOsiApplicationByStatus_UserId(int status, long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public OsiApplication getOsiByAppNum(String applicationNumber) throws NoSuchOsiApplicationException {
		return osiApplicationPersistence.findBygetOsiByAppNum(applicationNumber);
	}
	
	public OsiApplication getOsiByCaseId(String caseId) throws NoSuchOsiApplicationException{
		return osiApplicationPersistence.findBygetOsiByCaseId(caseId);
		
	}
	
    public OsiApplication getOsiByAT_AppNo(String applicationType,String appNumber) throws NoSuchOsiApplicationException { 
	return osiApplicationPersistence.findBygetOsiByAT_AppNo(applicationType, appNumber);
	  }
    public List<OsiApplication> getOsiApplicationByAppStatus(int status){
    return osiApplicationPersistence.findBygetOsiByAppStatus(status);
    	
    }
	 
	 
}