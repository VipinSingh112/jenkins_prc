/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_status_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplication
 * @generated
 */
public class SezStatusApplicationTable
	extends BaseTable<SezStatusApplicationTable> {

	public static final SezStatusApplicationTable INSTANCE =
		new SezStatusApplicationTable();

	public final Column<SezStatusApplicationTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> sezStatus =
		createColumn(
			"sezStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String>
		zoningClassification = createColumn(
			"zoningClassification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> specialEconomicZone =
		createColumn(
			"specialEconomicZone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> industries =
		createColumn(
			"industries", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> doYouWantTo =
		createColumn(
			"doYouWantTo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String>
		typeOfTransactionWFH = createColumn(
			"typeOfTransactionWFH", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> controlNumberWFH =
		createColumn(
			"controlNumberWFH", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationTable, String> applicantStatusWFH =
		createColumn(
			"applicantStatusWFH", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private SezStatusApplicationTable() {
		super("nbp_sez_status_application", SezStatusApplicationTable::new);
	}

}