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

package com.nbp.farm.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.farm.application.form.service.model.FarmerCrop;
import com.nbp.farm.application.form.service.service.base.FarmerCropLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.form.service.model.FarmerCrop",
	service = AopService.class
)
public class FarmerCropLocalServiceImpl extends FarmerCropLocalServiceBaseImpl {
	public FarmerCrop getFarmerById(long ApplicataionId) {
		return farmerCropPersistence.fetchBygetfarmerById(ApplicataionId);}

	public List<FarmerCrop> getFA_FC_FAI(long ApplicataionId) {
		return farmerCropPersistence.findBygetFA_FC_FAI(ApplicataionId);}
	public	List<FarmerCrop> getFA_FCP_FAI(long ApplicationId){
		return farmerCropPersistence.findBygetFA_FC_FAI(ApplicationId);}
	public void deleteFA_CROP_FAI(long applicationId) {
		farmerCropPersistence.removeBygetFA_FC_FAI(applicationId);
	}
	
}