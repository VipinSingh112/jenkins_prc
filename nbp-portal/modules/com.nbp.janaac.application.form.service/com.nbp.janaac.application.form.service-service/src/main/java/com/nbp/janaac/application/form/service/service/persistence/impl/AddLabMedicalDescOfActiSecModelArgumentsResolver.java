/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddLabMedicalDescOfActiSec.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecImpl",
		"table.name=nbp_janaac_add_lab_med_dec_sec"
	},
	service = ArgumentsResolver.class
)
public class AddLabMedicalDescOfActiSecModelArgumentsResolver
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

		AddLabMedicalDescOfActiSecModelImpl
			addLabMedicalDescOfActiSecModelImpl =
				(AddLabMedicalDescOfActiSecModelImpl)baseModel;

		long columnBitmask =
			addLabMedicalDescOfActiSecModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addLabMedicalDescOfActiSecModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addLabMedicalDescOfActiSecModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addLabMedicalDescOfActiSecModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddLabMedicalDescOfActiSecImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddLabMedicalDescOfActiSecTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddLabMedicalDescOfActiSecModelImpl addLabMedicalDescOfActiSecModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addLabMedicalDescOfActiSecModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					addLabMedicalDescOfActiSecModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}