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
 * The table class for the &quot;nbp_jadsc_checklist_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAdd
 * @generated
 */
public class JADSCChecklistAddTable extends BaseTable<JADSCChecklistAddTable> {

	public static final JADSCChecklistAddTable INSTANCE =
		new JADSCChecklistAddTable();

	public final Column<JADSCChecklistAddTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Long> jADSCChecklistAddId =
		createColumn(
			"jADSCChecklistAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JADSCChecklistAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, String> AddItem = createColumn(
		"AddItem", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCChecklistAddTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCChecklistAddTable() {
		super("nbp_jadsc_checklist_add", JADSCChecklistAddTable::new);
	}

}