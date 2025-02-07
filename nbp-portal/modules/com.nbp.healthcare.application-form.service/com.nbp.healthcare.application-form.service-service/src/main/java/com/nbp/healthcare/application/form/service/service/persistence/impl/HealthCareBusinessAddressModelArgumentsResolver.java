/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddressTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from HealthCareBusinessAddress.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressImpl",
		"table.name=nbp_healthcare_bussiness_add"
	},
	service = ArgumentsResolver.class
)
public class HealthCareBusinessAddressModelArgumentsResolver
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

		HealthCareBusinessAddressModelImpl healthCareBusinessAddressModelImpl =
			(HealthCareBusinessAddressModelImpl)baseModel;

		long columnBitmask =
			healthCareBusinessAddressModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				healthCareBusinessAddressModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					healthCareBusinessAddressModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				healthCareBusinessAddressModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return HealthCareBusinessAddressImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return HealthCareBusinessAddressTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		HealthCareBusinessAddressModelImpl healthCareBusinessAddressModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					healthCareBusinessAddressModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					healthCareBusinessAddressModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}