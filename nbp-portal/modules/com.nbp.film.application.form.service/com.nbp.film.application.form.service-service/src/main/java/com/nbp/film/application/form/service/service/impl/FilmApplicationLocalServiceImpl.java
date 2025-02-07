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

import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationException;
import com.nbp.film.application.form.service.model.FilmApplication;
import com.nbp.film.application.form.service.model.FilmApplicationTable;
import com.nbp.film.application.form.service.service.base.FilmApplicationLocalServiceBaseImpl;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.film.application.form.service.model.FilmApplication",
	service = AopService.class
)
public class FilmApplicationLocalServiceImpl
	extends FilmApplicationLocalServiceBaseImpl {
	public List<FilmApplication> getFilmByS_U(int status, long userId) {
		return filmApplicationPersistence.findBygetFilmApplicationByStatusUser(status, userId);
	}
	
	public List<FilmApplication> getFilmByStatus(int status){
		return filmApplicationPersistence.findBygetFilmByStatus(status);
	}
	public FilmApplication getFilmByAppNo(String filmApplicationNumber) throws NoSuchFilmApplicationException{
		return filmApplicationPersistence.findBygetFilmByAppNo(filmApplicationNumber);
	}
	public FilmApplication getFilmByCaseId(String caseId) throws NoSuchFilmApplicationException{
		return filmApplicationPersistence.findBygetFilmByCaseId(caseId);
	}
	public List<String> getFilmDistinctCategory(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(FilmApplicationTable.INSTANCE.projectType).from(FilmApplicationTable.INSTANCE);
		return dslQuery(query);
	}
}
