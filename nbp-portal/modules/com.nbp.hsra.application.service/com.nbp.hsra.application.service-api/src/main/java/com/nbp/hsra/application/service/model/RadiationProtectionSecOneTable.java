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
 * The table class for the &quot;nbp_hsra_rad_section_one&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOne
 * @generated
 */
public class RadiationProtectionSecOneTable
	extends BaseTable<RadiationProtectionSecOneTable> {

	public static final RadiationProtectionSecOneTable INSTANCE =
		new RadiationProtectionSecOneTable();

	public final Column<RadiationProtectionSecOneTable, Long>
		radiationProtectSecOneId = createColumn(
			"radiationProtectSecOneId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationProtectionSecOneTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, String> currentAuthNum =
		createColumn(
			"currentAuthNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, String>
		reasonForAmendment = createColumn(
			"reasonForAmendment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, String>
		typeOfApplication = createColumn(
			"typeOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationProtectionSecOneTable, Long>
		hsraApplicationId = createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationProtectionSecOneTable() {
		super("nbp_hsra_rad_section_one", RadiationProtectionSecOneTable::new);
	}

}