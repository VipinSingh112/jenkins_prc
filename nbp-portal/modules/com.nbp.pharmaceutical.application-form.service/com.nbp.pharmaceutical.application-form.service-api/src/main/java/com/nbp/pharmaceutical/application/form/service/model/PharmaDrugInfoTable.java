/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_drug_Info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfo
 * @generated
 */
public class PharmaDrugInfoTable extends BaseTable<PharmaDrugInfoTable> {

	public static final PharmaDrugInfoTable INSTANCE =
		new PharmaDrugInfoTable();

	public final Column<PharmaDrugInfoTable, Long> pharmaDrugInfoId =
		createColumn(
			"pharmaDrugInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PharmaDrugInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaDrugBrandName =
		createColumn(
			"pharmaDrugBrandName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaDrugDeisgnation =
		createColumn(
			"pharmaDrugDeisgnation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaDosageForm =
		createColumn(
			"pharmaDosageForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaAdministrationRoute =
		createColumn(
			"pharmaAdministrationRoute", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaOriginDispensing =
		createColumn(
			"pharmaOriginDispensing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String> pharmaLicenseHolderName =
		createColumn(
			"pharmaLicenseHolderName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, String>
		pharmaLicenseHolderAddress = createColumn(
			"pharmaLicenseHolderAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaDrugInfoTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaDrugInfoTable() {
		super("nbp_pharma_drug_Info", PharmaDrugInfoTable::new);
	}

}