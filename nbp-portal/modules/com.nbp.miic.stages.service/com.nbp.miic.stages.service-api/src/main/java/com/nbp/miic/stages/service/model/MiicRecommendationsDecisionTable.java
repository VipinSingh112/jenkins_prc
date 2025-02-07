/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_recommen_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecision
 * @generated
 */
public class MiicRecommendationsDecisionTable
	extends BaseTable<MiicRecommendationsDecisionTable> {

	public static final MiicRecommendationsDecisionTable INSTANCE =
		new MiicRecommendationsDecisionTable();

	public final Column<MiicRecommendationsDecisionTable, Long>
		miicRecommendationsDecisionId = createColumn(
			"miicRecommendationsDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicRecommendationsDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, Date>
		dateOfRecommendationsDecision = createColumn(
			"dateOfRecommendationsDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, String>
		recommendationsDecision = createColumn(
			"recommendationsDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicRecommendationsDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MiicRecommendationsDecisionTable() {
		super(
			"nbp_miic_recommen_decision",
			MiicRecommendationsDecisionTable::new);
	}

}