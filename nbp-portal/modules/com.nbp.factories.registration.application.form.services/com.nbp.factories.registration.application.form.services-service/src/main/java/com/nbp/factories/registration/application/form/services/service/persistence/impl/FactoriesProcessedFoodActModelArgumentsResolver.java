/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodActTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from FactoriesProcessedFoodAct.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActImpl",
		"table.name=nbp_factories_pro_food_act"
	},
	service = ArgumentsResolver.class
)
public class FactoriesProcessedFoodActModelArgumentsResolver
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

		FactoriesProcessedFoodActModelImpl factoriesProcessedFoodActModelImpl =
			(FactoriesProcessedFoodActModelImpl)baseModel;

		long columnBitmask =
			factoriesProcessedFoodActModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				factoriesProcessedFoodActModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					factoriesProcessedFoodActModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(FactoriesProcessedFoodActPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				factoriesProcessedFoodActModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return FactoriesProcessedFoodActImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return FactoriesProcessedFoodActTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		FactoriesProcessedFoodActModelImpl factoriesProcessedFoodActModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					factoriesProcessedFoodActModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					factoriesProcessedFoodActModelImpl.getColumnValue(
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
			FactoriesProcessedFoodActModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}