/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.agriculture.stages.services.model.AgriculturePermitTable;
import com.nbp.agriculture.stages.services.model.impl.AgriculturePermitImpl;
import com.nbp.agriculture.stages.services.model.impl.AgriculturePermitModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AgriculturePermit.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.agriculture.stages.services.model.impl.AgriculturePermitImpl",
		"table.name=nbp_agriculture_permit"
	},
	service = ArgumentsResolver.class
)
public class AgriculturePermitModelArgumentsResolver
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

		AgriculturePermitModelImpl agriculturePermitModelImpl =
			(AgriculturePermitModelImpl)baseModel;

		long columnBitmask = agriculturePermitModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(agriculturePermitModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					agriculturePermitModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(agriculturePermitModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AgriculturePermitImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AgriculturePermitTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AgriculturePermitModelImpl agriculturePermitModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					agriculturePermitModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = agriculturePermitModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}