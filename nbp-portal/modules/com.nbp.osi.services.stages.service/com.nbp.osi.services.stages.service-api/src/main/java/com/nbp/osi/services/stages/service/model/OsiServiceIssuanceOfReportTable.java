/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_service_report&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReport
 * @generated
 */
public class OsiServiceIssuanceOfReportTable
	extends BaseTable<OsiServiceIssuanceOfReportTable> {

	public static final OsiServiceIssuanceOfReportTable INSTANCE =
		new OsiServiceIssuanceOfReportTable();

	public final Column<OsiServiceIssuanceOfReportTable, Long>
		osiServiceIssuanceOfReportId = createColumn(
			"osiServiceIssuanceOfReportId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiServiceIssuanceOfReportTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Date> dateOfReport =
		createColumn(
			"dateOfReport", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, String>
		nameOfApplicant = createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, String>
		typeOfApplicant = createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, String> decision =
		createColumn(
			"decision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServiceIssuanceOfReportTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiServiceIssuanceOfReportTable() {
		super("nbp_osi_service_report", OsiServiceIssuanceOfReportTable::new);
	}

}