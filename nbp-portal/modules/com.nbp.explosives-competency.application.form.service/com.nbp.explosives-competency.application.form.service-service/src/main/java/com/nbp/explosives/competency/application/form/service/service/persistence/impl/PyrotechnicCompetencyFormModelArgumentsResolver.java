/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyFormTable;
import com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from PyrotechnicCompetencyForm.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormImpl",
		"table.name=nbp_pyrotechnic_competency"
	},
	service = ArgumentsResolver.class
)
public class PyrotechnicCompetencyFormModelArgumentsResolver
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

		PyrotechnicCompetencyFormModelImpl pyrotechnicCompetencyFormModelImpl =
			(PyrotechnicCompetencyFormModelImpl)baseModel;

		long columnBitmask =
			pyrotechnicCompetencyFormModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				pyrotechnicCompetencyFormModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					pyrotechnicCompetencyFormModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(PyrotechnicCompetencyFormPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				pyrotechnicCompetencyFormModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return PyrotechnicCompetencyFormImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return PyrotechnicCompetencyFormTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		PyrotechnicCompetencyFormModelImpl pyrotechnicCompetencyFormModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					pyrotechnicCompetencyFormModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					pyrotechnicCompetencyFormModelImpl.getColumnValue(
						columnName);
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
			PyrotechnicCompetencyFormModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}