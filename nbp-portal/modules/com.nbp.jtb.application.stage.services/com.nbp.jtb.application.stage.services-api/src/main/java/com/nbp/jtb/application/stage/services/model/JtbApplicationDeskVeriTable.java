/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeri
 * @generated
 */
public class JtbApplicationDeskVeriTable
	extends BaseTable<JtbApplicationDeskVeriTable> {

	public static final JtbApplicationDeskVeriTable INSTANCE =
		new JtbApplicationDeskVeriTable();

	public final Column<JtbApplicationDeskVeriTable, Long>
		jtbApplicationDeskVeriId = createColumn(
			"jtbApplicationDeskVeriId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbApplicationDeskVeriTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbApplicationDeskVeriTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JtbApplicationDeskVeriTable() {
		super("nbp_jtb_desk_verifi", JtbApplicationDeskVeriTable::new);
	}

}