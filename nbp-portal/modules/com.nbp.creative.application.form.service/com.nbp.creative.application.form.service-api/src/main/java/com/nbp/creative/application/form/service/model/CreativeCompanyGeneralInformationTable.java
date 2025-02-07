/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_company_gen_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformation
 * @generated
 */
public class CreativeCompanyGeneralInformationTable
	extends BaseTable<CreativeCompanyGeneralInformationTable> {

	public static final CreativeCompanyGeneralInformationTable INSTANCE =
		new CreativeCompanyGeneralInformationTable();

	public final Column<CreativeCompanyGeneralInformationTable, Long>
		creativeCompanyGeneralInfoId = createColumn(
			"creativeCompanyGeneralInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyGeneralInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, String>
		HaveYouRecievedAny = createColumn(
			"HaveYouRecievedAny", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		mprsStartDate = createColumn(
			"mprsStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		mprsEndDate = createColumn(
			"mprsEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		mttStartDate = createColumn(
			"mttStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Date>
		mttEndDate = createColumn(
			"mttEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyGeneralInformationTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyGeneralInformationTable() {
		super(
			"nbp_creative_company_gen_info",
			CreativeCompanyGeneralInformationTable::new);
	}

}