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
 * The table class for the &quot;nbp_janaac_add_lab_res_req_fir&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirst
 * @generated
 */
public class AddLabResourceReqFirstTable
	extends BaseTable<AddLabResourceReqFirstTable> {

	public static final AddLabResourceReqFirstTable INSTANCE =
		new AddLabResourceReqFirstTable();

	public final Column<AddLabResourceReqFirstTable, Long>
		addLabResourceReqFirstId = createColumn(
			"addLabResourceReqFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabResourceReqFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> num = createColumn(
		"num", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> activities =
		createColumn(
			"activities", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> contactDetails =
		createColumn(
			"contactDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabResourceReqFirstTable() {
		super(
			"nbp_janaac_add_lab_res_req_fir", AddLabResourceReqFirstTable::new);
	}

}