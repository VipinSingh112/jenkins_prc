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

package com.nbp.medical.facilities.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppTable;
import com.nbp.medical.facilities.application.form.service.service.base.MedicalFacilitiesAppLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp",
	service = AopService.class
)
public class MedicalFacilitiesAppLocalServiceImpl
	extends MedicalFacilitiesAppLocalServiceBaseImpl {
	
	  public List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_S_U(int status,long userId) { return
	  medicalFacilitiesAppPersistence.findBygetMedicalFacilitiesBy_S_U(status, userId);
	  }

	public List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_Status(int status) {
		 return medicalFacilitiesAppPersistence.findBygetMedicalFacilitiesBy_Status(status);
		}
	 
	 public MedicalFacilitiesApp getMedicalFacilitiesByCaseId(String caseId) throws NoSuchMedicalFacilitiesAppException{
			return medicalFacilitiesAppPersistence.findBygetMedicalByCaseID(caseId);
		}
	 public MedicalFacilitiesApp getMedicalByAppNo(String applicationNumber) throws NoSuchMedicalFacilitiesAppException {
		 return medicalFacilitiesAppPersistence.findBygetMedicalByAppNo(applicationNumber);
	 }
	 public MedicalFacilitiesApp getMedicalApplicationByExpiredNUmber(String expiredLicenceNUmber)  {
       try { return medicalFacilitiesAppPersistence.findBygetMedicalByExpiredLicNum(expiredLicenceNUmber);}catch (Exception e){}
        return null;
     }
	 public List<String> getMedicalDistinctCategories(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(MedicalFacilitiesAppTable.INSTANCE.natureOfApplicant).from(MedicalFacilitiesAppTable.INSTANCE);
			return dslQuery(query);
		}
}