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
 * The table class for the &quot;nbp_janaac_report&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReport
 * @generated
 */
public class JanaacReportTable extends BaseTable<JanaacReportTable> {

	public static final JanaacReportTable INSTANCE = new JanaacReportTable();

	public final Column<JanaacReportTable, Long> janaacReportId = createColumn(
		"janaacReportId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JanaacReportTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, Date> dateOfReport = createColumn(
		"dateOfReport", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, String> report = createColumn(
		"report", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacReportTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JanaacReportTable() {
		super("nbp_janaac_report", JanaacReportTable::new);
	}

}