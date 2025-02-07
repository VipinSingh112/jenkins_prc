/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_evaluation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluation
 * @generated
 */
public class AcquireEvaluationTable extends BaseTable<AcquireEvaluationTable> {

	public static final AcquireEvaluationTable INSTANCE =
		new AcquireEvaluationTable();

	public final Column<AcquireEvaluationTable, Long> acquireEvaluationId =
		createColumn(
			"acquireEvaluationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireEvaluationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, String> typeOfCommittee =
		createColumn(
			"typeOfCommittee", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, Date> dateOfCommitteeDecision =
		createColumn(
			"dateOfCommitteeDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireEvaluationTable, String> committeeDecision =
		createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AcquireEvaluationTable() {
		super("nbp_acquire_evaluation", AcquireEvaluationTable::new);
	}

}