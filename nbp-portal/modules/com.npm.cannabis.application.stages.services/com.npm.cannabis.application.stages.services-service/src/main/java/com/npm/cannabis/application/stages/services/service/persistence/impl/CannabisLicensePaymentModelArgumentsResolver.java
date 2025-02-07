/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePaymentTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisLicensePayment.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentImpl",
		"table.name=nbp_cannabis_license_payment"
	},
	service = ArgumentsResolver.class
)
public class CannabisLicensePaymentModelArgumentsResolver
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

		CannabisLicensePaymentModelImpl cannabisLicensePaymentModelImpl =
			(CannabisLicensePaymentModelImpl)baseModel;

		long columnBitmask = cannabisLicensePaymentModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisLicensePaymentModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisLicensePaymentModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisLicensePaymentModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisLicensePaymentImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisLicensePaymentTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CannabisLicensePaymentModelImpl cannabisLicensePaymentModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisLicensePaymentModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = cannabisLicensePaymentModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}