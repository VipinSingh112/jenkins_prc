/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from FireBrigadeProEquipmentInfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl",
		"table.name=nbp_fire_pro_equipment_info"
	},
	service = ArgumentsResolver.class
)
public class FireBrigadeProEquipmentInfoModelArgumentsResolver
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

		FireBrigadeProEquipmentInfoModelImpl
			fireBrigadeProEquipmentInfoModelImpl =
				(FireBrigadeProEquipmentInfoModelImpl)baseModel;

		long columnBitmask =
			fireBrigadeProEquipmentInfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				fireBrigadeProEquipmentInfoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					fireBrigadeProEquipmentInfoModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(FireBrigadeProEquipmentInfoPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				fireBrigadeProEquipmentInfoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return FireBrigadeProEquipmentInfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return FireBrigadeProEquipmentInfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		FireBrigadeProEquipmentInfoModelImpl
			fireBrigadeProEquipmentInfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					fireBrigadeProEquipmentInfoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					fireBrigadeProEquipmentInfoModelImpl.getColumnValue(
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
			FireBrigadeProEquipmentInfoModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}