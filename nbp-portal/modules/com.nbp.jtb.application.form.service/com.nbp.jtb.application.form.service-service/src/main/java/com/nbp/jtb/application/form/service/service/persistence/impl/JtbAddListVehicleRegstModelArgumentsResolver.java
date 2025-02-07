/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegstTable;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from JtbAddListVehicleRegst.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstImpl",
		"table.name=nbp_jtb_list_value_regst"
	},
	service = ArgumentsResolver.class
)
public class JtbAddListVehicleRegstModelArgumentsResolver
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

		JtbAddListVehicleRegstModelImpl jtbAddListVehicleRegstModelImpl =
			(JtbAddListVehicleRegstModelImpl)baseModel;

		long columnBitmask = jtbAddListVehicleRegstModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				jtbAddListVehicleRegstModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					jtbAddListVehicleRegstModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(JtbAddListVehicleRegstPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				jtbAddListVehicleRegstModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return JtbAddListVehicleRegstImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return JtbAddListVehicleRegstTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		JtbAddListVehicleRegstModelImpl jtbAddListVehicleRegstModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					jtbAddListVehicleRegstModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = jtbAddListVehicleRegstModelImpl.getColumnValue(
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
			JtbAddListVehicleRegstModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}