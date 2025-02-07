/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreementTable;
import com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AcquireFinalExecutedAgreement.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl",
		"table.name=nbp_acquire_executed_agree"
	},
	service = ArgumentsResolver.class
)
public class AcquireFinalExecutedAgreementModelArgumentsResolver
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

		AcquireFinalExecutedAgreementModelImpl
			acquireFinalExecutedAgreementModelImpl =
				(AcquireFinalExecutedAgreementModelImpl)baseModel;

		long columnBitmask =
			acquireFinalExecutedAgreementModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				acquireFinalExecutedAgreementModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					acquireFinalExecutedAgreementModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				acquireFinalExecutedAgreementModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AcquireFinalExecutedAgreementImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AcquireFinalExecutedAgreementTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AcquireFinalExecutedAgreementModelImpl
			acquireFinalExecutedAgreementModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					acquireFinalExecutedAgreementModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					acquireFinalExecutedAgreementModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}