/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResourceTable;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceImpl;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AccMediLabPhysicalResource.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceImpl",
		"table.name=nbp_janaac_acc_medi_physical"
	},
	service = ArgumentsResolver.class
)
public class AccMediLabPhysicalResourceModelArgumentsResolver
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

		AccMediLabPhysicalResourceModelImpl
			accMediLabPhysicalResourceModelImpl =
				(AccMediLabPhysicalResourceModelImpl)baseModel;

		long columnBitmask =
			accMediLabPhysicalResourceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				accMediLabPhysicalResourceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					accMediLabPhysicalResourceModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				accMediLabPhysicalResourceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AccMediLabPhysicalResourceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AccMediLabPhysicalResourceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AccMediLabPhysicalResourceModelImpl accMediLabPhysicalResourceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					accMediLabPhysicalResourceModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					accMediLabPhysicalResourceModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}