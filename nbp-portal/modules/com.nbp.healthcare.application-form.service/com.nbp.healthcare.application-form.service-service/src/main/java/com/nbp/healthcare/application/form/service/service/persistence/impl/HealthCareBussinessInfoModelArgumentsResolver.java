/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfoTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from HealthCareBussinessInfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoImpl",
		"table.name=nbp_healthcare_bussiness"
	},
	service = ArgumentsResolver.class
)
public class HealthCareBussinessInfoModelArgumentsResolver
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

		HealthCareBussinessInfoModelImpl healthCareBussinessInfoModelImpl =
			(HealthCareBussinessInfoModelImpl)baseModel;

		long columnBitmask =
			healthCareBussinessInfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				healthCareBussinessInfoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					healthCareBussinessInfoModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				healthCareBussinessInfoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return HealthCareBussinessInfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return HealthCareBussinessInfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		HealthCareBussinessInfoModelImpl healthCareBussinessInfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					healthCareBussinessInfoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = healthCareBussinessInfoModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}