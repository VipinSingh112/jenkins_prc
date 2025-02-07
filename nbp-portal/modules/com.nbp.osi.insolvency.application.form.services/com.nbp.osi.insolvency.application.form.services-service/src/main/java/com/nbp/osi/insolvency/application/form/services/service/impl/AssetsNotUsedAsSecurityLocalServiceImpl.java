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
import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsNotUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.service.base.AssetsNotUsedAsSecurityLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity",
	service = AopService.class
)
public class AssetsNotUsedAsSecurityLocalServiceImpl
	extends AssetsNotUsedAsSecurityLocalServiceBaseImpl {
	public List<AssetsNotUsedAsSecurity> getOsiById(long osiInsolvencyId) throws NoSuchAssetsNotUsedAsSecurityException{
		return assetsNotUsedAsSecurityPersistence.findBygetOsiById(osiInsolvencyId);
	}
	public void deleteBY_Id(long applicationId) {
		assetsNotUsedAsSecurityPersistence.removeBygetOsiById(applicationId);
		}
}