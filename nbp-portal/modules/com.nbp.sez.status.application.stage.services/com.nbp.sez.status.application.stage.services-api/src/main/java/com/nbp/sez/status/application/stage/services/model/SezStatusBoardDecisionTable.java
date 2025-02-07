/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_status_board_deci&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecision
 * @generated
 */
public class SezStatusBoardDecisionTable
	extends BaseTable<SezStatusBoardDecisionTable> {

	public static final SezStatusBoardDecisionTable INSTANCE =
		new SezStatusBoardDecisionTable();

	public final Column<SezStatusBoardDecisionTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Long> sezStatusBoardId =
		createColumn(
			"sezStatusBoardId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusBoardDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, String> boardDecision =
		createColumn(
			"boardDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusBoardDecisionTable, Date> boardDecisionDate =
		createColumn(
			"boardDecisionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	private SezStatusBoardDecisionTable() {
		super("nbp_sez_status_board_deci", SezStatusBoardDecisionTable::new);
	}

}