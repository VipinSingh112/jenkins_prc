/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import com.nbp.janaac.application.form.service.model.AccMediLabTestManageReqTable;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqImpl;
import com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqModelImpl;

import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from AccMediLabTestManageReq.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.nbp.janaac.application.form.service.model.impl.AccMediLabTestManageReqImpl",
		"table.name=nbp_janaac_acc_med_test_manage"
	},
	service = ArgumentsResolver.class
)
public class AccMediLabTestManageReqModelArgumentsResolver
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

		AccMediLabTestManageReqModelImpl accMediLabTestManageReqModelImpl =
			(AccMediLabTestManageReqModelImpl)baseModel;

		if (!checkColumn ||
			_hasModifiedColumns(
				accMediLabTestManageReqModelImpl, columnNames)) {

			return _getValue(
				accMediLabTestManageReqModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AccMediLabTestManageReqImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AccMediLabTestManageReqTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AccMediLabTestManageReqModelImpl accMediLabTestManageReqModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					accMediLabTestManageReqModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = accMediLabTestManageReqModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static boolean _hasModifiedColumns(
		AccMediLabTestManageReqModelImpl accMediLabTestManageReqModelImpl,
		String[] columnNames) {

		if (columnNames.length == 0) {
			return false;
		}

		for (String columnName : columnNames) {
			if (!Objects.equals(
					accMediLabTestManageReqModelImpl.getColumnOriginalValue(
						columnName),
					accMediLabTestManageReqModelImpl.getColumnValue(
						columnName))) {

				return true;
			}
		}

		return false;
	}

}