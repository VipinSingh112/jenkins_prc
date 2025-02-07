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
 * The table class for the &quot;nbp_jtb_board_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecision
 * @generated
 */
public class JtbAppBoardDecisionTable
	extends BaseTable<JtbAppBoardDecisionTable> {

	public static final JtbAppBoardDecisionTable INSTANCE =
		new JtbAppBoardDecisionTable();

	public final Column<JtbAppBoardDecisionTable, Long>
		jtbAppDeciBoardDecisionId = createColumn(
			"jtbAppDeciBoardDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAppBoardDecisionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, Date> dateOfBoardDecision =
		createColumn(
			"dateOfBoardDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, String> committeeDecision =
		createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAppBoardDecisionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JtbAppBoardDecisionTable() {
		super("nbp_jtb_board_decision", JtbAppBoardDecisionTable::new);
	}

}