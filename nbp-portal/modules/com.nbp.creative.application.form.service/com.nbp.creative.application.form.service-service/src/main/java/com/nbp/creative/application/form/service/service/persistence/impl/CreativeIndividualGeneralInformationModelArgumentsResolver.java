/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CreativeIndividualGeneralInformation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationImpl",
		"table.name=nbp_creative_indi_general_info"
	},
	service = ArgumentsResolver.class
)
public class CreativeIndividualGeneralInformationModelArgumentsResolver
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

		CreativeIndividualGeneralInformationModelImpl
			creativeIndividualGeneralInformationModelImpl =
				(CreativeIndividualGeneralInformationModelImpl)baseModel;

		long columnBitmask =
			creativeIndividualGeneralInformationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				creativeIndividualGeneralInformationModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					creativeIndividualGeneralInformationModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CreativeIndividualGeneralInformationPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				creativeIndividualGeneralInformationModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CreativeIndividualGeneralInformationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CreativeIndividualGeneralInformationTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		CreativeIndividualGeneralInformationModelImpl
			creativeIndividualGeneralInformationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					creativeIndividualGeneralInformationModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					creativeIndividualGeneralInformationModelImpl.
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
			CreativeIndividualGeneralInformationModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}