/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAuthorizedAgentTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CannabisApplicationCompanyAuthorizedAgent.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAuthorizedAgentImpl",
		"table.name=nbp_cannabis_caa"
	},
	service = ArgumentsResolver.class
)
public class CannabisApplicationCompanyAuthorizedAgentModelArgumentsResolver
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

		CannabisApplicationCompanyAuthorizedAgentModelImpl
			cannabisApplicationCompanyAuthorizedAgentModelImpl =
				(CannabisApplicationCompanyAuthorizedAgentModelImpl)baseModel;

		long columnBitmask =
			cannabisApplicationCompanyAuthorizedAgentModelImpl.
				getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cannabisApplicationCompanyAuthorizedAgentModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cannabisApplicationCompanyAuthorizedAgentModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CannabisApplicationCompanyAuthorizedAgentPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cannabisApplicationCompanyAuthorizedAgentModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CannabisApplicationCompanyAuthorizedAgentImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CannabisApplicationCompanyAuthorizedAgentTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		CannabisApplicationCompanyAuthorizedAgentModelImpl
			cannabisApplicationCompanyAuthorizedAgentModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cannabisApplicationCompanyAuthorizedAgentModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					cannabisApplicationCompanyAuthorizedAgentModelImpl.
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
			CannabisApplicationCompanyAuthorizedAgentModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}