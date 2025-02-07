/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportEmployeeInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from TourismBonaWaterSportEmployeeInfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportEmployeeInfoImpl",
		"table.name=nbp_tourism_bona_water_emp"
	},
	service = ArgumentsResolver.class
)
public class TourismBonaWaterSportEmployeeInfoModelArgumentsResolver
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

		TourismBonaWaterSportEmployeeInfoModelImpl
			tourismBonaWaterSportEmployeeInfoModelImpl =
				(TourismBonaWaterSportEmployeeInfoModelImpl)baseModel;

		long columnBitmask =
			tourismBonaWaterSportEmployeeInfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				tourismBonaWaterSportEmployeeInfoModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					tourismBonaWaterSportEmployeeInfoModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				tourismBonaWaterSportEmployeeInfoModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return TourismBonaWaterSportEmployeeInfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return TourismBonaWaterSportEmployeeInfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		TourismBonaWaterSportEmployeeInfoModelImpl
			tourismBonaWaterSportEmployeeInfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					tourismBonaWaterSportEmployeeInfoModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					tourismBonaWaterSportEmployeeInfoModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}