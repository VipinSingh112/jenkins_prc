/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacturing_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermit
 * @generated
 */
public class ManufacturingPermitTable
	extends BaseTable<ManufacturingPermitTable> {

	public static final ManufacturingPermitTable INSTANCE =
		new ManufacturingPermitTable();

	public final Column<ManufacturingPermitTable, Long> manufacturingPermitId =
		createColumn(
			"manufacturingPermitId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManufacturingPermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> PIRPermtNumber =
		createColumn(
			"PIRPermtNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Date> dateOfIssue =
		createColumn(
			"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> durationOfPermit =
		createColumn(
			"durationOfPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> typeOfPermit =
		createColumn(
			"typeOfPermit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> numberOfExtensions =
		createColumn(
			"numberOfExtensions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingPermitTable, Long>
		pirPermitCertificateNumber = createColumn(
			"pirPermitCertificateNumber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManufacturingPermitTable() {
		super("nbp_manufacturing_permit", ManufacturingPermitTable::new);
	}

}