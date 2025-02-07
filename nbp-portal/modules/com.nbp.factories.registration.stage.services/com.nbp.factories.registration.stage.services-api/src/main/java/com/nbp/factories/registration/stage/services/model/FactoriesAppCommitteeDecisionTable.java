/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_comm_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecision
 * @generated
 */
public class FactoriesAppCommitteeDecisionTable
	extends BaseTable<FactoriesAppCommitteeDecisionTable> {

	public static final FactoriesAppCommitteeDecisionTable INSTANCE =
		new FactoriesAppCommitteeDecisionTable();

	public final Column<FactoriesAppCommitteeDecisionTable, Long>
		factoriesAppCommiDecId = createColumn(
			"factoriesAppCommiDecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesAppCommitteeDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, Date>
		dateOfCommitteeDecision = createColumn(
			"dateOfCommitteeDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, String>
		committeeDecision = createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesAppCommitteeDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private FactoriesAppCommitteeDecisionTable() {
		super(
			"nbp_factories_comm_decision",
			FactoriesAppCommitteeDecisionTable::new);
	}

}