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
 * The table class for the &quot;nbp_hsra_purpose_regst&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicence
 * @generated
 */
public class PurposeOfPropLicenceTable
	extends BaseTable<PurposeOfPropLicenceTable> {

	public static final PurposeOfPropLicenceTable INSTANCE =
		new PurposeOfPropLicenceTable();

	public final Column<PurposeOfPropLicenceTable, Long>
		purposeOfPropLicenceId = createColumn(
			"purposeOfPropLicenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PurposeOfPropLicenceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String> nuclearRegstLic =
		createColumn(
			"nuclearRegstLic", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String>
		nuclearBusinessPlace = createColumn(
			"nuclearBusinessPlace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String>
		nuclearActivityMainAdd = createColumn(
			"nuclearActivityMainAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String> applicationType =
		createColumn(
			"applicationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, String>
		nuclearAdditionalLoc = createColumn(
			"nuclearAdditionalLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PurposeOfPropLicenceTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PurposeOfPropLicenceTable() {
		super("nbp_hsra_purpose_regst", PurposeOfPropLicenceTable::new);
	}

}