/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermit
 * @generated
 */
public class CreativePermitTable extends BaseTable<CreativePermitTable> {

	public static final CreativePermitTable INSTANCE =
		new CreativePermitTable();

	public final Column<CreativePermitTable, Long> creativePermitId =
		createColumn(
			"creativePermitId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CreativePermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, String> pirPermtNumber =
		createColumn(
			"pirPermtNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Date> dateofIssue = createColumn(
		"dateofIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, String> durationOfPermit =
		createColumn(
			"durationOfPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativePermitTable, Long> pirCertificateNumber =
		createColumn(
			"pirCertificateNumber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativePermitTable() {
		super("nbp_creative_permit", CreativePermitTable::new);
	}

}