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

package com.nbp.mining.lease.application.service.service.impl;

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.mining.lease.application.service.exception.NoSuchMiningLeaseApplicationException;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplicationTable;
import com.nbp.mining.lease.application.service.service.base.MiningLeaseApplicationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.mining.lease.application.service.model.MiningLeaseApplication",
	service = AopService.class
)
public class MiningLeaseApplicationLocalServiceImpl
	extends MiningLeaseApplicationLocalServiceBaseImpl {
	public List<MiningLeaseApplication> getMiningByS_U(long userId,int status) {
		return miningLeaseApplicationPersistence.findBygetMiningByS_U(userId, status);
	}
	public List<MiningLeaseApplication> getMiningByStatus(int status) {
		return miningLeaseApplicationPersistence.findBygetMiningByStatus(status);
	}
	public MiningLeaseApplication getMiningByAppNum(String applicationNumber) throws NoSuchMiningLeaseApplicationException {
		return miningLeaseApplicationPersistence.findBygetMiningByAppNum(applicationNumber);
	}
	public MiningLeaseApplication getMiningByCaseId(String caseId) throws NoSuchMiningLeaseApplicationException {
		return miningLeaseApplicationPersistence.findBygetMiningByCaseId(caseId);
	}
	public MiningLeaseApplication getMiningByRT_AppNo(String typeOfApplicant, String expiredLicenseAppNumber) throws NoSuchMiningLeaseApplicationException {
		return miningLeaseApplicationPersistence.findBygetMiningByRT_AppNo(typeOfApplicant, expiredLicenseAppNumber);
	}
	public MiningLeaseApplication getMiningBy_PRNum_PLNum(String applicationNumber, String prospRightsNum) throws NoSuchMiningLeaseApplicationException {
		return miningLeaseApplicationPersistence.fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(applicationNumber, prospRightsNum);
	}
	public List<String> getMiningDistinctCategory() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(MiningLeaseApplicationTable.INSTANCE.typeOfTransaction)
				.from(MiningLeaseApplicationTable.INSTANCE);
		return dslQuery(query);
	}
	@Override
	public List<String> getJadscDistinctCategory() {
		// TODO Auto-generated method stub
		return null;
	}
}