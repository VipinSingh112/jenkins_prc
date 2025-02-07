/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_committee_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecision
 * @generated
 */
public class JanaacCommitteeDecisionTable
	extends BaseTable<JanaacCommitteeDecisionTable> {

	public static final JanaacCommitteeDecisionTable INSTANCE =
		new JanaacCommitteeDecisionTable();

	public final Column<JanaacCommitteeDecisionTable, Long>
		janaacCommitteeDecisionId = createColumn(
			"janaacCommitteeDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JanaacCommitteeDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, Date>
		dateOfCommitteeDecision = createColumn(
			"dateOfCommitteeDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, String>
		committeeDecision = createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JanaacCommitteeDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JanaacCommitteeDecisionTable() {
		super(
			"nbp_janaac_committee_decision", JanaacCommitteeDecisionTable::new);
	}

}