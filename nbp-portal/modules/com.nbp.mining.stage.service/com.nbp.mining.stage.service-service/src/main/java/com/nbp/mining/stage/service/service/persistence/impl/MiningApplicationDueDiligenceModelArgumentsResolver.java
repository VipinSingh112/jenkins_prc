/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.mining.stage.service.model.MiningApplicationDueDiligenceTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from MiningApplicationDueDiligence.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceImpl",
		"table.name=nbp_mining_due_dili"
	},
	service = ArgumentsResolver.class
)
public class MiningApplicationDueDiligenceModelArgumentsResolver
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

		MiningApplicationDueDiligenceModelImpl
			miningApplicationDueDiligenceModelImpl =
				(MiningApplicationDueDiligenceModelImpl)baseModel;

		long columnBitmask =
			miningApplicationDueDiligenceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				miningApplicationDueDiligenceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					miningApplicationDueDiligenceModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(MiningApplicationDueDiligencePersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				miningApplicationDueDiligenceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return MiningApplicationDueDiligenceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return MiningApplicationDueDiligenceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		MiningApplicationDueDiligenceModelImpl
			miningApplicationDueDiligenceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					miningApplicationDueDiligenceModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					miningApplicationDueDiligenceModelImpl.getColumnValue(
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
			MiningApplicationDueDiligenceModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}