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
 * The table class for the &quot;nbp_wra_lic_well_drill_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDriller
 * @generated
 */
public class LicenceToWellDrillerTable
	extends BaseTable<LicenceToWellDrillerTable> {

	public static final LicenceToWellDrillerTable INSTANCE =
		new LicenceToWellDrillerTable();

	public final Column<LicenceToWellDrillerTable, Long>
		licenceToWellDrillerId = createColumn(
			"licenceToWellDrillerId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<LicenceToWellDrillerTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		wellDrillingApplicationNo = createColumn(
			"wellDrillingApplicationNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingApplicantName = createColumn(
			"permitDrillingApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingAddressParish = createColumn(
			"permitDrillingAddressParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingApplicantAddress = createColumn(
			"permitDrillingApplicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Date> permitDrillingDOBDate =
		createColumn(
			"permitDrillingDOBDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingEducational = createColumn(
			"permitDrillingEducational", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSpecificTraining = createColumn(
			"permitDrillingSpecificTraining", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSpecificExp = createColumn(
			"permitDrillingSpecificExp", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSelfEmployed = createColumn(
			"permitDrillingSelfEmployed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String> permitDrillingName =
		createColumn(
			"permitDrillingName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingPresentEmployer = createColumn(
			"permitDrillingPresentEmployer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingEmployerAddress = createColumn(
			"permitDrillingEmployerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingFirstRefName = createColumn(
			"permitDrillingFirstRefName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingFirstRefAdd = createColumn(
			"permitDrillingFirstRefAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSecondRefName = createColumn(
			"permitDrillingSecondRefName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSecondRefAdd = createColumn(
			"permitDrillingSecondRefAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, String>
		permitDrillingSignature = createColumn(
			"permitDrillingSignature", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Date>
		permitDrillingSignatureDate = createColumn(
			"permitDrillingSignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<LicenceToWellDrillerTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private LicenceToWellDrillerTable() {
		super("nbp_wra_lic_well_drill_info", LicenceToWellDrillerTable::new);
	}

}