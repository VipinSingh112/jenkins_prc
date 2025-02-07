/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAddTable;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddImpl;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from MiicSuspensionOfCetAdd.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddImpl",
		"table.name=nbp_miic_suspension_of_cet"
	},
	service = ArgumentsResolver.class
)
public class MiicSuspensionOfCetAddModelArgumentsResolver
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

		MiicSuspensionOfCetAddModelImpl miicSuspensionOfCetAddModelImpl =
			(MiicSuspensionOfCetAddModelImpl)baseModel;

		long columnBitmask = miicSuspensionOfCetAddModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				miicSuspensionOfCetAddModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					miicSuspensionOfCetAddModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				miicSuspensionOfCetAddModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return MiicSuspensionOfCetAddImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return MiicSuspensionOfCetAddTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		MiicSuspensionOfCetAddModelImpl miicSuspensionOfCetAddModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					miicSuspensionOfCetAddModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = miicSuspensionOfCetAddModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}