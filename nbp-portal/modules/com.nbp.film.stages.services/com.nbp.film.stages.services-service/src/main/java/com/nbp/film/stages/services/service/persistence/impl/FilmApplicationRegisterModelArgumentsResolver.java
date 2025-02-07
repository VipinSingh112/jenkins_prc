/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.film.stages.services.model.FilmApplicationRegisterTable;
import com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl;
import com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from FilmApplicationRegister.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl",
		"table.name=nbp_film_register"
	},
	service = ArgumentsResolver.class
)
public class FilmApplicationRegisterModelArgumentsResolver
	implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		FilmApplicationRegisterModelImpl filmApplicationRegisterModelImpl =
			(FilmApplicationRegisterModelImpl)baseModel;

		long columnBitmask =
			filmApplicationRegisterModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				filmApplicationRegisterModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					filmApplicationRegisterModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				filmApplicationRegisterModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return FilmApplicationRegisterImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return FilmApplicationRegisterTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		FilmApplicationRegisterModelImpl filmApplicationRegisterModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					filmApplicationRegisterModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = filmApplicationRegisterModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}