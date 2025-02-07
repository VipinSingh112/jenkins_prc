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

package com.nbp.manufacturing.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingRecommendationToJCAException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;
import com.nbp.manufacturing.application.stages.services.service.base.ManufacturingRecommendationToJCALocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA",
	service = AopService.class
)
public class ManufacturingRecommendationToJCALocalServiceImpl
	extends ManufacturingRecommendationToJCALocalServiceBaseImpl {
	private static Log _log=LogFactoryUtil.getLog(ManufacturingRecommendationToJCA.class);
	
	public ManufacturingRecommendationToJCA getManufacturingRecommendationToJCA(String caseId) throws NoSuchManufacturingRecommendationToJCAException {
		return manufacturingRecommendationToJCAPersistence.findBygetManuFacturingBy_CaseId(caseId);
		
	}
	public ManufacturingRecommendationToJCA updateManufacturingRecommendationToJCA(String caseId,Date date ,String recommendationToJCA,String recommendation,String numberOfMiicInspector) {
		ManufacturingRecommendationToJCA  recommendationToJca=null;
		 try {
			recommendationToJca=getManufacturingRecommendationToJCA(caseId);
		} catch (NoSuchManufacturingRecommendationToJCAException e) {
		}
		 if(Validator.isNotNull(recommendationToJca)) {
			 _log.info("CASE ID EXIST ********"+caseId+"****DATA UPDATED****");
			 recommendationToJca.setDate(date);
			 recommendationToJca.setRecommendationToJCA(recommendationToJCA);
			 recommendationToJca.setRecommendation(recommendation);
			 recommendationToJca.setNumberOfMIICInspectors(numberOfMiicInspector);
			 manufacturingRecommendationToJCAPersistence.update(recommendationToJca);
			 
		 }else {
		
			 recommendationToJca=createManufacturingRecommendationToJCA(CounterLocalServiceUtil.increment());			 
			 recommendationToJca.setCaseId(caseId);
			 try {
			 recommendationToJca.setDate(date);
			 }catch (Exception e) {
				// TODO: handle exception
			}
			 recommendationToJca.setRecommendationToJCA(recommendationToJCA);
			 recommendationToJca.setRecommendation(recommendation);
			 recommendationToJca.setNumberOfMIICInspectors(numberOfMiicInspector);
			 manufacturingRecommendationToJCAPersistence.update(recommendationToJca);
			 _log.info(" ********"+caseId+"****DATA CREATED***");
		 }
		 return recommendationToJca;
		
	}
}