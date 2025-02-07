/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermit
 * @generated
 */
public class TourismPermitTable extends BaseTable<TourismPermitTable> {

	public static final TourismPermitTable INSTANCE = new TourismPermitTable();

	public final Column<TourismPermitTable, Long> tourismgPermitId =
		createColumn(
			"tourismgPermitId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TourismPermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> PIRPermtNumber =
		createColumn(
			"PIRPermtNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Date> dateOfIssue = createColumn(
		"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> durationOfPermit =
		createColumn(
			"durationOfPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> typeOfPermit = createColumn(
		"typeOfPermit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> numberOfExtensions =
		createColumn(
			"numberOfExtensions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismPermitTable, Long> pirPermitCertificateNumber =
		createColumn(
			"pirPermitCertificateNumber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismPermitTable() {
		super("nbp_tourism_permit", TourismPermitTable::new);
	}

}