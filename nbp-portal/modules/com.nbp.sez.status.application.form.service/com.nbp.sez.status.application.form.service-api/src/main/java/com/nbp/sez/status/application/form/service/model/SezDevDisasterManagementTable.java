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
 * The table class for the &quot;nbp_sez_dev_disaster_manage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagement
 * @generated
 */
public class SezDevDisasterManagementTable
	extends BaseTable<SezDevDisasterManagementTable> {

	public static final SezDevDisasterManagementTable INSTANCE =
		new SezDevDisasterManagementTable();

	public final Column<SezDevDisasterManagementTable, Long>
		sezDevDisasterManagementId = createColumn(
			"sezDevDisasterManagementId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevDisasterManagementTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, String>
		disasterManagement = createColumn(
			"disasterManagement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevDisasterManagementTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevDisasterManagementTable() {
		super(
			"nbp_sez_dev_disaster_manage", SezDevDisasterManagementTable::new);
	}

}