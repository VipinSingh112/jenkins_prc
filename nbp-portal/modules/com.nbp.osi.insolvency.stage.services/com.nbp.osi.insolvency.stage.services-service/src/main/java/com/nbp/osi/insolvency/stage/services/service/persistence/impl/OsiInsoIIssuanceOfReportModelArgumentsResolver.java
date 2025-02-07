/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReportTable;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportImpl;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from OsiInsoIIssuanceOfReport.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportImpl",
		"table.name=nbp_osi_insol_issu_of_report"
	},
	service = ArgumentsResolver.class
)
public class OsiInsoIIssuanceOfReportModelArgumentsResolver
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

		OsiInsoIIssuanceOfReportModelImpl osiInsoIIssuanceOfReportModelImpl =
			(OsiInsoIIssuanceOfReportModelImpl)baseModel;

		long columnBitmask =
			osiInsoIIssuanceOfReportModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				osiInsoIIssuanceOfReportModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					osiInsoIIssuanceOfReportModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				osiInsoIIssuanceOfReportModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return OsiInsoIIssuanceOfReportImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return OsiInsoIIssuanceOfReportTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		OsiInsoIIssuanceOfReportModelImpl osiInsoIIssuanceOfReportModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					osiInsoIIssuanceOfReportModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = osiInsoIIssuanceOfReportModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}