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
 * The table class for the &quot;nbp_janaac_add_lab_res_req_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSec
 * @generated
 */
public class AddLabResourceReqSecTable
	extends BaseTable<AddLabResourceReqSecTable> {

	public static final AddLabResourceReqSecTable INSTANCE =
		new AddLabResourceReqSecTable();

	public final Column<AddLabResourceReqSecTable, Long>
		addLabResourceReqSecId = createColumn(
			"addLabResourceReqSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabResourceReqSecTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> inventoryNumber =
		createColumn(
			"inventoryNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> item = createColumn(
		"item", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> manufacturer =
		createColumn(
			"manufacturer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> modelNumber =
		createColumn(
			"modelNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> calibrationInterval =
		createColumn(
			"calibrationInterval", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> calibratedBy =
		createColumn(
			"calibratedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabResourceReqSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabResourceReqSecTable() {
		super("nbp_janaac_add_lab_res_req_sec", AddLabResourceReqSecTable::new);
	}

}