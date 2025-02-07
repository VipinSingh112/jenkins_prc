/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResourceTable;
import com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceImpl;
import com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AccInsBodiesPhyResource.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceImpl",
		"table.name=nbp_janaac_acc_ins_body_phys"
	},
	service = ArgumentsResolver.class
)
public class AccInsBodiesPhyResourceModelArgumentsResolver
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

		AccInsBodiesPhyResourceModelImpl accInsBodiesPhyResourceModelImpl =
			(AccInsBodiesPhyResourceModelImpl)baseModel;

		long columnBitmask =
			accInsBodiesPhyResourceModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				accInsBodiesPhyResourceModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					accInsBodiesPhyResourceModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				accInsBodiesPhyResourceModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AccInsBodiesPhyResourceImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AccInsBodiesPhyResourceTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AccInsBodiesPhyResourceModelImpl accInsBodiesPhyResourceModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					accInsBodiesPhyResourceModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = accInsBodiesPhyResourceModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}