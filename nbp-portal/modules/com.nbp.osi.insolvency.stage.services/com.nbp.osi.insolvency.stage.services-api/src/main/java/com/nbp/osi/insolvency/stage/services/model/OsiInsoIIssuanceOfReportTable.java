/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_insol_issu_of_report&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReport
 * @generated
 */
public class OsiInsoIIssuanceOfReportTable
	extends BaseTable<OsiInsoIIssuanceOfReportTable> {

	public static final OsiInsoIIssuanceOfReportTable INSTANCE =
		new OsiInsoIIssuanceOfReportTable();

	public final Column<OsiInsoIIssuanceOfReportTable, Long>
		osiInsoIIssuanceOfReportId = createColumn(
			"osiInsoIIssuanceOfReportId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiInsoIIssuanceOfReportTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Date> dateOfReport =
		createColumn(
			"dateOfReport", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, String> decision =
		createColumn(
			"decision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsoIIssuanceOfReportTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsoIIssuanceOfReportTable() {
		super(
			"nbp_osi_insol_issu_of_report", OsiInsoIIssuanceOfReportTable::new);
	}

}