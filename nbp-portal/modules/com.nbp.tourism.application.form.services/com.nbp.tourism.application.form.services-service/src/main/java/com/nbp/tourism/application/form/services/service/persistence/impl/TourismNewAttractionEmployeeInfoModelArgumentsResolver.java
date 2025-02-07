/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from TourismNewAttractionEmployeeInfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionEmployeeInfoImpl",
		"table.name=nbp_tourism_new_attrac_emp"
	},
	service = ArgumentsResolver.class
)
public class TourismNewAttractionEmployeeInfoModelArgumentsResolver
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

		TourismNewAttractionEmployeeInfoModelImpl
			tourismNewAttractionEmployeeInfoModelImpl =
				(TourismNewAttractionEmployeeInfoModelImpl)baseModel;

		long columnBitmask =
			tourismNewAttractionEmployeeInfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				tourismNewAttractionEmployeeInfoModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					tourismNewAttractionEmployeeInfoModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				tourismNewAttractionEmployeeInfoModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return TourismNewAttractionEmployeeInfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return TourismNewAttractionEmployeeInfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		TourismNewAttractionEmployeeInfoModelImpl
			tourismNewAttractionEmployeeInfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					tourismNewAttractionEmployeeInfoModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					tourismNewAttractionEmployeeInfoModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}