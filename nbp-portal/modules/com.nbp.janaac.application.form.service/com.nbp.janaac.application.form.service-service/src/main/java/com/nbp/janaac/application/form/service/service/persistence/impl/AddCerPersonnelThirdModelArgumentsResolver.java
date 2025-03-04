/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddCerPersonnelThird.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdImpl",
		"table.name=nbp_janaac_add_cer_per_third"
	},
	service = ArgumentsResolver.class
)
public class AddCerPersonnelThirdModelArgumentsResolver
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

		AddCerPersonnelThirdModelImpl addCerPersonnelThirdModelImpl =
			(AddCerPersonnelThirdModelImpl)baseModel;

		long columnBitmask = addCerPersonnelThirdModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addCerPersonnelThirdModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addCerPersonnelThirdModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addCerPersonnelThirdModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddCerPersonnelThirdImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddCerPersonnelThirdTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddCerPersonnelThirdModelImpl addCerPersonnelThirdModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addCerPersonnelThirdModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = addCerPersonnelThirdModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}