/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_checklist_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklist
 * @generated
 */
public class JADSCChecklistTable extends BaseTable<JADSCChecklistTable> {

	public static final JADSCChecklistTable INSTANCE =
		new JADSCChecklistTable();

	public final Column<JADSCChecklistTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Long> jadscChecklistId =
		createColumn(
			"jadscChecklistId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JADSCChecklistTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, String> informationRegComplaint =
		createColumn(
			"informationRegComplaint", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, String> selectedChecklistValues =
		createColumn(
			"selectedChecklistValues", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCChecklistTable() {
		super("nbp_jadsc_checklist_info", JADSCChecklistTable::new);
	}

}