/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyDetailsTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CompanyDetails.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsImpl",
		"table.name=nbp_osi_company_details"
	},
	service = ArgumentsResolver.class
)
public class CompanyDetailsModelArgumentsResolver implements ArgumentsResolver {

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

		CompanyDetailsModelImpl companyDetailsModelImpl =
			(CompanyDetailsModelImpl)baseModel;

		long columnBitmask = companyDetailsModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(companyDetailsModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					companyDetailsModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(companyDetailsModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CompanyDetailsImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CompanyDetailsTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CompanyDetailsModelImpl companyDetailsModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = companyDetailsModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = companyDetailsModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}