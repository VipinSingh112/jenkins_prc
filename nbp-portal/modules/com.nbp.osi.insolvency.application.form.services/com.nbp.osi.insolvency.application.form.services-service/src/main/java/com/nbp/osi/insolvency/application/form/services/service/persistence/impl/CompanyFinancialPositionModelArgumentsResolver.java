/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPositionTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CompanyFinancialPosition.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionImpl",
		"table.name=nbp_osi_comp_financial_pos"
	},
	service = ArgumentsResolver.class
)
public class CompanyFinancialPositionModelArgumentsResolver
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

		CompanyFinancialPositionModelImpl companyFinancialPositionModelImpl =
			(CompanyFinancialPositionModelImpl)baseModel;

		long columnBitmask =
			companyFinancialPositionModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				companyFinancialPositionModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					companyFinancialPositionModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				companyFinancialPositionModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CompanyFinancialPositionImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CompanyFinancialPositionTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CompanyFinancialPositionModelImpl companyFinancialPositionModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					companyFinancialPositionModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = companyFinancialPositionModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}