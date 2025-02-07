/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStageTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisApplicationCurrentStage.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageImpl",
		"table.name=nbp_cannabis_stage"
	},
	service = ArgumentsResolver.class
)
public class CannabisApplicationCurrentStageModelArgumentsResolver
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

		CannabisApplicationCurrentStageModelImpl
			cannabisApplicationCurrentStageModelImpl =
				(CannabisApplicationCurrentStageModelImpl)baseModel;

		long columnBitmask =
			cannabisApplicationCurrentStageModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisApplicationCurrentStageModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisApplicationCurrentStageModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CannabisApplicationCurrentStagePersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisApplicationCurrentStageModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisApplicationCurrentStageImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisApplicationCurrentStageTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CannabisApplicationCurrentStageModelImpl
			cannabisApplicationCurrentStageModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisApplicationCurrentStageModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					cannabisApplicationCurrentStageModelImpl.getColumnValue(
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
			CannabisApplicationCurrentStageModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}