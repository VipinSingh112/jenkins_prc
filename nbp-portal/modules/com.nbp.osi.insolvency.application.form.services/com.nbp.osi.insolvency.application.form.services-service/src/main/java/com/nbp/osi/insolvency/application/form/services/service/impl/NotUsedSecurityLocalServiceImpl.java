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
import com.nbp.osi.insolvency.application.form.services.exception.NoSuchNotUsedSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;
import com.nbp.osi.insolvency.application.form.services.service.base.NotUsedSecurityLocalServiceBaseImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.NotUsedSecurityPersistence;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity",
	service = AopService.class
)
public class NotUsedSecurityLocalServiceImpl
	extends NotUsedSecurityLocalServiceBaseImpl {
	
	  public List<NotUsedSecurity> getOsiByIdList(long osiInsolvencyId) throws
	  NoSuchNotUsedSecurityException { return
	  notUsedSecurityPersistence.findBygetOsiById(osiInsolvencyId);
	  }
	  public void deleteBY_Id(long applicationId) {
		  notUsedSecurityPersistence.removeBygetOsiById(applicationId);
			}
}