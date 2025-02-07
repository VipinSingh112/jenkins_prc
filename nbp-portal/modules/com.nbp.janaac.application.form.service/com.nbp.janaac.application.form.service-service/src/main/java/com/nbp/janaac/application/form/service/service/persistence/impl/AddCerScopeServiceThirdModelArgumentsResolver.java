/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddCerScopeServiceThird.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdImpl",
		"table.name=nbp_janaac_add_scope_ser_third"
	},
	service = ArgumentsResolver.class
)
public class AddCerScopeServiceThirdModelArgumentsResolver
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

		AddCerScopeServiceThirdModelImpl addCerScopeServiceThirdModelImpl =
			(AddCerScopeServiceThirdModelImpl)baseModel;

		long columnBitmask =
			addCerScopeServiceThirdModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addCerScopeServiceThirdModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addCerScopeServiceThirdModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addCerScopeServiceThirdModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddCerScopeServiceThirdImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddCerScopeServiceThirdTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddCerScopeServiceThirdModelImpl addCerScopeServiceThirdModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addCerScopeServiceThirdModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = addCerScopeServiceThirdModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}