/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecisionTable;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionImpl;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from ExplosiveCommisionDecision.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionImpl",
		"table.name=nbp_explosive_commision_decis"
	},
	service = ArgumentsResolver.class
)
public class ExplosiveCommisionDecisionModelArgumentsResolver
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

		ExplosiveCommisionDecisionModelImpl
			explosiveCommisionDecisionModelImpl =
				(ExplosiveCommisionDecisionModelImpl)baseModel;

		long columnBitmask =
			explosiveCommisionDecisionModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				explosiveCommisionDecisionModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					explosiveCommisionDecisionModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(ExplosiveCommisionDecisionPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				explosiveCommisionDecisionModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return ExplosiveCommisionDecisionImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return ExplosiveCommisionDecisionTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		ExplosiveCommisionDecisionModelImpl explosiveCommisionDecisionModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					explosiveCommisionDecisionModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					explosiveCommisionDecisionModelImpl.getColumnValue(
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
			ExplosiveCommisionDecisionModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}