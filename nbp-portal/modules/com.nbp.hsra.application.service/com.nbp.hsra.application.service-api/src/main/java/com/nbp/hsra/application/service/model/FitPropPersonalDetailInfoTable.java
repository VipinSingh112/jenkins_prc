/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_fitprop_personal&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfo
 * @generated
 */
public class FitPropPersonalDetailInfoTable
	extends BaseTable<FitPropPersonalDetailInfoTable> {

	public static final FitPropPersonalDetailInfoTable INSTANCE =
		new FitPropPersonalDetailInfoTable();

	public final Column<FitPropPersonalDetailInfoTable, Long>
		fitPropPersonalDetailInfoId = createColumn(
			"fitPropPersonalDetailInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FitPropPersonalDetailInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantFirstName = createColumn(
			"applicantFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantMiddleName = createColumn(
			"applicantMiddleName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSurname = createColumn(
			"applicantSurname", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantFormerName = createColumn(
			"applicantFormerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String> applicantAlias =
		createColumn(
			"applicantAlias", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantStreetName = createColumn(
			"applicantStreetName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantStreetNo = createColumn(
			"applicantStreetNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantPostalCode = createColumn(
			"applicantPostalCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantCountry = createColumn(
			"applicantCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantTownName = createColumn(
			"applicantTownName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String> applicantCity =
		createColumn(
			"applicantCity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantParish = createColumn(
			"applicantParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantTelephoneNum = createColumn(
			"applicantTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantEmailAdd = createColumn(
			"applicantEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Date>
		applicantDateBirth = createColumn(
			"applicantDateBirth", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantPlaceOfBirthTown = createColumn(
			"applicantPlaceOfBirthTown", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantPlaceOfBirthParish = createColumn(
			"applicantPlaceOfBirthParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantPlaceOfBirthCountry = createColumn(
			"applicantPlaceOfBirthCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantNationality = createColumn(
			"applicantNationality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantNisNum = createColumn(
			"applicantNisNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSocialNum = createColumn(
			"applicantSocialNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantNationalNum = createColumn(
			"applicantNationalNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantRegistrationNum = createColumn(
			"applicantRegistrationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		maritalStatusDetails = createColumn(
			"maritalStatusDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantRelationship = createColumn(
			"applicantRelationship", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSecTelephone = createColumn(
			"applicantSecTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSecMail = createColumn(
			"applicantSecMail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSecAddress = createColumn(
			"applicantSecAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, String>
		applicantSecAddressParish = createColumn(
			"applicantSecAddressParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropPersonalDetailInfoTable, Long>
		hsraApplicationId = createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FitPropPersonalDetailInfoTable() {
		super("nbp_hsra_fitprop_personal", FitPropPersonalDetailInfoTable::new);
	}

}