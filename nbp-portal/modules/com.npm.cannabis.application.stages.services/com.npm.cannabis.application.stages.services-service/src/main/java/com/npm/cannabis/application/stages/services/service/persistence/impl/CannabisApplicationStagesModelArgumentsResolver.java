/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStagesTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisApplicationStages.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesImpl",
		"table.name=nbp_cannabis_app_stages"
	},
	service = ArgumentsResolver.class
)
public class CannabisApplicationStagesModelArgumentsResolver
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

		CannabisApplicationStagesModelImpl cannabisApplicationStagesModelImpl =
			(CannabisApplicationStagesModelImpl)baseModel;

		long columnBitmask =
			cannabisApplicationStagesModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisApplicationStagesModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisApplicationStagesModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CannabisApplicationStagesPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisApplicationStagesModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisApplicationStagesImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisApplicationStagesTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CannabisApplicationStagesModelImpl cannabisApplicationStagesModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisApplicationStagesModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					cannabisApplicationStagesModelImpl.getColumnValue(
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
			CannabisApplicationStagesModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}