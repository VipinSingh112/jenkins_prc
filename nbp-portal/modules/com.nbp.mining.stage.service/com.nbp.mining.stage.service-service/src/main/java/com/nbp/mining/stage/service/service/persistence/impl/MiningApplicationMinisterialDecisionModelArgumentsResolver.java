/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecisionTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from MiningApplicationMinisterialDecision.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionImpl",
		"table.name=nbp_mining_mini_dec"
	},
	service = ArgumentsResolver.class
)
public class MiningApplicationMinisterialDecisionModelArgumentsResolver
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

		MiningApplicationMinisterialDecisionModelImpl
			miningApplicationMinisterialDecisionModelImpl =
				(MiningApplicationMinisterialDecisionModelImpl)baseModel;

		long columnBitmask =
			miningApplicationMinisterialDecisionModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				miningApplicationMinisterialDecisionModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					miningApplicationMinisterialDecisionModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(MiningApplicationMinisterialDecisionPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				miningApplicationMinisterialDecisionModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return MiningApplicationMinisterialDecisionImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return MiningApplicationMinisterialDecisionTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		MiningApplicationMinisterialDecisionModelImpl
			miningApplicationMinisterialDecisionModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					miningApplicationMinisterialDecisionModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					miningApplicationMinisterialDecisionModelImpl.
						getColumnValue(columnName);
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
			MiningApplicationMinisterialDecisionModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}