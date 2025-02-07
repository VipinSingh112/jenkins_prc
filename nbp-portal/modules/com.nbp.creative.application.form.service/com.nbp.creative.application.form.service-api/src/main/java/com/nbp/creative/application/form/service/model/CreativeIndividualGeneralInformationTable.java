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
 * The table class for the &quot;nbp_creative_indi_general_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformation
 * @generated
 */
public class CreativeIndividualGeneralInformationTable
	extends BaseTable<CreativeIndividualGeneralInformationTable> {

	public static final CreativeIndividualGeneralInformationTable INSTANCE =
		new CreativeIndividualGeneralInformationTable();

	public final Column<CreativeIndividualGeneralInformationTable, Long>
		creativeIndiGeneralInfoId = createColumn(
			"creativeIndiGeneralInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeIndividualGeneralInformationTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, String>
		profile = createColumn(
			"profile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualGeneralInformationTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeIndividualGeneralInformationTable() {
		super(
			"nbp_creative_indi_general_info",
			CreativeIndividualGeneralInformationTable::new);
	}

}