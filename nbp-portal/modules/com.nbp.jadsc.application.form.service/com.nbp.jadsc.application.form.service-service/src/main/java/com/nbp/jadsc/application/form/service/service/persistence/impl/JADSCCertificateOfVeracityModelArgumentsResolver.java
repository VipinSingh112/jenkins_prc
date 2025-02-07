/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracityTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from JADSCCertificateOfVeracity.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityImpl",
		"table.name=nbp_jadsc_certif_verasity"
	},
	service = ArgumentsResolver.class
)
public class JADSCCertificateOfVeracityModelArgumentsResolver
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

		JADSCCertificateOfVeracityModelImpl
			jadscCertificateOfVeracityModelImpl =
				(JADSCCertificateOfVeracityModelImpl)baseModel;

		long columnBitmask =
			jadscCertificateOfVeracityModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				jadscCertificateOfVeracityModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					jadscCertificateOfVeracityModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(JADSCCertificateOfVeracityPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				jadscCertificateOfVeracityModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return JADSCCertificateOfVeracityImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return JADSCCertificateOfVeracityTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		JADSCCertificateOfVeracityModelImpl jadscCertificateOfVeracityModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					jadscCertificateOfVeracityModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					jadscCertificateOfVeracityModelImpl.getColumnValue(
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
			JADSCCertificateOfVeracityModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}