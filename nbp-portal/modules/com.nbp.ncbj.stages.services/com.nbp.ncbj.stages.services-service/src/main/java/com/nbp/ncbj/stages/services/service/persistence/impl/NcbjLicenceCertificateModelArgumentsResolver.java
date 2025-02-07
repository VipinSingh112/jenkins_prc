/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificateTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from NcbjLicenceCertificate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl",
		"table.name=nbp_ncbj_licence_certificate"
	},
	service = ArgumentsResolver.class
)
public class NcbjLicenceCertificateModelArgumentsResolver
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

		NcbjLicenceCertificateModelImpl ncbjLicenceCertificateModelImpl =
			(NcbjLicenceCertificateModelImpl)baseModel;

		long columnBitmask = ncbjLicenceCertificateModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				ncbjLicenceCertificateModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					ncbjLicenceCertificateModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				ncbjLicenceCertificateModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return NcbjLicenceCertificateImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return NcbjLicenceCertificateTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		NcbjLicenceCertificateModelImpl ncbjLicenceCertificateModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					ncbjLicenceCertificateModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = ncbjLicenceCertificateModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}