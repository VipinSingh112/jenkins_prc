/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineationTable;
import com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from MiningFormFiveDelineation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl",
		"table.name=nbp_delineation_area"
	},
	service = ArgumentsResolver.class
)
public class MiningFormFiveDelineationModelArgumentsResolver
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

		MiningFormFiveDelineationModelImpl miningFormFiveDelineationModelImpl =
			(MiningFormFiveDelineationModelImpl)baseModel;

		long columnBitmask =
			miningFormFiveDelineationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				miningFormFiveDelineationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					miningFormFiveDelineationModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				miningFormFiveDelineationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return MiningFormFiveDelineationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return MiningFormFiveDelineationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		MiningFormFiveDelineationModelImpl miningFormFiveDelineationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					miningFormFiveDelineationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					miningFormFiveDelineationModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}