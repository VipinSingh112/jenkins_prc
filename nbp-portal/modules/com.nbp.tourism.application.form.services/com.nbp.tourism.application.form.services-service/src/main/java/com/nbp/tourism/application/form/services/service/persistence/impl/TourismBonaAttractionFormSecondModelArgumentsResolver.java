/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecondTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from TourismBonaAttractionFormSecond.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondImpl",
		"table.name=nbp_tourism_bona_attraction_fs"
	},
	service = ArgumentsResolver.class
)
public class TourismBonaAttractionFormSecondModelArgumentsResolver
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

		TourismBonaAttractionFormSecondModelImpl
			tourismBonaAttractionFormSecondModelImpl =
				(TourismBonaAttractionFormSecondModelImpl)baseModel;

		long columnBitmask =
			tourismBonaAttractionFormSecondModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				tourismBonaAttractionFormSecondModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					tourismBonaAttractionFormSecondModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(TourismBonaAttractionFormSecondPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				tourismBonaAttractionFormSecondModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return TourismBonaAttractionFormSecondImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return TourismBonaAttractionFormSecondTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		TourismBonaAttractionFormSecondModelImpl
			tourismBonaAttractionFormSecondModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					tourismBonaAttractionFormSecondModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					tourismBonaAttractionFormSecondModelImpl.getColumnValue(
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
			TourismBonaAttractionFormSecondModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}