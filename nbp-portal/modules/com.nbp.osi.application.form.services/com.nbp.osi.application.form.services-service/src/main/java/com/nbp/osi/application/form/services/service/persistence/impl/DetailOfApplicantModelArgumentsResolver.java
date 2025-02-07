/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.osi.application.form.services.model.DetailOfApplicantTable;
import com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl;
import com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from DetailOfApplicant.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl",
		"table.name=nbp_osi_applicant_details"
	},
	service = ArgumentsResolver.class
)
public class DetailOfApplicantModelArgumentsResolver
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

		DetailOfApplicantModelImpl detailOfApplicantModelImpl =
			(DetailOfApplicantModelImpl)baseModel;

		long columnBitmask = detailOfApplicantModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(detailOfApplicantModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					detailOfApplicantModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(detailOfApplicantModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return DetailOfApplicantImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return DetailOfApplicantTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		DetailOfApplicantModelImpl detailOfApplicantModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					detailOfApplicantModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = detailOfApplicantModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}