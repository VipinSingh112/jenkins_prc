/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionOneAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from NcbjSectionOneAdd.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddImpl",
		"table.name=nbp_ncbj_section_one_add"
	},
	service = ArgumentsResolver.class
)
public class NcbjSectionOneAddModelArgumentsResolver
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

		NcbjSectionOneAddModelImpl ncbjSectionOneAddModelImpl =
			(NcbjSectionOneAddModelImpl)baseModel;

		long columnBitmask = ncbjSectionOneAddModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(ncbjSectionOneAddModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					ncbjSectionOneAddModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(NcbjSectionOneAddPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(ncbjSectionOneAddModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return NcbjSectionOneAddImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return NcbjSectionOneAddTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		NcbjSectionOneAddModelImpl ncbjSectionOneAddModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					ncbjSectionOneAddModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = ncbjSectionOneAddModelImpl.getColumnValue(
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

		orderByColumnsBitmask |= NcbjSectionOneAddModelImpl.getColumnBitmask(
			"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}