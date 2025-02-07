/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuanceTable;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceImpl;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from HSRAApplicationLicenseIssuance.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceImpl",
		"table.name=nbp_hsra_lic_iss"
	},
	service = ArgumentsResolver.class
)
public class HSRAApplicationLicenseIssuanceModelArgumentsResolver
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

		HSRAApplicationLicenseIssuanceModelImpl
			hsraApplicationLicenseIssuanceModelImpl =
				(HSRAApplicationLicenseIssuanceModelImpl)baseModel;

		long columnBitmask =
			hsraApplicationLicenseIssuanceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				hsraApplicationLicenseIssuanceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					hsraApplicationLicenseIssuanceModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(HSRAApplicationLicenseIssuancePersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				hsraApplicationLicenseIssuanceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return HSRAApplicationLicenseIssuanceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return HSRAApplicationLicenseIssuanceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		HSRAApplicationLicenseIssuanceModelImpl
			hsraApplicationLicenseIssuanceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					hsraApplicationLicenseIssuanceModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					hsraApplicationLicenseIssuanceModelImpl.getColumnValue(
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
			HSRAApplicationLicenseIssuanceModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}