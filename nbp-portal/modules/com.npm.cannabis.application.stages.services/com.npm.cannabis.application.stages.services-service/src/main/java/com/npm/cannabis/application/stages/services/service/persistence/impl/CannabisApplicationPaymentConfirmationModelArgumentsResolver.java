/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmationTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisApplicationPaymentConfirmation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationPaymentConfirmationImpl",
		"table.name=nbp_cannabis_payment_confirm"
	},
	service = ArgumentsResolver.class
)
public class CannabisApplicationPaymentConfirmationModelArgumentsResolver
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

		CannabisApplicationPaymentConfirmationModelImpl
			cannabisApplicationPaymentConfirmationModelImpl =
				(CannabisApplicationPaymentConfirmationModelImpl)baseModel;

		long columnBitmask =
			cannabisApplicationPaymentConfirmationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisApplicationPaymentConfirmationModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisApplicationPaymentConfirmationModelImpl.
						getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisApplicationPaymentConfirmationModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisApplicationPaymentConfirmationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisApplicationPaymentConfirmationTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		CannabisApplicationPaymentConfirmationModelImpl
			cannabisApplicationPaymentConfirmationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisApplicationPaymentConfirmationModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					cannabisApplicationPaymentConfirmationModelImpl.
						getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}