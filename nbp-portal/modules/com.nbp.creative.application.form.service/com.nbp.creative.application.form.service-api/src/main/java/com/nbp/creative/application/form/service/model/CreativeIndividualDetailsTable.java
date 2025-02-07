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
 * The table class for the &quot;nbp_creative_individual_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetails
 * @generated
 */
public class CreativeIndividualDetailsTable
	extends BaseTable<CreativeIndividualDetailsTable> {

	public static final CreativeIndividualDetailsTable INSTANCE =
		new CreativeIndividualDetailsTable();

	public final Column<CreativeIndividualDetailsTable, Long>
		creativeIndividualDetailsId = createColumn(
			"creativeIndividualDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeIndividualDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String>
		sectorOfPractice = createColumn(
			"sectorOfPractice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> middleName =
		createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> lastName =
		createColumn(
			"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> city =
		createColumn("city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> country =
		createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> sex =
		createColumn("sex", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> cell =
		createColumn("cell", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> areYouStudent =
		createColumn(
			"areYouStudent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> companyEmail =
		createColumn(
			"companyEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, String> companyWebsite =
		createColumn(
			"companyWebsite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeIndividualDetailsTable() {
		super(
			"nbp_creative_individual_detail",
			CreativeIndividualDetailsTable::new);
	}

}