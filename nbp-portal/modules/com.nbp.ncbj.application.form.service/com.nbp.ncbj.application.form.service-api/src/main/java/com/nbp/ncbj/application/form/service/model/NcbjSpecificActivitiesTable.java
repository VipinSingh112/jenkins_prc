/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_specific_activity&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivities
 * @generated
 */
public class NcbjSpecificActivitiesTable
	extends BaseTable<NcbjSpecificActivitiesTable> {

	public static final NcbjSpecificActivitiesTable INSTANCE =
		new NcbjSpecificActivitiesTable();

	public final Column<NcbjSpecificActivitiesTable, Long>
		ncbjSpecificActivitiesId = createColumn(
			"ncbjSpecificActivitiesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjSpecificActivitiesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, String> specificActivity =
		createColumn(
			"specificActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, String>
		specificActivityNumber = createColumn(
			"specificActivityNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, String>
		specificActivityChecked = createColumn(
			"specificActivityChecked", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSpecificActivitiesTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSpecificActivitiesTable() {
		super("nbp_ncbj_specific_activity", NcbjSpecificActivitiesTable::new);
	}

}