/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddressTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CreativeCompanyDirectorInformationAddress.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressImpl",
		"table.name=nbp_creactive_company_dia"
	},
	service = ArgumentsResolver.class
)
public class CreativeCompanyDirectorInformationAddressModelArgumentsResolver
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

		CreativeCompanyDirectorInformationAddressModelImpl
			creativeCompanyDirectorInformationAddressModelImpl =
				(CreativeCompanyDirectorInformationAddressModelImpl)baseModel;

		long columnBitmask =
			creativeCompanyDirectorInformationAddressModelImpl.
				getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				creativeCompanyDirectorInformationAddressModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					creativeCompanyDirectorInformationAddressModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CreativeCompanyDirectorInformationAddressPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				creativeCompanyDirectorInformationAddressModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CreativeCompanyDirectorInformationAddressImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CreativeCompanyDirectorInformationAddressTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		CreativeCompanyDirectorInformationAddressModelImpl
			creativeCompanyDirectorInformationAddressModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					creativeCompanyDirectorInformationAddressModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					creativeCompanyDirectorInformationAddressModelImpl.
						getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

	private static final long _ORDER_BY_COLUMNS_BITMASK;

	static {
		long orderByColumnsBitmask = 0;

		orderByColumnsBitmask |=
			CreativeCompanyDirectorInformationAddressModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}