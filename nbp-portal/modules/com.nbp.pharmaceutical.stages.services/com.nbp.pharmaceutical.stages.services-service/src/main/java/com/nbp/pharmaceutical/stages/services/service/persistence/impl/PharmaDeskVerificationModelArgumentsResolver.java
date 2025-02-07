/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerificationTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from PharmaDeskVerification.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationImpl",
		"table.name=nbp_pharma_desk_verification"
	},
	service = ArgumentsResolver.class
)
public class PharmaDeskVerificationModelArgumentsResolver
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

		PharmaDeskVerificationModelImpl pharmaDeskVerificationModelImpl =
			(PharmaDeskVerificationModelImpl)baseModel;

		long columnBitmask = pharmaDeskVerificationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				pharmaDeskVerificationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					pharmaDeskVerificationModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				pharmaDeskVerificationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return PharmaDeskVerificationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return PharmaDeskVerificationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		PharmaDeskVerificationModelImpl pharmaDeskVerificationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					pharmaDeskVerificationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = pharmaDeskVerificationModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}