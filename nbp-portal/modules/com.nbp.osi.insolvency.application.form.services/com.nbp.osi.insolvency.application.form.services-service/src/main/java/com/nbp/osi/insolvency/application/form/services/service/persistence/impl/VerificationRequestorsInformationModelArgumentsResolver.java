/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformationTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from VerificationRequestorsInformation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	immediate = true,
	service = {
		VerificationRequestorsInformationModelArgumentsResolver.class,
		ArgumentsResolver.class
	}
)
public class VerificationRequestorsInformationModelArgumentsResolver
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

		VerificationRequestorsInformationModelImpl
			verificationRequestorsInformationModelImpl =
				(VerificationRequestorsInformationModelImpl)baseModel;

		long columnBitmask =
			verificationRequestorsInformationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				verificationRequestorsInformationModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					verificationRequestorsInformationModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				verificationRequestorsInformationModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return VerificationRequestorsInformationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return VerificationRequestorsInformationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		VerificationRequestorsInformationModelImpl
			verificationRequestorsInformationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					verificationRequestorsInformationModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					verificationRequestorsInformationModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}