/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AccMediLabManagementReqTable;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqImpl;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl;

import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AccMediLabManagementReq.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqImpl",
		"table.name=nbp_janaac_acc_med_manage_req"
	},
	service = ArgumentsResolver.class
)
public class AccMediLabManagementReqModelArgumentsResolver
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

		AccMediLabManagementReqModelImpl accMediLabManagementReqModelImpl =
			(AccMediLabManagementReqModelImpl)baseModel;

		if (!checkColumn ||
			_hasModifiedColumns(
				accMediLabManagementReqModelImpl, columnNames)) {

			return _getValue(
				accMediLabManagementReqModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AccMediLabManagementReqImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AccMediLabManagementReqTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AccMediLabManagementReqModelImpl accMediLabManagementReqModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					accMediLabManagementReqModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = accMediLabManagementReqModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static boolean _hasModifiedColumns(
		AccMediLabManagementReqModelImpl accMediLabManagementReqModelImpl,
		String[] columnNames) {

		if (columnNames.length == 0) {
			return false;
		}

		for (String columnName : columnNames) {
			if (!Objects.equals(
					accMediLabManagementReqModelImpl.getColumnOriginalValue(
						columnName),
					accMediLabManagementReqModelImpl.getColumnValue(
						columnName))) {

				return true;
			}
		}

		return false;
	}

}