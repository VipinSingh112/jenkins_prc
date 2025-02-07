/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuanceTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from SezStatusLicenseIssuance.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceImpl",
		"table.name=nbp_sez_status_licence_issu"
	},
	service = ArgumentsResolver.class
)
public class SezStatusLicenseIssuanceModelArgumentsResolver
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

		SezStatusLicenseIssuanceModelImpl sezStatusLicenseIssuanceModelImpl =
			(SezStatusLicenseIssuanceModelImpl)baseModel;

		long columnBitmask =
			sezStatusLicenseIssuanceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				sezStatusLicenseIssuanceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					sezStatusLicenseIssuanceModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				sezStatusLicenseIssuanceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return SezStatusLicenseIssuanceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return SezStatusLicenseIssuanceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		SezStatusLicenseIssuanceModelImpl sezStatusLicenseIssuanceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					sezStatusLicenseIssuanceModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = sezStatusLicenseIssuanceModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}