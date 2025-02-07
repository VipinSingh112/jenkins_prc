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

package com.nbp.film.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.film.application.form.service.exception.NoSuchFilmAdditionalEquipmentListException;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.service.base.FilmAdditionalEquipmentListLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList",
	service = AopService.class
)
public class FilmAdditionalEquipmentListLocalServiceImpl
	extends FilmAdditionalEquipmentListLocalServiceBaseImpl {
	public List<FilmAdditionalEquipmentList> getFilmAddEquipByAppId(long applicationId){
		return filmAdditionalEquipmentListPersistence.findBygetFilmAddEquipByAppId(applicationId);
	}
	public void deleteMultipleFormData_BY_AppId(long filmApplicationId) throws NoSuchFilmAdditionalEquipmentListException{
		filmAdditionalEquipmentListPersistence.removeBygetFilmAddEquipByAppId(filmApplicationId);
	}
	public void deleteMultipleFormData_BY_Id(long applicationId) throws NoSuchFilmAdditionalEquipmentListException {
		filmAdditionalEquipmentListPersistence.removeBygetFilmAddEquipByAppId(applicationId);
	}
	
}