/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeri
 * @generated
 */
public class WraApplicationDeskVeriTable
	extends BaseTable<WraApplicationDeskVeriTable> {

	public static final WraApplicationDeskVeriTable INSTANCE =
		new WraApplicationDeskVeriTable();

	public final Column<WraApplicationDeskVeriTable, Long>
		wraApplicationDeskVeriId = createColumn(
			"wraApplicationDeskVeriId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<WraApplicationDeskVeriTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraApplicationDeskVeriTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private WraApplicationDeskVeriTable() {
		super("nbp_wra_desk_verifi", WraApplicationDeskVeriTable::new);
	}

}