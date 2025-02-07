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
 * The table class for the &quot;nbp_mining_mini_dec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecision
 * @generated
 */
public class MiningApplicationMinisterialDecisionTable
	extends BaseTable<MiningApplicationMinisterialDecisionTable> {

	public static final MiningApplicationMinisterialDecisionTable INSTANCE =
		new MiningApplicationMinisterialDecisionTable();

	public final Column<MiningApplicationMinisterialDecisionTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Long>
		miningDecId = createColumn(
			"miningDecId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MiningApplicationMinisterialDecisionTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, String>
		caseId = createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, Date>
		dateOfCommDec = createColumn(
			"dateOfCommDec", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationMinisterialDecisionTable, String>
		commDecision = createColumn(
			"commDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MiningApplicationMinisterialDecisionTable() {
		super(
			"nbp_mining_mini_dec",
			MiningApplicationMinisterialDecisionTable::new);
	}

}