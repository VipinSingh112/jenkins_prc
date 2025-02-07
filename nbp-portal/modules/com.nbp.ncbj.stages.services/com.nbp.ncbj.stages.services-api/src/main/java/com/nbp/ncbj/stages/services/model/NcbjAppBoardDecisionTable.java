/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_board_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecision
 * @generated
 */
public class NcbjAppBoardDecisionTable
	extends BaseTable<NcbjAppBoardDecisionTable> {

	public static final NcbjAppBoardDecisionTable INSTANCE =
		new NcbjAppBoardDecisionTable();

	public final Column<NcbjAppBoardDecisionTable, Long>
		ncbjAppBoardDecisionId = createColumn(
			"ncbjAppBoardDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjAppBoardDecisionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, Date> dateOfBoardDecision =
		createColumn(
			"dateOfBoardDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, String> committeeDecision =
		createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAppBoardDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private NcbjAppBoardDecisionTable() {
		super("nbp_ncbj_board_decision", NcbjAppBoardDecisionTable::new);
	}

}