/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeri
 * @generated
 */
public class CannabisApplicationDeskVeriTable
	extends BaseTable<CannabisApplicationDeskVeriTable> {

	public static final CannabisApplicationDeskVeriTable INSTANCE =
		new CannabisApplicationDeskVeriTable();

	public final Column<CannabisApplicationDeskVeriTable, Long>
		cannabisDeskVeriId = createColumn(
			"cannabisDeskVeriId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationDeskVeriTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, String>
		documentStatus = createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDeskVeriTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CannabisApplicationDeskVeriTable() {
		super(
			"nbp_cannabis_desk_verifi", CannabisApplicationDeskVeriTable::new);
	}

}