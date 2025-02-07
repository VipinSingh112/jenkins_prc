/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.acquire.stages.service.model.AcquireEvaluationTable;
import com.nbp.acquire.stages.service.model.impl.AcquireEvaluationImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireEvaluationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AcquireEvaluation.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.acquire.stages.service.model.impl.AcquireEvaluationImpl",
		"table.name=nbp_acquire_evaluation"
	},
	service = ArgumentsResolver.class
)
public class AcquireEvaluationModelArgumentsResolver
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

		AcquireEvaluationModelImpl acquireEvaluationModelImpl =
			(AcquireEvaluationModelImpl)baseModel;

		long columnBitmask = acquireEvaluationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(acquireEvaluationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					acquireEvaluationModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(acquireEvaluationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AcquireEvaluationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AcquireEvaluationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AcquireEvaluationModelImpl acquireEvaluationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					acquireEvaluationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = acquireEvaluationModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}