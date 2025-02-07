/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_status_licence_issu&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuance
 * @generated
 */
public class SezStatusLicenseIssuanceTable
	extends BaseTable<SezStatusLicenseIssuanceTable> {

	public static final SezStatusLicenseIssuanceTable INSTANCE =
		new SezStatusLicenseIssuanceTable();

	public final Column<SezStatusLicenseIssuanceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Long>
		sezStatusLicIssuedId = createColumn(
			"sezStatusLicIssuedId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusLicenseIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String> licenceNumber =
		createColumn(
			"licenceNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String> sezStatus =
		createColumn(
			"sezStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, String>
		sezDeveloperNumber = createColumn(
			"sezDeveloperNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Date> dateOfLicIssuance =
		createColumn(
			"dateOfLicIssuance", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Date>
		dateOfLicenseExpiration = createColumn(
			"dateOfLicenseExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusLicenseIssuanceTable, Long> docLicFileEntryId =
		createColumn(
			"docLicFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SezStatusLicenseIssuanceTable() {
		super(
			"nbp_sez_status_licence_issu", SezStatusLicenseIssuanceTable::new);
	}

}