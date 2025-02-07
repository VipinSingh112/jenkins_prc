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

package com.nbp.osi.insolvency.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.osi.insolvency.application.form.services.exception.NoSuchShareholdersHoldingsException;
import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;
import com.nbp.osi.insolvency.application.form.services.service.base.ShareholdersHoldingsLocalServiceBaseImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.ShareholdersHoldingsPersistence;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings",
	service = AopService.class
)
public class ShareholdersHoldingsLocalServiceImpl
	extends ShareholdersHoldingsLocalServiceBaseImpl {
	public List<ShareholdersHoldings> getOsiById(long osiInsolvencyId) throws NoSuchShareholdersHoldingsException{
		return shareholdersHoldingsPersistence.findBygetOsiById(osiInsolvencyId);
	}
	public void deleteBY_Id(long applicationId) {
		shareholdersHoldingsPersistence.removeBygetOsiById(applicationId);
		}
}