/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.quary.application.form.service.model.QuarryCurrentStageTable;
import com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from QuarryCurrentStage.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageImpl",
		"table.name=nbp_quarry_stage"
	},
	service = ArgumentsResolver.class
)
public class QuarryCurrentStageModelArgumentsResolver
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

		QuarryCurrentStageModelImpl quarryCurrentStageModelImpl =
			(QuarryCurrentStageModelImpl)baseModel;

		long columnBitmask = quarryCurrentStageModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				quarryCurrentStageModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					quarryCurrentStageModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				quarryCurrentStageModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return QuarryCurrentStageImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return QuarryCurrentStageTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		QuarryCurrentStageModelImpl quarryCurrentStageModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					quarryCurrentStageModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = quarryCurrentStageModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}