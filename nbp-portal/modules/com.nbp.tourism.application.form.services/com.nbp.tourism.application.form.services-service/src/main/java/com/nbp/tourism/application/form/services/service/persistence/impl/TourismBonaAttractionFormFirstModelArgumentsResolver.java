/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from TourismBonaAttractionFormFirst.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstImpl",
		"table.name=nbp_tourism_bona_attraction_ff"
	},
	service = ArgumentsResolver.class
)
public class TourismBonaAttractionFormFirstModelArgumentsResolver
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

		TourismBonaAttractionFormFirstModelImpl
			tourismBonaAttractionFormFirstModelImpl =
				(TourismBonaAttractionFormFirstModelImpl)baseModel;

		long columnBitmask =
			tourismBonaAttractionFormFirstModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				tourismBonaAttractionFormFirstModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					tourismBonaAttractionFormFirstModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(TourismBonaAttractionFormFirstPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				tourismBonaAttractionFormFirstModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return TourismBonaAttractionFormFirstImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return TourismBonaAttractionFormFirstTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		TourismBonaAttractionFormFirstModelImpl
			tourismBonaAttractionFormFirstModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					tourismBonaAttractionFormFirstModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					tourismBonaAttractionFormFirstModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

	private static final long _ORDER_BY_COLUMNS_BITMASK;

	static {
		long orderByColumnsBitmask = 0;

		orderByColumnsBitmask |=
			TourismBonaAttractionFormFirstModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}