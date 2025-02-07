/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeriTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from JtbApplicationDeskVeri.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriImpl",
		"table.name=nbp_jtb_desk_verifi"
	},
	service = ArgumentsResolver.class
)
public class JtbApplicationDeskVeriModelArgumentsResolver
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

		JtbApplicationDeskVeriModelImpl jtbApplicationDeskVeriModelImpl =
			(JtbApplicationDeskVeriModelImpl)baseModel;

		long columnBitmask = jtbApplicationDeskVeriModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				jtbApplicationDeskVeriModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					jtbApplicationDeskVeriModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				jtbApplicationDeskVeriModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return JtbApplicationDeskVeriImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return JtbApplicationDeskVeriTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		JtbApplicationDeskVeriModelImpl jtbApplicationDeskVeriModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					jtbApplicationDeskVeriModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = jtbApplicationDeskVeriModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}