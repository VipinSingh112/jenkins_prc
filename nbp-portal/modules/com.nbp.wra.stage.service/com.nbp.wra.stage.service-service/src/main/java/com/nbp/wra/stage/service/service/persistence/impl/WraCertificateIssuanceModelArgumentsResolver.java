/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.wra.stage.service.model.WraCertificateIssuanceTable;
import com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceImpl;
import com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from WraCertificateIssuance.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceImpl",
		"table.name=nbp_wra_licence_issu"
	},
	service = ArgumentsResolver.class
)
public class WraCertificateIssuanceModelArgumentsResolver
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

		WraCertificateIssuanceModelImpl wraCertificateIssuanceModelImpl =
			(WraCertificateIssuanceModelImpl)baseModel;

		long columnBitmask = wraCertificateIssuanceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				wraCertificateIssuanceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					wraCertificateIssuanceModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				wraCertificateIssuanceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return WraCertificateIssuanceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return WraCertificateIssuanceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		WraCertificateIssuanceModelImpl wraCertificateIssuanceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					wraCertificateIssuanceModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = wraCertificateIssuanceModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}