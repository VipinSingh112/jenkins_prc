/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_abstract_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfo
 * @generated
 */
public class LicenceToAbstractInfoTable
	extends BaseTable<LicenceToAbstractInfoTable> {

	public static final LicenceToAbstractInfoTable INSTANCE =
		new LicenceToAbstractInfoTable();

	public final Column<LicenceToAbstractInfoTable, Long> abstractLicenceId =
		createColumn(
			"abstractLicenceId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<LicenceToAbstractInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> applicationNum =
		createColumn(
			"applicationNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> parishApplicant =
		createColumn(
			"parishApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		mailingAddOfApplicant = createColumn(
			"mailingAddOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> emailOfApplicant =
		createColumn(
			"emailOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> officePhone =
		createColumn(
			"officePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> mobilePhone =
		createColumn(
			"mobilePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> homePhone =
		createColumn(
			"homePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		locationOfProposedParish = createColumn(
			"locationOfProposedParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		locationOfProParishWork = createColumn(
			"locationOfProParishWork", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> nameOfContractor =
		createColumn(
			"nameOfContractor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> parishContractor =
		createColumn(
			"parishContractor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		addressOfContractor = createColumn(
			"addressOfContractor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> sourceOfWater =
		createColumn(
			"sourceOfWater", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> purposeWaterUse =
		createColumn(
			"purposeWaterUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> areaAndCropType =
		createColumn(
			"areaAndCropType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> systemOfIrrigation =
		createColumn(
			"systemOfIrrigation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> meansOfDisposal =
		createColumn(
			"meansOfDisposal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		estimateDepthOfBorewell = createColumn(
			"estimateDepthOfBorewell", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> diameterOfBorewell =
		createColumn(
			"diameterOfBorewell", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> artesianSupply =
		createColumn(
			"artesianSupply", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> geologicalStrait =
		createColumn(
			"geologicalStrait", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		methodOfAbstractingWater = createColumn(
			"methodOfAbstractingWater", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> maxDailyQuant =
		createColumn(
			"maxDailyQuant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		typeOfAppratusProposed = createColumn(
			"typeOfAppratusProposed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String> otherInformation =
		createColumn(
			"otherInformation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		requestToSupplyWater = createColumn(
			"requestToSupplyWater", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, String>
		authorityInformation = createColumn(
			"authorityInformation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Date> dateOfSign =
		createColumn(
			"dateOfSign", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LicenceToAbstractInfoTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private LicenceToAbstractInfoTable() {
		super("nbp_wra_abstract_info", LicenceToAbstractInfoTable::new);
	}

}