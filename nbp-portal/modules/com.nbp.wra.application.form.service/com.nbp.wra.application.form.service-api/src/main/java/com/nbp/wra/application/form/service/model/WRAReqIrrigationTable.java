/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_req_irrigation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigation
 * @generated
 */
public class WRAReqIrrigationTable extends BaseTable<WRAReqIrrigationTable> {

	public static final WRAReqIrrigationTable INSTANCE =
		new WRAReqIrrigationTable();

	public final Column<WRAReqIrrigationTable, Long> wraReqIrrigationId =
		createColumn(
			"wraReqIrrigationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<WRAReqIrrigationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, String> abstractAreaIrrigated =
		createColumn(
			"abstractAreaIrrigated", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, String> abstractSystemIrrigated =
		createColumn(
			"abstractSystemIrrigated", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAReqIrrigationTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private WRAReqIrrigationTable() {
		super("nbp_wra_req_irrigation", WRAReqIrrigationTable::new);
	}

}