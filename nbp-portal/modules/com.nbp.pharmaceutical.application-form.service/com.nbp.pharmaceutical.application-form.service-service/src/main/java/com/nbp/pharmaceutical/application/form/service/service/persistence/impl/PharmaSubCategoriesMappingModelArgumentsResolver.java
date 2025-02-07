/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMappingTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from PharmaSubCategoriesMapping.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingImpl",
		"table.name=nbp_pharma_sub_categories"
	},
	service = ArgumentsResolver.class
)
public class PharmaSubCategoriesMappingModelArgumentsResolver
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

		PharmaSubCategoriesMappingModelImpl
			pharmaSubCategoriesMappingModelImpl =
				(PharmaSubCategoriesMappingModelImpl)baseModel;

		long columnBitmask =
			pharmaSubCategoriesMappingModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				pharmaSubCategoriesMappingModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					pharmaSubCategoriesMappingModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				pharmaSubCategoriesMappingModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return PharmaSubCategoriesMappingImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return PharmaSubCategoriesMappingTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		PharmaSubCategoriesMappingModelImpl pharmaSubCategoriesMappingModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					pharmaSubCategoriesMappingModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					pharmaSubCategoriesMappingModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}