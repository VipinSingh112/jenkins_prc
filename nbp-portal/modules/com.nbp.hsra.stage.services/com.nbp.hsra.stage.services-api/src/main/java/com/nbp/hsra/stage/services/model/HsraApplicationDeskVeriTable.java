/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeri
 * @generated
 */
public class HsraApplicationDeskVeriTable
	extends BaseTable<HsraApplicationDeskVeriTable> {

	public static final HsraApplicationDeskVeriTable INSTANCE =
		new HsraApplicationDeskVeriTable();

	public final Column<HsraApplicationDeskVeriTable, Long>
		hsraApplicationDeskVeriId = createColumn(
			"hsraApplicationDeskVeriId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HsraApplicationDeskVeriTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationDeskVeriTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HsraApplicationDeskVeriTable() {
		super("nbp_hsra_desk_verifi", HsraApplicationDeskVeriTable::new);
	}

}