/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_emp_safety_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAdd
 * @generated
 */
public class SezDevEmployeeSafetyInfoAddTable
	extends BaseTable<SezDevEmployeeSafetyInfoAddTable> {

	public static final SezDevEmployeeSafetyInfoAddTable INSTANCE =
		new SezDevEmployeeSafetyInfoAddTable();

	public final Column<SezDevEmployeeSafetyInfoAddTable, Long>
		sezDevEmployeeSafetyInfoAddId = createColumn(
			"sezDevEmployeeSafetyInfoAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, String>
		securityMeasures = createColumn(
			"securityMeasures", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeSafetyInfoAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevEmployeeSafetyInfoAddTable() {
		super(
			"nbp_sez_dev_emp_safety_add",
			SezDevEmployeeSafetyInfoAddTable::new);
	}

}