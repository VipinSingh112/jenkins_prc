/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from SezOccupanteDeveloperUndertakingInfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoImpl",
		"table.name=nbp_sez_occ_dev_under_info"
	},
	service = ArgumentsResolver.class
)
public class SezOccupanteDeveloperUndertakingInfoModelArgumentsResolver
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

		SezOccupanteDeveloperUndertakingInfoModelImpl
			sezOccupanteDeveloperUndertakingInfoModelImpl =
				(SezOccupanteDeveloperUndertakingInfoModelImpl)baseModel;

		long columnBitmask =
			sezOccupanteDeveloperUndertakingInfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				sezOccupanteDeveloperUndertakingInfoModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					sezOccupanteDeveloperUndertakingInfoModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(SezOccupanteDeveloperUndertakingInfoPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				sezOccupanteDeveloperUndertakingInfoModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return SezOccupanteDeveloperUndertakingInfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return SezOccupanteDeveloperUndertakingInfoTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		SezOccupanteDeveloperUndertakingInfoModelImpl
			sezOccupanteDeveloperUndertakingInfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					sezOccupanteDeveloperUndertakingInfoModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					sezOccupanteDeveloperUndertakingInfoModelImpl.
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
			SezOccupanteDeveloperUndertakingInfoModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}