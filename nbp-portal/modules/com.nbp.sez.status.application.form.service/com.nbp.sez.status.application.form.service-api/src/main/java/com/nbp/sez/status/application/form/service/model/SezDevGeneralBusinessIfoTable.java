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
 * The table class for the &quot;nbp_sez_dev_gen_business_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfo
 * @generated
 */
public class SezDevGeneralBusinessIfoTable
	extends BaseTable<SezDevGeneralBusinessIfoTable> {

	public static final SezDevGeneralBusinessIfoTable INSTANCE =
		new SezDevGeneralBusinessIfoTable();

	public final Column<SezDevGeneralBusinessIfoTable, Long>
		sezDevGeneralBusinessIfoId = createColumn(
			"sezDevGeneralBusinessIfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevGeneralBusinessIfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, Date> applicationDate =
		createColumn(
			"applicationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> buildingNum =
		createColumn(
			"buildingNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> townCity =
		createColumn(
			"townCity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> Parish =
		createColumn(
			"Parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> country =
		createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> telephoneNum =
		createColumn(
			"telephoneNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> faxNum =
		createColumn(
			"faxNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> website =
		createColumn(
			"website", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		headOfficeBuildingNum = createColumn(
			"headOfficeBuildingNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> headOfficeTown =
		createColumn(
			"headOfficeTown", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		headOfficeParish = createColumn(
			"headOfficeParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> authRepName =
		createColumn(
			"authRepName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		authRepBuildingNum = createColumn(
			"authRepBuildingNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> authRepTown =
		createColumn(
			"authRepTown", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> authRepParish =
		createColumn(
			"authRepParish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> authRepCountry =
		createColumn(
			"authRepCountry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		authReptelephoneNum = createColumn(
			"authReptelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> authRepFaxNum =
		createColumn(
			"authRepFaxNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		autheEmailAddress = createColumn(
			"autheEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> joinVenture =
		createColumn(
			"joinVenture", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		existingJamicanCom = createColumn(
			"existingJamicanCom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		articleOfIncorporation = createColumn(
			"articleOfIncorporation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> pleaseSpecify =
		createColumn(
			"pleaseSpecify", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		companyClassified = createColumn(
			"companyClassified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String> taxRegisNum =
		createColumn(
			"taxRegisNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		genConsumptionNum = createColumn(
			"genConsumptionNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, String>
		taxComplianceCertificateNum = createColumn(
			"taxComplianceCertificateNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevGeneralBusinessIfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevGeneralBusinessIfoTable() {
		super(
			"nbp_sez_dev_gen_business_info",
			SezDevGeneralBusinessIfoTable::new);
	}

}