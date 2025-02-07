/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.hsra.application.service.model.AddMedicalPractitionerTable;
import com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerImpl;
import com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AddMedicalPractitioner.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerImpl",
		"table.name=nbp_hsra_medical_practitioner"
	},
	service = ArgumentsResolver.class
)
public class AddMedicalPractitionerModelArgumentsResolver
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

		AddMedicalPractitionerModelImpl addMedicalPractitionerModelImpl =
			(AddMedicalPractitionerModelImpl)baseModel;

		long columnBitmask = addMedicalPractitionerModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				addMedicalPractitionerModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					addMedicalPractitionerModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				addMedicalPractitionerModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AddMedicalPractitionerImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AddMedicalPractitionerTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AddMedicalPractitionerModelImpl addMedicalPractitionerModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					addMedicalPractitionerModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = addMedicalPractitionerModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}