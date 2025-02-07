/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from SezDevGeneralBusinessIfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoImpl",
		"table.name=nbp_sez_dev_gen_business_info"
	},
	service = ArgumentsResolver.class
)
public class SezDevGeneralBusinessIfoModelArgumentsResolver
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

		SezDevGeneralBusinessIfoModelImpl sezDevGeneralBusinessIfoModelImpl =
			(SezDevGeneralBusinessIfoModelImpl)baseModel;

		long columnBitmask =
			sezDevGeneralBusinessIfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				sezDevGeneralBusinessIfoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					sezDevGeneralBusinessIfoModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(SezDevGeneralBusinessIfoPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				sezDevGeneralBusinessIfoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return SezDevGeneralBusinessIfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return SezDevGeneralBusinessIfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		SezDevGeneralBusinessIfoModelImpl sezDevGeneralBusinessIfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					sezDevGeneralBusinessIfoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = sezDevGeneralBusinessIfoModelImpl.getColumnValue(
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
			SezDevGeneralBusinessIfoModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}