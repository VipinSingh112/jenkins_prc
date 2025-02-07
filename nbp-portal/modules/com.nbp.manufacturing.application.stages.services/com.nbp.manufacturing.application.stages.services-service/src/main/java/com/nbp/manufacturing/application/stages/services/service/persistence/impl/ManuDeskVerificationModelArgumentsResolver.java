/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerificationTable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from ManuDeskVerification.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl",
		"table.name=nbp_manu_desk_verification"
	},
	service = ArgumentsResolver.class
)
public class ManuDeskVerificationModelArgumentsResolver
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

		ManuDeskVerificationModelImpl manuDeskVerificationModelImpl =
			(ManuDeskVerificationModelImpl)baseModel;

		long columnBitmask = manuDeskVerificationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				manuDeskVerificationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					manuDeskVerificationModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				manuDeskVerificationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return ManuDeskVerificationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return ManuDeskVerificationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		ManuDeskVerificationModelImpl manuDeskVerificationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					manuDeskVerificationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = manuDeskVerificationModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}