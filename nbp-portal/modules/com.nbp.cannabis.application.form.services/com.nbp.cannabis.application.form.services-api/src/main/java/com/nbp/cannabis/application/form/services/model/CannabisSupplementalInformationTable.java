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
 * The table class for the &quot;nbp_cannabis_supp_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformation
 * @generated
 */
public class CannabisSupplementalInformationTable
	extends BaseTable<CannabisSupplementalInformationTable> {

	public static final CannabisSupplementalInformationTable INSTANCE =
		new CannabisSupplementalInformationTable();

	public final Column<CannabisSupplementalInformationTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Long>
		cannabisSupplementalInfoId = createColumn(
			"cannabisSupplementalInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisSupplementalInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, String>
		supplementInfoQuestion = createColumn(
			"supplementInfoQuestion", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, String> answer =
		createColumn(
			"answer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupplementalInformationTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisSupplementalInformationTable() {
		super(
			"nbp_cannabis_supp_info",
			CannabisSupplementalInformationTable::new);
	}

}