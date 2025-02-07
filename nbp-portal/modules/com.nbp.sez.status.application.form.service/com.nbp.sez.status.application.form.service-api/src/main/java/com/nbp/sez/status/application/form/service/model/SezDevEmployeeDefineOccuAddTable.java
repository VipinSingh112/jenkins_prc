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
 * The table class for the &quot;nbp_sez_dev_emp_define_occ_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeDefineOccuAdd
 * @generated
 */
public class SezDevEmployeeDefineOccuAddTable
	extends BaseTable<SezDevEmployeeDefineOccuAddTable> {

	public static final SezDevEmployeeDefineOccuAddTable INSTANCE =
		new SezDevEmployeeDefineOccuAddTable();

	public final Column<SezDevEmployeeDefineOccuAddTable, Long>
		sezDevEmployeeDefineOccuAddId = createColumn(
			"sezDevEmployeeDefineOccuAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevEmployeeDefineOccuAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, String>
		occuSafetySystem = createColumn(
			"occuSafetySystem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmployeeDefineOccuAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevEmployeeDefineOccuAddTable() {
		super(
			"nbp_sez_dev_emp_define_occ_add",
			SezDevEmployeeDefineOccuAddTable::new);
	}

}