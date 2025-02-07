/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmationTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from NcbjPaymentConfirmation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationImpl",
		"table.name=nbp_ncbj_payment_confirm"
	},
	service = ArgumentsResolver.class
)
public class NcbjPaymentConfirmationModelArgumentsResolver
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

		NcbjPaymentConfirmationModelImpl ncbjPaymentConfirmationModelImpl =
			(NcbjPaymentConfirmationModelImpl)baseModel;

		long columnBitmask =
			ncbjPaymentConfirmationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				ncbjPaymentConfirmationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					ncbjPaymentConfirmationModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				ncbjPaymentConfirmationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return NcbjPaymentConfirmationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return NcbjPaymentConfirmationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		NcbjPaymentConfirmationModelImpl ncbjPaymentConfirmationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					ncbjPaymentConfirmationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = ncbjPaymentConfirmationModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}