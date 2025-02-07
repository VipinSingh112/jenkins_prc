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
 * The table class for the &quot;nbp_wra_drill_well_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWell
 * @generated
 */
public class PermitToDrillAWellTable
	extends BaseTable<PermitToDrillAWellTable> {

	public static final PermitToDrillAWellTable INSTANCE =
		new PermitToDrillAWellTable();

	public final Column<PermitToDrillAWellTable, Long> drillAWellApplicationId =
		createColumn(
			"drillAWellApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PermitToDrillAWellTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillApplicationNum = createColumn(
			"permitDrillApplicationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingApplicantName = createColumn(
			"permitDrillingApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingMailingAddParish = createColumn(
			"permitDrillingMailingAddParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingMailingAddress = createColumn(
			"permitDrillingMailingAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingEmailAddress = createColumn(
			"permitDrillingEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingOfficePhone = createColumn(
			"permitDrillingOfficePhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingMobilePhone = createColumn(
			"permitDrillingMobilePhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> wellDrillingHomePhone =
		createColumn(
			"wellDrillingHomePhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingWorkLocation = createColumn(
			"permitDrillingWorkLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingLocation = createColumn(
			"permitDrillingLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> permitDrillingNature =
		createColumn(
			"permitDrillingNature", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingContractorName = createColumn(
			"permitDrillingContractorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillContractAddress = createColumn(
			"permitDrillContractAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingContractorAdd = createColumn(
			"permitDrillingContractorAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> permitDrillingPurpose =
		createColumn(
			"permitDrillingPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingBoreholeDepth = createColumn(
			"permitDrillingBoreholeDepth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingDiameterBorehole = createColumn(
			"permitDrillingDiameterBorehole", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> permitDrillingMethod =
		createColumn(
			"permitDrillingMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingConstMethod = createColumn(
			"permitDrillingConstMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingSupplies = createColumn(
			"permitDrillingSupplies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingTechnicalInfo = createColumn(
			"permitDrillingTechnicalInfo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String> permitDrillingCubic =
		createColumn(
			"permitDrillingCubic", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		permitDrillingAuthority = createColumn(
			"permitDrillingAuthority", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, String>
		applicantSignaturePermitBtn = createColumn(
			"applicantSignaturePermitBtn", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Date> permitDrillingSignDate =
		createColumn(
			"permitDrillingSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PermitToDrillAWellTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PermitToDrillAWellTable() {
		super("nbp_wra_drill_well_info", PermitToDrillAWellTable::new);
	}

}