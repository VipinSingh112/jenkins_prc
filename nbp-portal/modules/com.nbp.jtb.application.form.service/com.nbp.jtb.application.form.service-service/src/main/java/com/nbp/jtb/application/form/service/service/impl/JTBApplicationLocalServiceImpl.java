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

package com.nbp.jtb.application.form.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.jtb.application.form.service.exception.NoSuchJTBApplicationException;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBApplicationTable;
import com.nbp.jtb.application.form.service.service.base.JTBApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jtb.application.form.service.model.JTBApplication",
	service = AopService.class
)
public class JTBApplicationLocalServiceImpl
	extends JTBApplicationLocalServiceBaseImpl {
	public List<JTBApplication> getJTBApplicationList_By_S_UId(long userId,int status) {
		return jtbApplicationPersistence.findBygetJTB_ByS_U(userId, status);
		}
	public JTBApplication getJTB_By_AppNum(String applicationNumber) throws NoSuchJTBApplicationException {
		return jtbApplicationPersistence.findBygetJTB_By_AppNum(applicationNumber);
	}
	public List<JTBApplication> getJTB_By_Status(int status){
		return jtbApplicationPersistence.findBygetJTB_By_Status(status);
	}
	public JTBApplication getJTB_ByCaseId(String caseId) throws NoSuchJTBApplicationException {
		return jtbApplicationPersistence.findBygetJTB_ByCaseId(caseId);
	}
	 public JTBApplication getJTB_By_RT_AppNo(String typeOfApplicant, String expiredLicenseAppNumber) throws NoSuchJTBApplicationException{ 
		return jtbApplicationPersistence.findBygetJTB_By_RT_AppNo(typeOfApplicant,expiredLicenseAppNumber); 
     }
	 public  List<JTBApplication> getJTB_By_AppType_Status(int status, String typeOfApplication) throws NoSuchJTBApplicationException{ 
		 return jtbApplicationPersistence.findBygetJTB_By_AppType_Status(status, typeOfApplication); 
	 }
	 public List<String> getTpdcoDistinctCategories(){
			DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(JTBApplicationTable.INSTANCE.typeOfApplication).from(JTBApplicationTable.INSTANCE);
			return dslQuery(query);
		}
}