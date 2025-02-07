/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwoTable;
import com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoImpl;
import com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from DetailOfApplicantSecTwo.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoImpl",
		"table.name=nbp_hsra_detail_applicant"
	},
	service = ArgumentsResolver.class
)
public class DetailOfApplicantSecTwoModelArgumentsResolver
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

		DetailOfApplicantSecTwoModelImpl detailOfApplicantSecTwoModelImpl =
			(DetailOfApplicantSecTwoModelImpl)baseModel;

		long columnBitmask =
			detailOfApplicantSecTwoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				detailOfApplicantSecTwoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					detailOfApplicantSecTwoModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(DetailOfApplicantSecTwoPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				detailOfApplicantSecTwoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return DetailOfApplicantSecTwoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return DetailOfApplicantSecTwoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		DetailOfApplicantSecTwoModelImpl detailOfApplicantSecTwoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					detailOfApplicantSecTwoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = detailOfApplicantSecTwoModelImpl.getColumnValue(
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
			DetailOfApplicantSecTwoModelImpl.getColumnBitmask("createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}