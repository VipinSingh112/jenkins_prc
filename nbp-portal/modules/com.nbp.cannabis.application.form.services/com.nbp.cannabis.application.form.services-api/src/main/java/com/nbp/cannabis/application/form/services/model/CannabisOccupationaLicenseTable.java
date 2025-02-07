/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_occ_license&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicense
 * @generated
 */
public class CannabisOccupationaLicenseTable
	extends BaseTable<CannabisOccupationaLicenseTable> {

	public static final CannabisOccupationaLicenseTable INSTANCE =
		new CannabisOccupationaLicenseTable();

	public final Column<CannabisOccupationaLicenseTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long>
		cannabisOccupationaLicenseId = createColumn(
			"cannabisOccupationaLicenseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisOccupationaLicenseTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> middleName =
		createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> surname =
		createColumn(
			"surname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> management =
		createColumn(
			"management", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> director =
		createColumn(
			"director", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Date> dob =
		createColumn("dob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> idNumber =
		createColumn(
			"idNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> typeOfId =
		createColumn(
			"typeOfId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long>
		officialPoliceRecordDocId = createColumn(
			"officialPoliceRecordDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long>
		certifiedCopyofIdDocId = createColumn(
			"certifiedCopyofIdDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long>
		photoOfEmployeeDocId = createColumn(
			"photoOfEmployeeDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, String> signature =
		createColumn(
			"signature", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisOccupationaLicenseTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisOccupationaLicenseTable() {
		super("nbp_cannabis_occ_license", CannabisOccupationaLicenseTable::new);
	}

}