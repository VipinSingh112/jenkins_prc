/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from OsiServicesApplicantinfo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoImpl",
		"table.name=nbp_osi_services_appli_info"
	},
	service = ArgumentsResolver.class
)
public class OsiServicesApplicantinfoModelArgumentsResolver
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

		OsiServicesApplicantinfoModelImpl osiServicesApplicantinfoModelImpl =
			(OsiServicesApplicantinfoModelImpl)baseModel;

		long columnBitmask =
			osiServicesApplicantinfoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				osiServicesApplicantinfoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					osiServicesApplicantinfoModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				osiServicesApplicantinfoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return OsiServicesApplicantinfoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return OsiServicesApplicantinfoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		OsiServicesApplicantinfoModelImpl osiServicesApplicantinfoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					osiServicesApplicantinfoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = osiServicesApplicantinfoModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}