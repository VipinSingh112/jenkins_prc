/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.film.application.form.service.model.FilmApplicationPaymentTable;
import com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentImpl;
import com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from FilmApplicationPayment.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentImpl",
		"table.name=nbp_film_application_payment"
	},
	service = ArgumentsResolver.class
)
public class FilmApplicationPaymentModelArgumentsResolver
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

		FilmApplicationPaymentModelImpl filmApplicationPaymentModelImpl =
			(FilmApplicationPaymentModelImpl)baseModel;

		long columnBitmask = filmApplicationPaymentModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				filmApplicationPaymentModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					filmApplicationPaymentModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				filmApplicationPaymentModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return FilmApplicationPaymentImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return FilmApplicationPaymentTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		FilmApplicationPaymentModelImpl filmApplicationPaymentModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					filmApplicationPaymentModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = filmApplicationPaymentModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}