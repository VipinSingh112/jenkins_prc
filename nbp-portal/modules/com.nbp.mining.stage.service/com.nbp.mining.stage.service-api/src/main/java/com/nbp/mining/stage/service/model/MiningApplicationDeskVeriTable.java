/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_mining_desk_verifi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeri
 * @generated
 */
public class MiningApplicationDeskVeriTable
	extends BaseTable<MiningApplicationDeskVeriTable> {

	public static final MiningApplicationDeskVeriTable INSTANCE =
		new MiningApplicationDeskVeriTable();

	public final Column<MiningApplicationDeskVeriTable, Long> miningDeskVeriId =
		createColumn(
			"miningDeskVeriId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MiningApplicationDeskVeriTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, Long>
		miningApplicationId = createColumn(
			"miningApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDeskVeriTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MiningApplicationDeskVeriTable() {
		super("nbp_mining_desk_verifi", MiningApplicationDeskVeriTable::new);
	}

}