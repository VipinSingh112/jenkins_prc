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
import com.nbp.film.application.form.service.exception.NoSuchFilmEquipmentListException;
import com.nbp.film.application.form.service.model.FilmEquipmentList;
import com.nbp.film.application.form.service.service.base.FilmEquipmentListLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.film.application.form.service.model.FilmEquipmentList",
	service = AopService.class
)
public class FilmEquipmentListLocalServiceImpl
	extends FilmEquipmentListLocalServiceBaseImpl {
	
	public FilmEquipmentList getFilmById(long filmById) {
		return filmEquipmentListPersistence.fetchBygetFilmById(filmById);
	}
	
	public List<FilmEquipmentList> getFilmByAppId(long applicationId){
		return filmEquipmentListPersistence.findBygetFilmByAppId(applicationId);
	}
	 public void deleteMultipleFormData_BY_Id(long  applicationId) throws NoSuchFilmEquipmentListException {
		  filmEquipmentListPersistence.removeBygetFilmByAppId(applicationId);
	 }
	 public void deleteMultipleFormData_BY_AppId(long  applicationId) throws NoSuchFilmEquipmentListException {
		  filmEquipmentListPersistence.removeBygetFilmByAppId(applicationId);
	 }
}
