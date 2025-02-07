/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_agriculture_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermit
 * @generated
 */
public class AgriculturePermitTable extends BaseTable<AgriculturePermitTable> {

	public static final AgriculturePermitTable INSTANCE =
		new AgriculturePermitTable();

	public final Column<AgriculturePermitTable, Long> agriculturePermitId =
		createColumn(
			"agriculturePermitId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgriculturePermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, String> pirPermtNumber =
		createColumn(
			"pirPermtNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Date> dateofIssue =
		createColumn(
			"dateofIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, String> durationOfPermit =
		createColumn(
			"durationOfPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePermitTable, Long> pirCertificateNUmber =
		createColumn(
			"pirCertificateNUmber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgriculturePermitTable() {
		super("nbp_agriculture_permit", AgriculturePermitTable::new);
	}

}