/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.quary.application.form.service.model.QuarryApplicatntInformationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from QuarryApplicatntInformation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationImpl",
		"table.name=nbp_quarry_applicant_info"
	},
	service = ArgumentsResolver.class
)
public class QuarryApplicatntInformationModelArgumentsResolver
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

		QuarryApplicatntInformationModelImpl
			quarryApplicatntInformationModelImpl =
				(QuarryApplicatntInformationModelImpl)baseModel;

		long columnBitmask =
			quarryApplicatntInformationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				quarryApplicatntInformationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					quarryApplicatntInformationModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				quarryApplicatntInformationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return QuarryApplicatntInformationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return QuarryApplicatntInformationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		QuarryApplicatntInformationModelImpl
			quarryApplicatntInformationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					quarryApplicatntInformationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					quarryApplicatntInformationModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}