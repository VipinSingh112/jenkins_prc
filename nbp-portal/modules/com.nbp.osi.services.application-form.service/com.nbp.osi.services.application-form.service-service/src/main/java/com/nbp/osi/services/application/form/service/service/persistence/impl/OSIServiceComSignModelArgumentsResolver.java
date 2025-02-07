/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.services.application.form.service.model.OSIServiceComSignTable;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignImpl;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from OSIServiceComSign.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignImpl",
		"table.name=nbp_osi_services_trus_com_sign"
	},
	service = ArgumentsResolver.class
)
public class OSIServiceComSignModelArgumentsResolver
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

		OSIServiceComSignModelImpl osiServiceComSignModelImpl =
			(OSIServiceComSignModelImpl)baseModel;

		long columnBitmask = osiServiceComSignModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(osiServiceComSignModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					osiServiceComSignModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(osiServiceComSignModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return OSIServiceComSignImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return OSIServiceComSignTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		OSIServiceComSignModelImpl osiServiceComSignModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					osiServiceComSignModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = osiServiceComSignModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}