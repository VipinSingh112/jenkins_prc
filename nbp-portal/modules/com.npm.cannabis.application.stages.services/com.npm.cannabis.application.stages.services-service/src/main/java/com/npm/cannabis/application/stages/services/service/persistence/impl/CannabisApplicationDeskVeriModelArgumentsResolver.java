/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeriTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisApplicationDeskVeri.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriImpl",
		"table.name=nbp_cannabis_desk_verifi"
	},
	service = ArgumentsResolver.class
)
public class CannabisApplicationDeskVeriModelArgumentsResolver
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

		CannabisApplicationDeskVeriModelImpl
			cannabisApplicationDeskVeriModelImpl =
				(CannabisApplicationDeskVeriModelImpl)baseModel;

		long columnBitmask =
			cannabisApplicationDeskVeriModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisApplicationDeskVeriModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisApplicationDeskVeriModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisApplicationDeskVeriModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisApplicationDeskVeriImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisApplicationDeskVeriTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CannabisApplicationDeskVeriModelImpl
			cannabisApplicationDeskVeriModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisApplicationDeskVeriModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					cannabisApplicationDeskVeriModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}