/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplication
 * @generated
 */
public class NcbjApplicationTable extends BaseTable<NcbjApplicationTable> {

	public static final NcbjApplicationTable INSTANCE =
		new NcbjApplicationTable();

	public final Column<NcbjApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> typeOfCertification =
		createColumn(
			"typeOfCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> typeOfServices =
		createColumn(
			"typeOfServices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> subCategoryServices =
		createColumn(
			"subCategoryServices", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String>
		iso9001CertificationValue = createColumn(
			"iso9001CertificationValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> numberOfSite =
		createColumn(
			"numberOfSite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String>
		iso22000CertificationValue = createColumn(
			"iso22000CertificationValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> transferReason =
		createColumn(
			"transferReason", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private NcbjApplicationTable() {
		super("nbp_ncbj_application", NcbjApplicationTable::new);
	}

}