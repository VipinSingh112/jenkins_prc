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
 * The table class for the &quot;nbp_sez_status_committe_deci&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecision
 * @generated
 */
public class SezStatusARCDecisionTable
	extends BaseTable<SezStatusARCDecisionTable> {

	public static final SezStatusARCDecisionTable INSTANCE =
		new SezStatusARCDecisionTable();

	public final Column<SezStatusARCDecisionTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Long> sezStatusCommitteeId =
		createColumn(
			"sezStatusCommitteeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusARCDecisionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, String> committeeDecision =
		createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusARCDecisionTable, Date> committeeDecisionDate =
		createColumn(
			"committeeDecisionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);

	private SezStatusARCDecisionTable() {
		super("nbp_sez_status_committe_deci", SezStatusARCDecisionTable::new);
	}

}