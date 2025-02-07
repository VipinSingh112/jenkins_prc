/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStagesTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from SezStatusWFHApplicationStages.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesImpl",
		"table.name=nbp_sez_status_wfh_app_stages"
	},
	service = ArgumentsResolver.class
)
public class SezStatusWFHApplicationStagesModelArgumentsResolver
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

		SezStatusWFHApplicationStagesModelImpl
			sezStatusWFHApplicationStagesModelImpl =
				(SezStatusWFHApplicationStagesModelImpl)baseModel;

		long columnBitmask =
			sezStatusWFHApplicationStagesModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				sezStatusWFHApplicationStagesModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					sezStatusWFHApplicationStagesModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(SezStatusWFHApplicationStagesPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				sezStatusWFHApplicationStagesModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return SezStatusWFHApplicationStagesImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return SezStatusWFHApplicationStagesTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		SezStatusWFHApplicationStagesModelImpl
			sezStatusWFHApplicationStagesModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					sezStatusWFHApplicationStagesModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					sezStatusWFHApplicationStagesModelImpl.getColumnValue(
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
			SezStatusWFHApplicationStagesModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}