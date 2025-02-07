/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddFdaPersonnelFirst.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstImpl",
		"table.name=nbp_janaac_add_fda_per_first"
	},
	service = ArgumentsResolver.class
)
public class AddFdaPersonnelFirstModelArgumentsResolver
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

		AddFdaPersonnelFirstModelImpl addFdaPersonnelFirstModelImpl =
			(AddFdaPersonnelFirstModelImpl)baseModel;

		long columnBitmask = addFdaPersonnelFirstModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addFdaPersonnelFirstModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addFdaPersonnelFirstModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addFdaPersonnelFirstModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddFdaPersonnelFirstImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddFdaPersonnelFirstTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddFdaPersonnelFirstModelImpl addFdaPersonnelFirstModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addFdaPersonnelFirstModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = addFdaPersonnelFirstModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}