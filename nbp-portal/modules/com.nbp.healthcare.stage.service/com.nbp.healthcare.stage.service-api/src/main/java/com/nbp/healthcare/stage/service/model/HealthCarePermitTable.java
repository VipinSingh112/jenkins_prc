/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermit
 * @generated
 */
public class HealthCarePermitTable extends BaseTable<HealthCarePermitTable> {

	public static final HealthCarePermitTable INSTANCE =
		new HealthCarePermitTable();

	public final Column<HealthCarePermitTable, Long> healthPermitId =
		createColumn(
			"healthPermitId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HealthCarePermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> permitTransaction =
		createColumn(
			"permitTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> nameofApplicant =
		createColumn(
			"nameofApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> category = createColumn(
		"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> pirPermt = createColumn(
		"pirPermt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> bonafideHC =
		createColumn(
			"bonafideHC", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, String> tariffCode =
		createColumn(
			"tariffCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Date> dateofIssue = createColumn(
		"dateofIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCarePermitTable, Long> pirPermitFileEntryId =
		createColumn(
			"pirPermitFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCarePermitTable() {
		super("nbp_healthcare_permit", HealthCarePermitTable::new);
	}

}