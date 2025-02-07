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

package com.nbp.acquire.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.stages.service.exception.NoSuchAcquireTenderingException;
import com.nbp.acquire.stages.service.model.AcquireTendering;
import com.nbp.acquire.stages.service.service.AcquireTenderingLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireTenderingLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireTendering",
	service = AopService.class
)
public class AcquireTenderingLocalServiceImpl
	extends AcquireTenderingLocalServiceBaseImpl {
	public AcquireTendering getAcquireTenderingBy_CI(String caseId) throws NoSuchAcquireTenderingException {
		return acquireTenderingPersistence.findBygetAcquireTenderingBy_CaseId(caseId);
		}
	public List<AcquireTendering> getAcquireTenderingListByCI(String caseId) throws NoSuchAcquireTenderingException {
		return acquireTenderingPersistence.findBygetAcquireTenderingBy_CI(caseId);
	}
public AcquireTendering updateAcquireApplicationTendering(String caseId,String nameOfEachBidders,String bidPriceofeachBid,String minPriceOfTenderOffer,String meetsMinimum,String highestOffer,String status) 
{
	AcquireTendering acquireTendering=null;
	
	try {
		acquireTendering=AcquireTenderingLocalServiceUtil.getAcquireTenderingBy_CI(caseId);
	} catch (NoSuchAcquireTenderingException e) {
	}
	if(Validator.isNotNull(acquireTendering)) {
		acquireTendering.setNameOfEachBidders(nameOfEachBidders);
		acquireTendering.setBidPriceofeachBid(bidPriceofeachBid);
		acquireTendering.setHighestOffer(highestOffer);
		acquireTendering.setMeetsMinimum(meetsMinimum);
		acquireTendering.setStatus(status);
		acquireTendering.setModifiedDate(new Date());
		acquireTenderingPersistence.update(acquireTendering);
	}else {
		acquireTendering=createAcquireTendering(CounterLocalServiceUtil.increment());
		acquireTendering.setCaseId(caseId);
		acquireTendering.setNameOfEachBidders(nameOfEachBidders);
		acquireTendering.setBidPriceofeachBid(bidPriceofeachBid);
		acquireTendering.setHighestOffer(highestOffer);
		acquireTendering.setMeetsMinimum(meetsMinimum);
		acquireTendering.setStatus(status);
		acquireTendering.setCreateDate(new Date());
		acquireTenderingPersistence.update(acquireTendering);
	}
	
	return acquireTendering;
}
public AcquireTendering updateApplicationTenderingBiddingStage(String caseId, String[] BiddingDetails) {
	AcquireTendering acquireTendering=null;
	try {
		acquireTendering=AcquireTenderingLocalServiceUtil.getAcquireTenderingBy_CI(caseId);
	} catch (NoSuchAcquireTenderingException e) {
	}
	if(Validator.isNotNull(acquireTendering)) {
		acquireTendering.setCaseId(caseId);
		for(int i=0;i<BiddingDetails.length;i++) {
		
		}
	}else {
	}
	return null;
	
}

}

