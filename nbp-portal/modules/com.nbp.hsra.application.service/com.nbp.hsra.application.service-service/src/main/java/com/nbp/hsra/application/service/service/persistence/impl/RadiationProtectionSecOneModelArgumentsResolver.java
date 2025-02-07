/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.hsra.application.service.model.RadiationProtectionSecOneTable;
import com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneImpl;
import com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from RadiationProtectionSecOne.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneImpl",
		"table.name=nbp_hsra_rad_section_one"
	},
	service = ArgumentsResolver.class
)
public class RadiationProtectionSecOneModelArgumentsResolver
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

		RadiationProtectionSecOneModelImpl radiationProtectionSecOneModelImpl =
			(RadiationProtectionSecOneModelImpl)baseModel;

		long columnBitmask =
			radiationProtectionSecOneModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				radiationProtectionSecOneModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					radiationProtectionSecOneModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(RadiationProtectionSecOnePersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				radiationProtectionSecOneModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return RadiationProtectionSecOneImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return RadiationProtectionSecOneTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		RadiationProtectionSecOneModelImpl radiationProtectionSecOneModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					radiationProtectionSecOneModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					radiationProtectionSecOneModelImpl.getColumnValue(
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
			RadiationProtectionSecOneModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}