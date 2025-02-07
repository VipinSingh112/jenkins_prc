/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipmentTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from QuarryApplicationMachinesAndEquipment.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.quary.application.form.service.model.impl.QuarryApplicationMachinesAndEquipmentImpl",
		"table.name=nbp_quarry_machines_equip"
	},
	service = ArgumentsResolver.class
)
public class QuarryApplicationMachinesAndEquipmentModelArgumentsResolver
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

		QuarryApplicationMachinesAndEquipmentModelImpl
			quarryApplicationMachinesAndEquipmentModelImpl =
				(QuarryApplicationMachinesAndEquipmentModelImpl)baseModel;

		long columnBitmask =
			quarryApplicationMachinesAndEquipmentModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				quarryApplicationMachinesAndEquipmentModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					quarryApplicationMachinesAndEquipmentModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(QuarryApplicationMachinesAndEquipmentPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				quarryApplicationMachinesAndEquipmentModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return QuarryApplicationMachinesAndEquipmentImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return QuarryApplicationMachinesAndEquipmentTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		QuarryApplicationMachinesAndEquipmentModelImpl
			quarryApplicationMachinesAndEquipmentModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					quarryApplicationMachinesAndEquipmentModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					quarryApplicationMachinesAndEquipmentModelImpl.
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
			QuarryApplicationMachinesAndEquipmentModelImpl.getColumnBitmask(
				"manchineName");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}