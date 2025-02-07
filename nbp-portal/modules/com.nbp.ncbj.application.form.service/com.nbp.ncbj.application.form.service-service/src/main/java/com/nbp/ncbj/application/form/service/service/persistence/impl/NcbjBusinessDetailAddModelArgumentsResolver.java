/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from NcbjBusinessDetailAdd.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddImpl",
		"table.name=nbp_ncbj_business_detail_add"
	},
	service = ArgumentsResolver.class
)
public class NcbjBusinessDetailAddModelArgumentsResolver
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

		NcbjBusinessDetailAddModelImpl ncbjBusinessDetailAddModelImpl =
			(NcbjBusinessDetailAddModelImpl)baseModel;

		long columnBitmask = ncbjBusinessDetailAddModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				ncbjBusinessDetailAddModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					ncbjBusinessDetailAddModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(NcbjBusinessDetailAddPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				ncbjBusinessDetailAddModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return NcbjBusinessDetailAddImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return NcbjBusinessDetailAddTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		NcbjBusinessDetailAddModelImpl ncbjBusinessDetailAddModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					ncbjBusinessDetailAddModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = ncbjBusinessDetailAddModelImpl.getColumnValue(
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
			NcbjBusinessDetailAddModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}