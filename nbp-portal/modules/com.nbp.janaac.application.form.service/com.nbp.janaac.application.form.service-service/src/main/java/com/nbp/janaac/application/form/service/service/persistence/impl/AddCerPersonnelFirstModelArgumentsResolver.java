/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddCerPersonnelFirst.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstImpl",
		"table.name=nbp_janaac_add_cer_per_first"
	},
	service = ArgumentsResolver.class
)
public class AddCerPersonnelFirstModelArgumentsResolver
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

		AddCerPersonnelFirstModelImpl addCerPersonnelFirstModelImpl =
			(AddCerPersonnelFirstModelImpl)baseModel;

		long columnBitmask = addCerPersonnelFirstModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addCerPersonnelFirstModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addCerPersonnelFirstModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addCerPersonnelFirstModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddCerPersonnelFirstImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddCerPersonnelFirstTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddCerPersonnelFirstModelImpl addCerPersonnelFirstModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addCerPersonnelFirstModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = addCerPersonnelFirstModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}