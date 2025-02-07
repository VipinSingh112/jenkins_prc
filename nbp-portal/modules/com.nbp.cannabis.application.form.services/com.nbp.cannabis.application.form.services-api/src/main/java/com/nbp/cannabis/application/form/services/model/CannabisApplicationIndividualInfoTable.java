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
 * The table class for the &quot;nbp_cannabis_individaul_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfo
 * @generated
 */
public class CannabisApplicationIndividualInfoTable
	extends BaseTable<CannabisApplicationIndividualInfoTable> {

	public static final CannabisApplicationIndividualInfoTable INSTANCE =
		new CannabisApplicationIndividualInfoTable();

	public final Column<CannabisApplicationIndividualInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Long>
		individualInformationId = createColumn(
			"individualInformationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationIndividualInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		firstName = createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		lastName = createColumn(
			"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		middleName = createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		otherName = createColumn(
			"otherName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		maidenName = createColumn(
			"maidenName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		motherMaidenName = createColumn(
			"motherMaidenName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String> gender =
		createColumn(
			"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		maritalStatus = createColumn(
			"maritalStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Date> dob =
		createColumn("dob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		placeOfBirth = createColumn(
			"placeOfBirth", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		nationality = createColumn(
			"nationality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		durationInJamaika = createColumn(
			"durationInJamaika", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		currentOccupation = createColumn(
			"currentOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		drivingLincenseNo = createColumn(
			"drivingLincenseNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		passporNo = createColumn(
			"passporNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		nationalIdentityNo = createColumn(
			"nationalIdentityNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		contactHome = createColumn(
			"contactHome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		contactWork = createColumn(
			"contactWork", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		contactMobile = createColumn(
			"contactMobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		identityNumber = createColumn(
			"identityNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Integer>
		status = createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualInfoTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisApplicationIndividualInfoTable() {
		super(
			"nbp_cannabis_individaul_info",
			CannabisApplicationIndividualInfoTable::new);
	}

}