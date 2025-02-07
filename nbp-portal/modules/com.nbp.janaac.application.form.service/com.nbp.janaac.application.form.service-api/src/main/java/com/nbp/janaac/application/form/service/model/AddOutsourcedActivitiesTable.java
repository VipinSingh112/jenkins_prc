/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_out_src_act&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivities
 * @generated
 */
public class AddOutsourcedActivitiesTable
	extends BaseTable<AddOutsourcedActivitiesTable> {

	public static final AddOutsourcedActivitiesTable INSTANCE =
		new AddOutsourcedActivitiesTable();

	public final Column<AddOutsourcedActivitiesTable, Long>
		addOutsourcedActivitiesId = createColumn(
			"addOutsourcedActivitiesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddOutsourcedActivitiesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, String>
		outSourcedActivity = createColumn(
			"outSourcedActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, String> serviceProvider =
		createColumn(
			"serviceProvider", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, String> locationAddress =
		createColumn(
			"locationAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddOutsourcedActivitiesTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddOutsourcedActivitiesTable() {
		super("nbp_janaac_add_out_src_act", AddOutsourcedActivitiesTable::new);
	}

}