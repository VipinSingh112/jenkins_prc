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
 * The table class for the &quot;nbp_sez_dev_disast_manag_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAdd
 * @generated
 */
public class SezDevDisasterManagementAddTable
	extends BaseTable<SezDevDisasterManagementAddTable> {

	public static final SezDevDisasterManagementAddTable INSTANCE =
		new SezDevDisasterManagementAddTable();

	public final Column<SezDevDisasterManagementAddTable, Long>
		sezDevDisasterManagementAddId = createColumn(
			"sezDevDisasterManagementAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevDisasterManagementAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, String>
		disasterMitigationPlan = createColumn(
			"disasterMitigationPlan", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevDisasterManagementAddTable() {
		super(
			"nbp_sez_dev_disast_manag_add",
			SezDevDisasterManagementAddTable::new);
	}

}