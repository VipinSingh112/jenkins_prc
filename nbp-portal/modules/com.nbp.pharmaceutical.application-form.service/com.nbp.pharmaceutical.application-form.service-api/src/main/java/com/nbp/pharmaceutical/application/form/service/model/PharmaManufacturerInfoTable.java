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
 * The table class for the &quot;nbp_pharma_manufacturer&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfo
 * @generated
 */
public class PharmaManufacturerInfoTable
	extends BaseTable<PharmaManufacturerInfoTable> {

	public static final PharmaManufacturerInfoTable INSTANCE =
		new PharmaManufacturerInfoTable();

	public final Column<PharmaManufacturerInfoTable, Long>
		pharmaManufacturerInfoId = createColumn(
			"pharmaManufacturerInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaManufacturerInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaDrugManufacturerName = createColumn(
			"pharmaDrugManufacturerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaDrugManufacturerAdd = createColumn(
			"pharmaDrugManufacturerAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaDrugDeisgnation = createColumn(
			"pharmaDrugDeisgnation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaMarketAuthName = createColumn(
			"pharmaMarketAuthName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaMarketAuthAddress = createColumn(
			"pharmaMarketAuthAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaReguOfficerName = createColumn(
			"pharmaReguOfficerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaReguOfficerContact = createColumn(
			"pharmaReguOfficerContact", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaDrugApplicName = createColumn(
			"pharmaDrugApplicName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaDrugApplicAddress = createColumn(
			"pharmaDrugApplicAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalReprName = createColumn(
			"pharmaLocalReprName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalReprContact = createColumn(
			"pharmaLocalReprContact", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalReprAdd = createColumn(
			"pharmaLocalReprAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalDistName = createColumn(
			"pharmaLocalDistName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalDistAddress = createColumn(
			"pharmaLocalDistAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, String>
		pharmaLocalDistContact = createColumn(
			"pharmaLocalDistContact", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaManufacturerInfoTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaManufacturerInfoTable() {
		super("nbp_pharma_manufacturer", PharmaManufacturerInfoTable::new);
	}

}